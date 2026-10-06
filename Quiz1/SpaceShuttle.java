package Quiz1;

public class SpaceShuttle {

    private String kode;
    private int berat;
    private Roket roketUtama;
    private Generator generatorUtama;

    public SpaceShuttle(String kode, int berat, Roket roketUtama, Generator generatorUtama) {
        this.kode = kode;
        this.berat = berat;
        this.roketUtama = roketUtama;
        this.generatorUtama = generatorUtama;
    }

    public String getKode() {
        return kode;
    }

    public int getBerat() {
        return berat;
    }

    public Roket getRoketUtama() {
        return roketUtama;
    }

    public Generator GeneratorUtama() {
        return generatorUtama;
    }
}
