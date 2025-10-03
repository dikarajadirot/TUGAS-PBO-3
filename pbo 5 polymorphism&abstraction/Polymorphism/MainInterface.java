public class MainInterface {
    public static void main(String[] args) {
        BonusTahunan manajer = new Manajer();
        BonusTahunan staf = new Staf();

        System.out.println("Bonus Manajer: " + manajer.hitungBonusTahunan(10000000));
        System.out.println("Bonus Staf: " + staf.hitungBonusTahunan(5000000));
    }
}
