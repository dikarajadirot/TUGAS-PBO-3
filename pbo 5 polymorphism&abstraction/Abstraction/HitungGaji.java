public class HitungGaji {
    // Method 1: hanya gaji pokok
    public double gaji(double gajiPokok) {
        return gajiPokok;
    }

    // Method 2: gaji pokok + tunjangan
    public double gaji(double gajiPokok, double tunjangan) {
        return gajiPokok + tunjangan;
    }

    // Method 3: gaji pokok + tunjangan + bonus
    public double gaji(double gajiPokok, double tunjangan, double bonus) {
        return gajiPokok + tunjangan + bonus;
    }
}
