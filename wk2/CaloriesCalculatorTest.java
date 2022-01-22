public class CaloriesCalculatorTest {
    public static void main(String[] args) {

        NewYearGoodie tart = new NewYearGoodie("Pineapple Tarts", 82.5, 20);
        NewYearGoodie bakKwa = new NewYearGoodie("Bak Kwa", 115, 28);
        NewYearGoodie loveLetters = new NewYearGoodie("Love Letters", 56.5, 13);

        System.out.println("Pineapple Tarts is more sinful than Bak Kwa:" + tart.isMoreSinful(bakKwa));
        System.out.println();
        System.out.printf("Pineapple Tarts (calories per gram) :%.2f \n", tart.getCalories()/tart.getWeight());
        System.out.printf("Bak Kwa (calories per gram) :%.2f \n", bakKwa.getCalories()/bakKwa.getWeight());
        System.out.printf("Love Letters (calories per gram) :%.2f \n", loveLetters.getCalories()/loveLetters.getWeight());

        CaloriesCalculator calCalc = new CaloriesCalculator();
        calCalc.addNewYearGoodie(tart, 2);
        calCalc.addNewYearGoodie(bakKwa, 3);
        calCalc.addNewYearGoodie(loveLetters, 5);
        System.out.println();
        System.out.printf("Total Calories :%.2f \n", calCalc.getTotalCalories());
        System.out.println("Most sinful goodie :" + calCalc.getMostSinfulGoodie().getName());
    }
}
