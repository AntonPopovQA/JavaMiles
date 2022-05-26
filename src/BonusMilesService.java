public class BonusMilesService {
    public int calculate(int cost) {
        int price = 10_000;
        int bonusMiles = 20;

        int miles = price / bonusMiles;

        return miles;
    }
}
