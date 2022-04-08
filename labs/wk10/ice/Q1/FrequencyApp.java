import java.io.Console;
import java.util.HashMap;
import java.util.Scanner;

public class FrequencyApp {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        Scanner sc = new Scanner(System.in);

        boolean isEmpty = true;
        while (isEmpty) {

            System.out.print("Enter the word> ");
            String word = sc.nextLine();
            if (word.isEmpty()) {
                isEmpty = false;
            } else {
                if (map.containsKey(word)) {
                    int currCount = map.get(word);
                    map.put(word, currCount+1);
                } else {
                    map.put(word, 1);
                }
            }
            // System.out.println(word);
        }
        System.out.println("");
        System.out.println("Frequency Count:");
        for (String key : map.keySet()) {
            System.out.printf("%d %s \n", map.get(key), key);
        }
    }
}