package LatihanPolimorfis;

public class Manusia {

    public void MakanBuah(Buah x) {
        if (x instanceof Apel) {
            System.out.println("\nApel langsung dimakan.");
            ((Apel) x).TampilkanBiji();
        } else if (x instanceof Pisang) {
            System.out.println("\nPisang dikupas terlebih dahulu.");
            ((Pisang) x).TampilkanKulit();
        } else if (x instanceof Durian) {
            System.out.println("\nDurian harus dibelah dulu kulitnya.");
            ((Durian)x).TampilkanCiri();
        }

        System.out.println("Rasanya " + x.Rasa + ".");
        System.out.println("Kandungan airnya " + x.KandunganAir + "% dari buahnya.");
    }
}
