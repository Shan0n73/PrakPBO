package Js6Pt7.Task;

public class Segitiga {

    private int sudut;

    public int totalSudut(int sudutA) {
        sudut = 180 - sudutA;
        return sudut;
    }

    public int totalSudut(int sudutA, int sudutB) {
        sudut = 180 - (sudutA + sudutB);
        return sudut;
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    public double keliling(int sisiA, int sisiB) {
        return Math.sqrt((sisiA * sisiA) + (sisiB * sisiB));
    }

    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();
        System.out.println("Total sudutnya adalah " + segitiga.totalSudut(90));
        System.out.println("Total sudutnya adalah " + segitiga.totalSudut(90, 30));
        System.out.println("Kelilingnya adalah " + segitiga.keliling(5, 6, 7) + "(menggunakan 3 sisi)");
        System.out.println("Kelilingnya adalah " + segitiga.keliling(3, 4) + "(2 sisi)");
    }
}
