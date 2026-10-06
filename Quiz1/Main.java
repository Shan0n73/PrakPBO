package Quiz1;

public class Main {

    public static void main(String[] args) {
        Roket rkt = new Roket("Jet", 9000);
        Generator gnt = new Generator(5000, 110);
        SpaceShuttle ss = new SpaceShuttle("Apollo99", 3500, rkt, gnt);

        System.out.println("Kode Shuttle\t\t: " + ss.getKode());
        System.out.println("Tipe Roket\t\t: " + ss.getRoketUtama().getTipe());
        System.out.println("Voltase generator\t: " + ss.GeneratorUtama().getVoltase());
    }
}
