import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean check = true;

        while (check) {
            System.out.println("Enter first word:");
            String word1 = sc.nextLine();

            System.out.println("Enter second word:");
            String word2 = sc.nextLine();

            // System.out.println(word1);
            // System.out.println(word2);

            if (word1.charAt(0) == word2.charAt(0)) {
                System.out.println("Bingo");
                check = false;
            }
            else
                System.out.println("Try Again");
                System.out.println("");
    }
        }
        

}