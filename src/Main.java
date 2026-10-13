public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEM PENGIRIMAN BARANG (PBO PENS) ===\n");

        // Inisialisasi Object Pelanggan dan Kurir (Relasi Antar Object)
        Pelanggan p1 = new Pelanggan("Budi Santoso", "Jl. A. Yani No. 10, Surabaya");
        Pelanggan p2 = new Pelanggan("Siti Aminah", "Jl. Trunojoyo No. 45, Sumenep");
        
        Kurir k1 = new Kurir("Joko (Kurir Reguler)", "081234567890");
        Kurir k2 = new Kurir("Agus (Kurir Express)", "089876543210");

        // Polimorfisme: Array bertipe Superclass (Pengiriman) menampung Subclass
        Pengiriman[] daftarPengiriman = new Pengiriman[3];
        
        daftarPengiriman[0] = new PengirimanReguler("REG-001", 2.5, 15.0, true);
        daftarPengiriman[1] = new PengirimanKilat("KILAT-001", 1.0, 30.0, 10000.0);
        daftarPengiriman[2] = new PengirimanReguler("REG-002", 5.0, 8.0, false);

        // Fitur Kreatif: Mengubah status transaksi secara dinamis
        daftarPengiriman[0].setStatus("Sedang Dibawa Kurir");
        daftarPengiriman[1].setStatus("Tiba di Kota Tujuan");

        // Skenario Pengujian (Minimal 3 Object digunakan dengan Polymorphism)
        for (int i = 0; i < daftarPengiriman.length; i++) {
            System.out.println("--- Transaksi Pengiriman ke-" + (i + 1) + " ---");
            if (i == 0) {
                System.out.println("Pelanggan: " + p1.getInfoPelanggan());
                System.out.println("Kurir    : " + k1.getInfoKurir());
            } else {
                System.out.println("Pelanggan: " + p2.getInfoPelanggan());
                System.out.println("Kurir    : " + k2.getInfoKurir());
            }
            
            System.out.println(daftarPengiriman[i].getInfoPengiriman());
            System.out.println(daftarPengiriman[i].lacakStatus());
            System.out.printf("Total Biaya Pengiriman: Rp %,.2f\n\n", daftarPengiriman[i].hitungBiaya());
        }

        // Pengujian Validasi Bisnis (Exception Handling)
        System.out.println("=== UJI COBA VALIDASI BISNIS ===");
        try {
            Pengiriman invalidCheck = new PengirimanReguler("ERR-999", -2.0, 10.0, false);
        } catch (IllegalArgumentException e) {
            System.out.println("Validasi Berhasil Menangkap Error: " + e.getMessage());
        }
    }
}