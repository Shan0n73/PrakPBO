public class TestLingkaran {

    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran();
        Lingkaran l2 = new Lingkaran();
        Lingkaran l3 = new Lingkaran();

        l1.jariJari = 7.0;
        l2.jariJari = 10.0;
        l3.jariJari = 40.0;

        System.out.println("Jari-jari Lingkaran\t: " + l1.jariJari);
        System.out.println("Luas Lingkaran\t\t: " + l1.hitungLuas());
        System.out.println("Keliling Lingkaran\t: " + l1.hitungKeliling());

        System.out.println("\nJari-jari Lingkaran\t: " + l2.jariJari);
        System.out.println("Luas Lingkaran\t\t: " + l2.hitungLuas());
        System.out.println("Keliling Lingkaran\t: " + l2.hitungKeliling());

        System.out.println("\nJari-jari Lingkaran\t: " + l3.jariJari);
        System.out.println("Luas Lingkaran\t\t: " + l3.hitungLuas());
        System.out.println("Keliling Lingkaran\t: " + l3.hitungKeliling());
    }
}
