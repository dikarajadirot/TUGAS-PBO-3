public class MainAbstrak {
    public static void main(String[] args) {
        KaryawanTetap kt = new KaryawanTetap("Rina", 4000000, 1000000);
        KaryawanMagang km = new KaryawanMagang("Doni", 2000000, 500000);

        kt.tampilkanData();
        System.out.println("Gaji Total: " + kt.hitungGajiTotal());

        km.tampilkanData();
        System.out.println("Gaji Total: " + km.hitungGajiTotal());
    }
}
