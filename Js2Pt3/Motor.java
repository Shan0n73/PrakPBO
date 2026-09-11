
public class Motor {

    private int kecepatan = 0;
    private boolean kontakOn = false;

    public void nyalakanMesin() {
        kontakOn = true;
    }

    public void matikanMesin() {
        kontakOn = false;
        kecepatan = 0;
    }

    public void tambahKecepatan() {
        if (kontakOn == true) {
            kecepatan += 10;
            if (kecepatan > 100) {
                kecepatan = 100;
                System.out.println("Kecepatan maksimal adalah 100!\n");
            }
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off");
        }
    }

    public void kurangiKecepatan() {
        if (kontakOn == true) {
            kecepatan -= 10;
        } else {
            System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off");
        }
    }

    public void printStatus() {
        if (kontakOn) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    }
}
