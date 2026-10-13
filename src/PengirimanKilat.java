public class PengirimanKilat extends Pengiriman {
    private double extraBiayaPrioritas;
    private static final double TARIF_KILAT_PER_KG_KM = 1200.0;

    public PengirimanKilat(String nomorResi, double beratBarangKg, double jarakKm, double extraBiayaPrioritas) {
        super(nomorResi, beratBarangKg, jarakKm);
        this.extraBiayaPrioritas = extraBiayaPrioritas;
    }

    @Override
    public double hitungBiaya() {
        double biayaDasar = getBeratBarangKg() * getJarakKm() * TARIF_KILAT_PER_KG_KM;
        return biayaDasar + extraBiayaPrioritas;
    }

    @Override
    public String lacakStatus() {
        return "Paket KILAT EXPRESS [" + getNomorResi() + "] Status: " + getStatus() + " (Prioritas Utama - Estimasi tiba 1 hari)";
    }
}