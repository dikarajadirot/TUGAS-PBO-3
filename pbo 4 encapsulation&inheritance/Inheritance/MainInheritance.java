package Inheritance;
public class MainInheritance {
    public static void main(String[] args) {
        Kucing kucing1 = new Kucing("Luna");

        kucing1.makan();      // dari class Hewan
        kucing1.menyusui();   // dari class Mamalia
        kucing1.suara();      // dari class Kucing
    }
}
