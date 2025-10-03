public class Pegawai {
    protected String nama;

    public Pegawai(String nama) {
        this.nama = nama;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Pegawai: " + nama);
    }

    public double hitungBonus() {
        return 0;
    }
}
