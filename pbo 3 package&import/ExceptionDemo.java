import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Masukkan angka pertama: ");
            int a = input.nextInt();
            System.out.print("Masukkan angka kedua: ");
            int b = input.nextInt();

            int hasil = bagi(a, b);
            System.out.println("Hasil pembagian: " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("Error: Tidak bisa membagi dengan nol!");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            System.out.println("Program selesai dijalankan.");
        }

        input.close();
    }

    // method dengan throws
    static int bagi(int x, int y) throws ArithmeticException {
        if (y == 0) {
            throw new ArithmeticException("Pembagi tidak boleh nol!");
        }
        return x / y;
    }
}
