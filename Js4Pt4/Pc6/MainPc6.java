package Js4Pt4.Pc6;

public class MainPc6 {

    public static void main(String[] args) {
        Laptop laptop = new Laptop("Thinkpad");
        Printer printer = new Printer("Epson L3110");
        laptop.cetakDokumen(printer, "Laporan.pdf");
    }
}
