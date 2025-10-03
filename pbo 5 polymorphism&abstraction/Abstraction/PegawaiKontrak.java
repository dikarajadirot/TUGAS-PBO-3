public class PegawaiKontrak extends Pegawai {
    private int lamaKontrak;

    public PegawaiKontrak(String nama, int lamaKontrak) {
        super(nama);
        this.lamaKontrak = lamaKontrak;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Pegawai Kontrak: " + nama + " | Lama Kontrak: " + lamaKontrak + " bulan");
    }

    @Override
    public double hitungBonus() {
        return lamaKontrak * 100000;
    }
}
