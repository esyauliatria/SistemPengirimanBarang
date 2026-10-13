public class Pelanggan {
    private String namaPelanggan;
    private String alamatTujuan;

    public Pelanggan(String namaPelanggan, String alamatTujuan) {
        this.namaPelanggan = namaPelanggan;
        this.alamatTujuan = alamatTujuan;
    }

    public String getInfoPelanggan() {
        return namaPelanggan + " - Tujuan: " + alamatTujuan;
    }
}