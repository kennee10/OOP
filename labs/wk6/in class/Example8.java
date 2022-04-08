import java.util.*;
import java.io.*;

public class Example8 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new File("fruits.txt"));) {
            /*
            12,14,14
            12,14,14
            */
            // regular expression
            sc.useDelimiter(",|\n|\r\n");
            while (sc.hasNext()) {
                System.out.println(sc.next() +  " | " + sc.next());
            }
        } catch (FileNotFoundException e) {
            System.out.println("C");
            // swallowing the exception
        } 
        
    }
}
