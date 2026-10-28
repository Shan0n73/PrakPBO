package Js9Pt10.interfaceLatihan;

public class Program {

    public static void main(String[] args) {
        Rektor pakRektor = new Rektor();
        Mahasiswa mhsBiasa = new Mahasiswa("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        Pascasarjana masterCumlaude = new Pascasarjana("Elok");


        // pakRektor.beriSertifikatCumlaude(mhsBiasa);
        // pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
        // pakRektor.beriSertifikatCumlaude(masterCumlaude);

        pakRektor.beriSertifikatMawapres(sarjanaCumlaude);
        pakRektor.beriSertifikatMawapres(masterCumlaude);
    }
}
