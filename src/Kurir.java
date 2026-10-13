public class Kurir {
    private String namaKurir;
    private String nomorTelepon;

    public Kurir(String namaKurir, String nomorTelepon) {
        this.namaKurir = namaKurir;
        this.nomorTelepon = nomorTelepon;
    }

    public String getInfoKurir() {
        return namaKurir + " (" + nomorTelepon + ")";
    }
}