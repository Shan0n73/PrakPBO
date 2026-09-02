
public class PrakDemo {

    public static void main(String[] args) {

        KipasAngin kipas = new KipasAngin();
        kipas.setMerk("Turbo");
        kipas.setDayaListrik(45);
        kipas.setKecepatan(3);
        kipas.toggleSwing();
        kipas.cetakInformasi();
        System.out.println();

        Lampu lampu = new Lampu();
        lampu.setMerk("Philips");
        lampu.setDayaListrik(10);
        lampu.setWarnaCahaya("Warm White");
        lampu.setTingkatKecerahan(80);
        lampu.cetakInformasi();
        System.out.println();

        Laptop laptop = new Laptop();
        laptop.setProcessor("Intel i5");
        laptop.setRamSize(16);
        laptop.setStorageSize(512);
        laptop.cetakInformasi();

        Figurin figurin = new Figurin();
        figurin.setNamaKarakter("Starscream");
        figurin.setTinggi(12);
        figurin.setBahan("Plastik");
        figurin.cetakInformasi();
    }
}
