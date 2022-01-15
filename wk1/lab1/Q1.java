public class Q1 {

    public static int sumOfDigits(int number) {
        int sum = 0;

        System.out.println(number);
         
        while (number != 0)
        {
            sum = sum + number % 10;
            // System.out.println(sum);
            number = number/10;
            System.out.println(number);
            System.out.println("---");
        }

        if (sum > 0) {
            return sum;
        }
        else
            return -1 * sum;
    }
    public static void main(String[] args) {
        System.out.println("Test 1");
        int result = sumOfDigits(123);
        System.out.println("Expected:6");
        System.out.println("Actual  :" + result);
        System.out.println();

        System.out.println("Test 2");
        result = sumOfDigits(-354);
        System.out.println("Expected:12");
        System.out.println("Actual  :" + result);
        System.out.println();
    }
}
