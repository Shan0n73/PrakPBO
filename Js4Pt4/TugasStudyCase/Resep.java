package Js4Pt4.TugasStudyCase;

public class Resep {

    private String namaObat;
    private String dosis;

    public Resep(String namaObat, String dosis) {
        this.namaObat = namaObat;
        this.dosis = dosis;
    }

    public String getDetailResep() {
        return "obat " + namaObat + "dengan dosis " + dosis;
    }
}
