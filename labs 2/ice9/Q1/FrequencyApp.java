import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.ComponentInputMap;

public class FrequencyApp {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<> ();
        Scanner sc = new Scanner(System.in);
        boolean continue1 = true;
        
        while (continue1) {
            System.out.print("Enter the word> ");
            String word = sc.nextLine();

            if (word == "") {
                continue1 = false;
            } else {
                if (map.get(word) == null) {
                    map.put(word, 1);
                } else {
                    // map.get(word) += 1;
                    int val = map.get(word);
                    val += 1;
                    map.put(word, val);
                }
            }
        }
        System.out.println(map);
    }
}