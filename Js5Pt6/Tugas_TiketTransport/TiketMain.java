package Js5Pt6.Tugas_TiketTransport;

public class TiketMain {

    public static void main(String[] args) {
        // Dengan konstruktor tanpa parameter
        TiketKereta tk = new TiketKereta();
        tk.kodeTiket = "KA-001";
        tk.namaPenumpang = "Andi";
        tk.asal = "Malang";
        tk.tujuan = "Jakarta";
        tk.hargaDasar = 350000;
        tk.nomorGerbong = 3;
        tk.nomorKursi = "12A";
        tk.tampilKereta();

        // Dengan konstruktor berparameter
        TiketDomestik td = new TiketDomestik("GA-102", "Sinta", "Surabaya", "Denpasar", 900000, "Garuda Indonesia", 25, 75000);
        td.tampilDomestik();

        TiketInternasional ti = new TiketInternasional("SQ-205", "Budi", "Jakarta", "Singapura", 2500000, "Singapore Airlines", 20, "C1234567", 150000);
        ti.tampilInternasional();
    }
}
