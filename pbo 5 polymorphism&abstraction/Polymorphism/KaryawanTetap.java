public class KaryawanTetap extends Karyawan {
    private double tunjangan;

    public KaryawanTetap(String nama, double gajiPokok, double tunjangan) {
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
    }

    @Override
    public double hitungGajiTotal() {
        return gajiPokok + tunjangan;
    }
}
