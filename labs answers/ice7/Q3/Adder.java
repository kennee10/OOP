import java.util.Scanner;
import java.util.InputMismatchException;

public class Adder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;

        while (true) {
            System.out.print("Enter num 1> ");
            try {
                num1 = sc.nextInt();
                break;      //ok to use break if it helps to write cleaner, readable code. Recommended not to to overuse break
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number!\n");
                sc.next();  //to flush the buffer
            }
        }

        System.out.println();
        while (true) {
            System.out.print("Enter num 2> ");
            try {
                num2 = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number!\n");
                sc.next(); //to flush the buffer
            }
        }

        int sum = num1 + num2;

        System.out.println();
        System.out.println("The answer is " + sum);
    }
}
