
public class Elektronik {

    protected String merk;
    protected int dayaListrik;

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setDayaListrik(int daya) {
        this.dayaListrik = daya;
    }

    public void cetakInformasi() {
        System.out.println("Merk\t\t: " + merk);
        System.out.println("Daya Listrik\t: " + dayaListrik + " Watt");
    }
}
