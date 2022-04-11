import java.util.*;

public class Adder {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        boolean num1num = true;
        boolean num2num = true;
        
        try {
            while (num1num) {
                System.out.print("Enter num 1> ");
                num1 = sc.nextInt();
                num1num = false;
            }
            
            sc.nextLine();

            while (num1num) {
                System.out.print("Enter num 2> ");
                num2 = sc.nextInt();
                num2num = false;
            }

        } catch (InputMismatchException e) {
            System.out.println("Please enter a number!");
        }

        int sum = num1 + num2;
        System.out.println("The answer is " + sum);
            
    }
}
