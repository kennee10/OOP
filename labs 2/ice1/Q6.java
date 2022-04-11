import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string:");
        String input1 = sc.nextLine();
        System.out.print("Enter the second string:");
        String input2 = sc.nextLine();
        System.out.println();

        if (matchStrings(input1, input2)) {
            System.out.println("There is an alignment as shown above.");
        } else {
            System.out.println("No alignment can be found.");
        }
    }

    // This method returns true if str2 can be aligned with str1 
    // and false otherwise. If there is an alignment, this method 
    // also prints out the alignment. See the sample runs of the 
    // program for exact output of this method.
    public static boolean matchStrings(String str1, String str2) {
        
        // Hashmap (initializing)
        Map<Character, Integer> map = new HashMap<>();
        int currIndex = 0;
        boolean match = false;

        // Iterate char in string
        for (int i=0; i < str2.length(); i++) {
            char currChar_str2 = str2.charAt(i);

            for (int j = currIndex; j < str1.length(); j++) {
                if (currChar_str2 == str1.charAt(j)) {

                    if (i == str2.length()-1) {
                        match = true;
                    }
                    map.put(currChar_str2, j);
                    currIndex = j+1;
                }
            }
        }

        // System.out.println(map);
        return match;
    }

}
