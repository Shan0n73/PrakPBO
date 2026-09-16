public class TestBioskop {
    public static void main(String[] args) {
        Tiket tiket1 = new Tiket("Avengers: Endgame", -50000);
        Tiket tiket2 = new Tiket("Chainsawman: Reze Arc", 75000);
        Tiket tiket3 = new Tiket("Resident Evil", 55000);

        System.out.println("Film\t\t: " + tiket1.getJudulFilm());
        System.out.println("Harga Tiket\t: " + tiket1.getHargaDasar());
        System.out.println("Status Lunas?\t" + tiket1.isStatusPembayaran());

        System.out.println("\nMemproses pembayaran...");
        tiket1.lakukanPembayaran();
        System.out.println("Status Lunas Terbaru? " + tiket1.isStatusPembayaran());

        System.out.println("\nFilm\t\t: " + tiket2.getJudulFilm());
        System.out.println("Harga Tiket\t: " + tiket2.getHargaDasar());
        System.out.println("Status Lunas?\t" + tiket2.isStatusPembayaran());

        System.out.println("\nMemproses pembayaran...");
        tiket2.lakukanPembayaran();
        System.out.println("Status Lunas Terbaru? " + tiket2.isStatusPembayaran());

        System.out.println("\nFilm\t\t: " + tiket3.getJudulFilm());
        System.out.println("Harga Tiket\t: " + tiket3.getHargaDasar());
        System.out.println("Status Lunas?\t" + tiket3.isStatusPembayaran());

        System.out.println("\nMemproses pembayaran...");
        tiket3.lakukanPembayaran();
        System.out.println("Status Lunas Terbaru? " + tiket3.isStatusPembayaran());
    }
}