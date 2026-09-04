public class TestBarang {
    public static void main(String[] args){
        Barang brg1 = new Barang();
        Barang brg2 = new Barang();

        brg1.namaBrg = "Pensil";
        brg1.jenisBrg = "ATK";
        brg1.stok = 10;
        brg1.tampilBarang();
        
        brg2.namaBrg = "Pena";
        brg2.jenisBrg = "ATK";
        brg2.stok = 15;
        brg2.tampilBarang();

        System.out.println("\nStok baru " + brg1.namaBrg + " : " + brg1.tambahStok(15));
        System.out.println("Stok baru " + brg2.namaBrg + " : " + brg2.tambahStok(10));
    }
}
