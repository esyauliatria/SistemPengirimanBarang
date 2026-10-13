public class PengirimanReguler extends Pengiriman {
    private boolean pakaiAsuransi;
    private static final double TARIF_PER_KG_KM = 500.0;

    public PengirimanReguler(String nomorResi, double beratBarangKg, double jarakKm, boolean pakaiAsuransi) {
        super(nomorResi, beratBarangKg, jarakKm);
        this.pakaiAsuransi = pakaiAsuransi;
    }

    @Override
    public double hitungBiaya() {
        double biayaDasar = getBeratBarangKg() * getJarakKm() * TARIF_PER_KG_KM;
        if (pakaiAsuransi) {
            biayaDasar += 15000;
        }
        return biayaDasar;
    }

    @Override
    public String lacakStatus() {
        return "Paket Reguler [" + getNomorResi() + "] Status: " + getStatus() + " (Estimasi tiba 3-5 hari)";
    }
}