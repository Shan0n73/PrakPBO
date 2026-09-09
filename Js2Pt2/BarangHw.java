public class BarangHw {

    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;

    public int hitungHargaJual() {
        float jumlahDiskon = (diskon / 100) * hargaDasar;
        return (int) (hargaDasar - jumlahDiskon);
    }

    public void tampilData() {
        System.out.println("\nKode Barang\t: " + kode);
        System.out.println("Nama Barang\t: " + namaBarang);
        System.out.println("Harga Dasar\t: Rp " + hargaDasar);
        System.out.println("Diskon\t\t: " + diskon + "%");
        System.out.println("Harga Jual\t: Rp " + hitungHargaJual());
    }
}

