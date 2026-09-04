public class TestMahasiswa {
    public static void main(String[] args){
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();

        mhs1.nim = 101;
        mhs1.nama = "Cornelius B.";
        mhs1.alamat = "Jl. Pegangsaan Timur No. 56";
        mhs1.kelas = "A";
        mhs1.tampilBiodata();
        
        mhs2.nim = 102;
        mhs2.nama = "Alexander G.";
        mhs2.alamat = "Jl. Soekarno Hatta No. 12";
        mhs2.kelas = "B";
        mhs2.tampilBiodata();
    }
}
