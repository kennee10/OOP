import java.util.*;
import java.io.*;

public class sumInt {
    public static void main(String[] args) {

        // ask for filename
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter filename> ");
        String f = sc1.nextLine();
        // check if its valid file
        // open file, sum
        // catch exceptions
        // finally close file
        try (Scanner sc = new Scanner(new File(f+".txt"));) {
            while (sc.hasNext()) {
                // String line = sc.nextLine();
                // String[] arr = line.split(",");
                // System.out.println(arr[0] + " | " + arr[1]);
                System.out.println("line");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
            // swallowing the exception
        } 
        
    }
    
}
