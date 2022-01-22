public class CaloriesCalculatorTest {
    public static void main(String[] args) {

        NewYearGoodie tart = new NewYearGoodie("Pineapple Tarts", 82.5, 20);
        NewYearGoodie bakKwa = new NewYearGoodie("Bak Kwa", 115, 28);
        NewYearGoodie loveLetters = new NewYearGoodie("Love Letters", 56.5, 13);

        System.out.println("Pineapple Tarts is more sinful than Bak Kwa:" + tart.isMoreSinful(bakKwa));
    }
}
