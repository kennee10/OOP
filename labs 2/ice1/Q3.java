import java.lang.reflect.Array;
import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence:");
        String sentence = sc.nextLine();

        // String split
        String[] wordList = sentence.split(" ");
        // ForLoop: using int i
        // Array length / size
        for (int i = wordList.length - 1; i >= 0; i--) {
            System.out.print(wordList[i] + " ");
        }
    }
}