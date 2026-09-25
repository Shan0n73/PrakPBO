package Js4Pt4.TugasStudyCase;

public class MainKlinik {

    public static void main(String[] args) {
        // 1. Inisialisasi Dokter
        Dokter dr = new Dokter("Chloe Pawapuwa", "Penyakit Dalam");

        // 2. Inisialisasi Pasien, harus ada RM karena Composition
        Pasien pasien1 = new Pasien("Reinhard", "RM-2026-004");

        // 3. Menyambungkan Pasien dengan Dokter pakai setter - Aggregation
        pasien1.setDokterPenanggungJawab(dr);

        // Update riwayat medis
        pasien1.getRekamMedis().setRiwayatPenyakit("Demam Tinggi");


        pasien1.info();
        System.out.println();

        // 4. Dokter Menulis Resep - Dependency
        Resep resepParacetamol = new Resep("Paracetamol", "3x1");
        dr.tulisResep(resepParacetamol, pasien1.getNama());
    }
}
