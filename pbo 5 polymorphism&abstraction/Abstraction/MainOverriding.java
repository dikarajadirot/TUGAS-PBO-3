public class MainOverriding {
    public static void main(String[] args) {
        Pegawai p1 = new PegawaiTetap("Dika", 5000000);
        Pegawai p2 = new PegawaiKontrak("Lina", 6);

        p1.tampilkanInfo();
        System.out.println("Bonus: " + p1.hitungBonus());

        p2.tampilkanInfo();
        System.out.println("Bonus: " + p2.hitungBonus());
    }
}
