package Js4Pt4.Pc4;

public class MainPc4 {

    public static void main(String[] args) {
        Penumpang p1 = new Penumpang("12345", "Mr. Krab");
        Penumpang p2 = new Penumpang("99999", "Budi");

        Gerbong gerbong = new Gerbong("A", 10);
        gerbong.setPenumpang(p1, 1);
        gerbong.setPenumpang(p2, 1);


        System.out.println(gerbong.info());
    }
}
