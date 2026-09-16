import java.util.Scanner;

public class TestLogistik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nomor Resi\t\t: ");
        String resi = scanner.nextLine();
        System.out.print("Owner\t\t\t: ");
        String pemilik = scanner.nextLine();
        System.out.print("Max Cap (kg)\t\t: ");
        double kapasitas = scanner.nextDouble();

        Kontainer kontainer = new Kontainer(resi, pemilik, kapasitas);

        System.out.println("\n--- INFORMASI KONTAINER ---");
        System.out.println("Nama Pemilik\t\t: " + kontainer.getNamaPemilik());
        System.out.println("Kapasitas Maksimal\t: " + kontainer.getKapasitasMaksimal() + " kg");

        boolean selesai = false;
        while (!selesai) {
            System.out.println("\n--- OPERASIONAL LOGISTIK ---");
            System.out.println("1. Tambah Muatan");
            System.out.println("2. Turunkan Muatan");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi (1-3): ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan berat barang yang ditambah (kg): ");
                    double tambah = scanner.nextDouble();
                    kontainer.tambahMuatan(tambah);
                    System.out.println("Berat muatan saat ini: " + kontainer.getBeratMuatanSaatIni() + " kg");
                    break;
                case 2:
                    System.out.print("Masukkan berat barang yang diturunkan (kg): ");
                    double turun = scanner.nextDouble();
                    kontainer.turunkanMuatan(turun);
                    System.out.println("Berat muatan saat ini: " + kontainer.getBeratMuatanSaatIni() + " kg");
                    break;
                case 3:
                    selesai = true;
                    System.out.println("Sistem logistik ditutup.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
        scanner.close();
    }
}