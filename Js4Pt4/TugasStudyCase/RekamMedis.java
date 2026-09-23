package Js4Pt4.TugasStudyCase;

public class RekamMedis {

    private String nomorRM;
    private String riwayatPenyakit;

    public RekamMedis(String nomorRM) {
        this.nomorRM = nomorRM;
        this.riwayatPenyakit = "Belum Ada Catatan";
    }

    public void setRiwayatPenyakit(String riwayatPenyakit) {
        this.riwayatPenyakit = riwayatPenyakit;
    }

    public String getInfo() {
        return "No. RM: " + nomorRM + " | Riwayat: " + riwayatPenyakit;
    }
}
