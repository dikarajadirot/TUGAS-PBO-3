package encapsulation;

public class MainEncapsulation {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Dika", 20, "231511020");
        mhs1.setUmur(21);

        System.out.println("Nama Mahasiswa: " + mhs1.getNama());
        System.out.println("Umur Mahasiswa: " + mhs1.getUmur());
        System.out.println("NIM Mahasiswa : " + mhs1.getNim());

        mhs1.tampilkanData();
    }
}
