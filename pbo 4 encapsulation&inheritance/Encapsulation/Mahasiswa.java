package encapsulation;

public class Mahasiswa {
    private String nama;
    private int umur;
    private String nim;

    public Mahasiswa(String nama, int umur, String nim) {
        this.nama = nama;
        this.umur = umur;
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setUmur(int umur) {
        if (umur > 0) {
            this.umur = umur;
        } else {
            System.out.println("Umur tidak valid!");
        }
    }

    public int getUmur() {
        return umur;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void tampilkanData() {
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
        System.out.println("NIM  : " + nim);
    }
}

