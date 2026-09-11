public class KoperasiDemo {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("Lihanna","Chekshino");
        System.out.println("Simpanan " + anggota1.getNama()+ ": Rp. "+anggota1.getSimpanan());

        anggota1.setNama("Lihanna von Arkheim");
        anggota1.setAlamat("Chekshino, Rusia");
        anggota1.setor(3000000);
        System.out.println("Simpanan " + anggota1.getNama()+ ": Rp. "+anggota1.getSimpanan());

        anggota1.pinjam(250000);
        System.out.println("Simpanan " + anggota1.getNama()+ ": Rp. "+anggota1.getSimpanan());
    }
}
