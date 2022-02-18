import java.util.*;
import java.io.*;

public class Example4 {
    public static void main(String[] args) {
        // FileNotFoundException is an checked exception
        // try-with-resource 
        // is an object that implements the AutoClosable interface
        try (Scanner sc = new Scanner(new File("fruits.txt"));) {
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
        } catch (FileNotFoundException e) {
            System.out.println("C");
            // swallowing the exception
        } 
        
    }
}
