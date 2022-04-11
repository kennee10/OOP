import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyApp {
    public static void main(String[] args) {
        
        Scanner console = new Scanner(System.in);
        Map<String, Integer> wordCount = new HashMap<>();


        String input;
        System.out.print("Enter the word> ");
        while (!(input = console.nextLine()).isBlank()) {  //isBlank() method is introduced since java 11
            wordCount.put(input, wordCount.getOrDefault(input, 0) + 1);  //gets the value if existing, else the default used is 0
            
            System.out.print("Enter the word> ");
        }

        System.out.println();
        System.out.println("Frequency Count:");
        for (String key : wordCount.keySet()) {
            System.out.printf("%d %s\n", wordCount.get(key), key);
        }
    }

    
}
