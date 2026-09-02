
public class KipasAngin extends Elektronik {

    private int kecepatan;
    private boolean swingStatus;

    public void setKecepatan(int speed) {
        this.kecepatan = speed;
    }

    public void toggleSwing() {
        this.swingStatus = !this.swingStatus;
    }

    @Override
    public void cetakInformasi() {
        System.out.println("=== KIPAS ANGIN ===");
        super.cetakInformasi();
        System.out.println("Kecepatan\t: " + kecepatan);
        System.out.println("Status Swing\t: " + (swingStatus ? "Aktif" : "Mati"));
    }
}
