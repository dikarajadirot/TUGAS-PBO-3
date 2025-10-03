public class KaryawanMagang extends Karyawan {
    private double uangTransport;

    public KaryawanMagang(String nama, double gajiPokok, double uangTransport) {
        super(nama, gajiPokok);
        this.uangTransport = uangTransport;
    }

    @Override
    public double hitungGajiTotal() {
        return gajiPokok + uangTransport;
    }
}
