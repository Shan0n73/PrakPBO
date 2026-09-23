package Js4Pt4.Pc4;

public class MainPc4 {

    public static void main(String[] args) {
        Penumpang p1 = new Penumpang("12345", "Mr. Krab");
        Penumpang p2 = new Penumpang("18732", "Van Helsing");
        Penumpang p3 = new Penumpang("23415", "Knox von Reinhaver");

        Gerbong gerbong1 = new Gerbong("A", 10);
        gerbong1.setPenumpang(p1, 1);
        gerbong1.setPenumpang(p2, 2);

        Gerbong gerbong2 = new Gerbong("B",10);
        gerbong2.setPenumpang(p3, 1);

        System.out.println(gerbong1.info());
        System.out.println(gerbong2.info());
    }
}
