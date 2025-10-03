public class Staf implements BonusTahunan {
    @Override
    public double hitungBonusTahunan(double gajiPokok) {
        return gajiPokok * 0.2;
    }
}
