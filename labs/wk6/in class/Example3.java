import java.util.*;
import java.io.*;

public class Example3 {
    public static void main(String[] args) {
        // FileNotFoundException is an checked exception
        Scanner sc = null;
        try {
            System.out.println("A");
            sc = new Scanner(new File("fruits.txt"));
            System.out.println("B");
        } catch (FileNotFoundException e) {
            System.out.println("C");
            // swallowing the exception
        } finally {
            System.out.println("D");
            if (sc != null) {
                sc.close();
            }
        }
    }
}
