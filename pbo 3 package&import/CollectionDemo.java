import java.util.ArrayList;
import java.util.HashMap;

public class CollectionDemo {
    public static void main(String[] args) {
        // Array
        String[] buah = {"Apel", "Jeruk", "Mangga"};
        System.out.println("Daftar Buah:");
        for (String b : buah) {
            System.out.println("- " + b);
        }

        // ArrayList
        ArrayList<String> hewan = new ArrayList<>();
        hewan.add("Kucing");
        hewan.add("Anjing");
        hewan.add("Burung");
        System.out.println("\nDaftar Hewan:");
        for (String h : hewan) {
            System.out.println("- " + h);
        }

        // HashMap
        HashMap<String, Integer> nilai = new HashMap<>();
        nilai.put("Budi", 90);
        nilai.put("Ani", 85);
        nilai.put("Sinta", 95);

        System.out.println("\nDaftar Nilai:");
        for (String nama : nilai.keySet()) {
            System.out.println(nama + " : " + nilai.get(nama));
        }
    }
}
