public class Lingkaran {
    public double pi = 3.14;
    public double jariJari;

    public double hitungLuas() {
        return pi * jariJari * jariJari;
    }

    public double hitungKeliling() {
        return 2 * pi * jariJari;
    }
}