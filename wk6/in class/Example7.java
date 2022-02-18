import java.util.*;
import java.io.*;

public class Example7 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new File("fruits.txt"));) {
            while (sc.hasNext()) {
                String line = sc.nextLine();
                Scanner lineSc = new Scanner(line);
                lineSc.useDelimiter(",");
                while (lineSc.hasNext()) {
                    System.out.println(lineSc.next() + " | " + lineSc.next());
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("C");
            // swallowing the exception
        } 
        
    }
}
