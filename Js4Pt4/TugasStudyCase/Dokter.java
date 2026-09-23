package Js4Pt4.TugasStudyCase;

public class Dokter {

    private String nama;
    private String spesialis;

    public Dokter(String nama, String spesialis) {
        this.nama = nama;
        this.spesialis = spesialis;
    }

    public String getNama() {
        return nama;
    }

    public String getSpesialis() {
        return spesialis;
    }

    // Relasi Dependency, resep cuma masuk dari parameter method ini
    public void tulisResep(Resep resep, String namaPasien) {
        System.out.println("Dokter " + nama + " meresepkan " + resep.getDetailResep() + " untuk " + namaPasien);
    }
}
