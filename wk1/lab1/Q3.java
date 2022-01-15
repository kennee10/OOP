import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sentence:");
        String sentence = sc.nextLine();

        String[] arrOfSentence = sentence.split(" ");

        String newSentence = "";

        for (int i = arrOfSentence.length-1; i > 0; i--) {
            newSentence += arrOfSentence[i] + " ";
        }
        newSentence += arrOfSentence[0];
        System.out.println(newSentence);
    }
}