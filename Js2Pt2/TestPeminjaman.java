public class TestPeminjaman {
    public static void main(String[] args){
        Peminjaman pmj1 = new Peminjaman();
        Peminjaman pmj2 = new Peminjaman();

        pmj1.idPeminjaman = 1001;
        pmj1.namaPeminjam = "Yudha Prayudhi";
        pmj1.namaGame = "Faeria Chronicle Online";
        pmj1.lamaPinjam = 3;
        pmj1.harga = 27000;
        pmj1.tampiDatalPeminjaman();
        pmj1.totalHarga();

        pmj2.idPeminjaman = 1002;
        pmj2.namaPeminjam = "Leonardo D.";
        pmj2.namaGame = "Galaxia Heroes: Chaos";
        pmj2.lamaPinjam = 2;
        pmj2.harga = 45000;
        pmj2.tampiDatalPeminjaman();
        pmj2.totalHarga();
    }
}