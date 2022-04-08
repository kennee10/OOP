import java.util.*;
import java.io.*;

public class sumInt {
    public static void main(String[] args) {

        boolean finding_file = true;
        int total = 0;

        while (finding_file) {
            // ask for filename
            Scanner sc1 = new Scanner(System.in);
            System.out.print("Enter filename> ");
            String f = sc1.nextLine();

            try (Scanner sc = new Scanner(new File(f+".txt"));) {
                finding_file = false;
                while (sc.hasNext()) {
                    String str = sc.next();
                    total += Integer.parseInt(str);
                }
            } catch (FileNotFoundException e) {
                System.out.println(f + " is invalid");
            }
        }
        
        System.out.println("The sum is " + total);
    }
}
