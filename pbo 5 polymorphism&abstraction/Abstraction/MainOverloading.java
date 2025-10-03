public class MainOverloading {
    public static void main(String[] args) {
        HitungGaji h = new HitungGaji();

        System.out.println("Gaji tanpa tunjangan: " + h.gaji(3000000));
        System.out.println("Gaji + Tunjangan: " + h.gaji(3000000, 500000));
        System.out.println("Gaji + Tunjangan + Bonus: " + h.gaji(3000000, 500000, 1000000));
    }
}
