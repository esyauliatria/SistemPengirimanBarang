public abstract class Pengiriman implements DapatDilacak {
    private String nomorResi;
    private double beratBarangKg;
    private double jarakKm;
    private String status;

    public Pengiriman(String nomorResi, double beratBarangKg, double jarakKm) {
        setNomorResi(nomorResi);
        setBeratBarangKg(beratBarangKg);
        setJarakKm(jarakKm);
        this.status = "Diproses di Gudang";
    }

    // Abstract method untuk Polymorphism
    public abstract double hitungBiaya();

    // Encapsulation & Business Rule Validation
    public void setNomorResi(String nomorResi) {
        if (nomorResi == null || nomorResi.trim().isEmpty()) {
            throw new IllegalArgumentException("Nomor resi tidak boleh kosong!");
        }
        this.nomorResi = nomorResi;
    }

    public void setBeratBarangKg(double beratBarangKg) {
        if (beratBarangKg <= 0) {
            throw new IllegalArgumentException("Berat barang harus lebih besar dari 0 kg!");
        }
        this.beratBarangKg = beratBarangKg;
    }

    public void setJarakKm(double jarakKm) {
        if (jarakKm < 0) {
            throw new IllegalArgumentException("Jarak pengiriman tidak boleh bernilai negatif!");
        }
        this.jarakKm = jarakKm;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNomorResi() {
        return nomorResi;
    }

    public double getBeratBarangKg() {
        return beratBarangKg;
    }

    public double getJarakKm() {
        return jarakKm;
    }

    public String getStatus() {
        return status;
    }

    public String getInfoPengiriman() {
        return "Resi: " + nomorResi + " | Berat: " + beratBarangKg + " kg | Jarak: " + jarakKm + " km";
    }
}