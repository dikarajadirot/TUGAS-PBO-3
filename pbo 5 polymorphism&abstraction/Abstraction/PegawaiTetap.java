public class PegawaiTetap extends Pegawai {
    private double gajiPokok;

    public PegawaiTetap(String nama, double gajiPokok) {
        super(nama);
        this.gajiPokok = gajiPokok;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Pegawai Tetap: " + nama + " | Gaji Pokok: " + gajiPokok);
    }

    @Override
    public double hitungBonus() {
        return gajiPokok * 0.1;
    }
}
