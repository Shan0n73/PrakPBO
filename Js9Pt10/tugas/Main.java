package Js9Pt10.tugas;

public class Main {

    public static void main(String[] args) {
        Keledai keledai = new Keledai("Kedelai", 4, "Hiiik Hiiik", "Abu-Abu");
        Gorilla gorilla = new Gorilla("King", 4, "Ugh Ugh", "Hitam");
        Singa singa = new Singa("Sphinx", 4, "Gawr Gawr", "Oranye");

        keledai.displayData();
        gorilla.displayData();
        singa.displayData();
    }
  }