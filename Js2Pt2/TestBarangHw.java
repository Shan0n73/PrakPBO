
public class TestBarangHw {

    public static void main(String[] args) {
        BarangHw brg1 = new BarangHw();
        BarangHw brg2 = new BarangHw();
        BarangHw brg3 = new BarangHw();

        brg1.kode = "B001";
        brg1.namaBarang = "Keyboard Mekanik";
        brg1.hargaDasar = 750000;
        brg1.diskon = 25;
        brg1.tampilData();

        brg2.kode = "B002";
        brg2.namaBarang = "Drawing Pad";
        brg2.hargaDasar = 650000;
        brg2.diskon = 15;
        brg2.tampilData();

        brg3.kode = "B003";
        brg3.namaBarang = "Monitor 165Hz";
        brg3.hargaDasar = 1650000;
        brg3.diskon = 35;
        brg3.tampilData();
    }
}
