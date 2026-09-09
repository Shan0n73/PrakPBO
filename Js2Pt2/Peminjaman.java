public class Peminjaman {
    public int idPeminjaman;
    public String namaPeminjam;
    public String namaGame;
    public int lamaPinjam;
    public int harga;

    public void totalHarga() {
        int total = lamaPinjam * harga;
        System.out.println("Total Harga\t: " + total);
    }

    public void tampiDatalPeminjaman() {
        System.out.println("\nID Peminjaman\t: " + idPeminjaman);
        System.out.println("Nama Peminjam\t: " + namaPeminjam);
        System.out.println("Nama Game\t: " + namaGame);
        System.out.println("Lama Pinjam\t: " + lamaPinjam + " hari");
    }
}