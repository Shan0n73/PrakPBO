package LatihanInheritance.Exer1Televisi;

public class TelevisiModern extends Televisi {

    private String displayMode;
    private String dvd;

    public TelevisiModern(String mrk, int channelCount) {
        this.merk = mrk;
        this.jumlahChannel = channelCount;
        this.channelAktif = 1;
        this.dvd = "kosong";
    }

    public void gantiModusTampilan(String mode) {
        this.displayMode = mode;
    }

    public void changeDisplayMode(String mode) {
        gantiModusTampilan(mode);
    }

    public void masukkanDVD(String dvdTitle) {
        this.dvd = dvdTitle;
    }

    public void insertDVD(String dvdTitle) {
        masukkanDVD(dvdTitle);
    }

    public void mainkanDVD() {
        System.out.println("Sedang memainkan DVD: " + dvd);
    }

    public void playDVD() {
        mainkanDVD();
    }
}
