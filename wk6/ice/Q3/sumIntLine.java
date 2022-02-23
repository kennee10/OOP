import java.util.*;
import java.io.*;

public class sumIntLine {
    public static void main(String[] args) {

        boolean finding_file = true;

        while (finding_file) {
            // ask for filename
            Scanner sc1 = new Scanner(System.in);
            System.out.print("Enter filename> ");
            String f = sc1.nextLine();

            try (Scanner sc = new Scanner(new File(f+".txt"));) {
                finding_file = false;
                // looping through lines
                while (sc.hasNext()) {
                    int total = 0;
                    String line = sc.nextLine();
                    
                    // looping numbers within a line
                    Scanner lineSc = new Scanner(line);
                    lineSc.useDelimiter(",");
                    while (lineSc.hasNext()) {
                        String str = lineSc.next();
                        total += Integer.parseInt(str);
                    }
                    System.out.println(total);
                }
            } catch (FileNotFoundException e) {
                System.out.println(f + " is invalid");
            }
        }
    }
}
