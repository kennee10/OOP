import java.util.*;
import java.io.*;

public class Example6 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new File("fruits.txt"));) {
            while (sc.hasNext()) {
                String line = sc.nextLine();
                String[] arr = line.split(",");
                System.out.println(arr[0] + " | " + arr[1]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("C");
            // swallowing the exception
        } 
        
    }
}
