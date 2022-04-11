import java.util.*;

public class Q2 {
    
    public static void main(String[] args) {

        boolean continueLoop = true;
        Scanner sc = new Scanner(System.in);

        while (continueLoop) {
            System.out.print("Enter first word:");
            String word1 = sc.nextLine();

            System.out.print("Enter second word:");
            String word2 = sc.nextLine();

            // String indexing
            if (word1.charAt(0) == word2.charAt(0)) {
                System.out.println("Bingo");
                continueLoop = false;
            } else {
                System.out.println("try again");
                System.out.println("");
            }
        }
    }
}