package Js6Pt7.Task;

public class MainManusia {

    public static void main(String[] args) {
        // dynamic method dispatch
        Manusia m1 = new Dosen();
        Dosen d = new Dosen();
        Manusia m2 = new Mahasiswa();
        Mahasiswa m = new Mahasiswa();

        System.out.println("==== Method Dosen dengan Ref. Manusia ====");
        m1.bernafas();
        m1.makan(); // method makan() milik Dosen
        System.out.println("--------------------------------------");
        System.out.println("==== Method asli Dosen ====");
        d.lembur();

        System.out.println("\n==== Method Mahasiswa dengan Ref. Manusia ====");
        m2.bernafas();
        m2.makan(); // method makan() milik Mahasiswa
        System.out.println("--------------------------------------");
        System.out.println("==== Method asli Mahasiswa ====");
        m.tidur();
    }
}
