
public class Figurin {

    private String namaKarakter;
    private int tinggi;
    private String bahan;

    public void setNamaKarakter(String nama) {
        this.namaKarakter = nama;
    }

    public void setTinggi(int tinggiInput) {
        this.tinggi = tinggiInput;
    }

    public void setBahan(String bahanInput) {
        this.bahan = bahanInput;
    }

    public void cetakInformasi() {
        System.out.println("=== FIGURIN ===");
        System.out.println("Karakter\t: " + namaKarakter);
        System.out.println("Tinggi\t\t: " + tinggi + " cm");
        System.out.println("Bahan\t\t: " + bahan);
        System.out.println();
    }
}
