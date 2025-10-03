public abstract class Karyawan {
    protected String nama;
    protected double gajiPokok;

    public Karyawan(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    public abstract double hitungGajiTotal();

    public void tampilkanData() {
        System.out.println("Nama: " + nama + " | Gaji Pokok: " + gajiPokok);
    }
}
