package Inheritance;

public class Mamalia extends Hewan {
    public Mamalia(String nama) {
        super(nama);
    }

    public void menyusui() {
        System.out.println(nama + " adalah mamalia dan menyusui anaknya.");
    }
}
