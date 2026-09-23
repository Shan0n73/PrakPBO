package Js4Pt4.TugasStudyCase;

public class Pasien {

    private String nama;

    // Relasi Composition, RekamMedis diinstansiasikan ke Pasien
    private RekamMedis rekamMedis;

    // Relasi Aggregation, Dokter diterima dari luar
    private Dokter dokterPenanggungJawab;

    public Pasien(String nama, String nomorRM) {
        this.nama = nama;
        // ini penanda Composition, new dilakukan di dalam konstruktor Pasien
        this.rekamMedis = new RekamMedis(nomorRM);
    }

    // ini penanda Aggregation, Dokter di dapat dari luar pakai setter
    public void setDokterPenanggungJawab(Dokter dokter) {
        this.dokterPenanggungJawab = dokter;
    }

    public RekamMedis getRekamMedis() {
        return rekamMedis;
    }

    public String getNama() {
        return nama;
    }

    public void info() {
        System.out.println("====== DATA PASIEN ======");
        System.out.println("Nama Pasien\t: " + nama);
        System.out.println("Rekam Medis\t: " + rekamMedis.getInfo());
        if (dokterPenanggungJawab != null) {
            System.out.println("\n====== DATA DOKTER ======");
            System.out.println("Nama Dokter PJ\t: " + dokterPenanggungJawab.getNama());
            System.out.println("Spesialis\t: " + dokterPenanggungJawab.getSpesialis());
        } else {
            System.out.println("Dokter PJ   : Belum Ditentukan");
        }
    }
}
