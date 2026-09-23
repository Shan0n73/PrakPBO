package Js4Pt4.Pc6;

public class Laptop {

    private String merk;
    private Printer printer;

    public Laptop(String merk) {
        this.merk = merk;
    }

    public Laptop(String merk, Printer printer) {
        this.merk = merk;
        this.printer = printer;
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public void cetakDokumen(String namaFile) {
        if (printer != null) {
            System.out.println(merk + " mengirim dokumen ke printer " + printer.getMerk() + "...");
            printer.cetak(namaFile);
        } else {
            System.out.println("Printer belum terhubung ke " + merk + "!");
        }
    }
}
