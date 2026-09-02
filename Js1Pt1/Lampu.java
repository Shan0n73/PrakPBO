
public class Lampu extends Elektronik {

    private String warnaCahaya;
    private int tingkatKecerahan;

    public void setWarnaCahaya(String warna) {
        this.warnaCahaya = warna;
    }

    public void setTingkatKecerahan(int level) {
        this.tingkatKecerahan = level;
    }

    @Override
    public void cetakInformasi() {
        System.out.println("=== LAMPU ===");
        super.cetakInformasi();
        System.out.println("Warna Cahaya\t: " + warnaCahaya);
        System.out.println("Kecerahan\t: " + tingkatKecerahan + "%");
    }
}
