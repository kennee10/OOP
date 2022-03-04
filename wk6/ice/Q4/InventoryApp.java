import java.util.*;
import java.io.*;

public class InventoryApp {
    public static void main(String[] args) {
        InventoryApp.stockTaking("product");
    }
    
    public static void stockTaking(String fileNameAndPath) {

        try (Scanner sc = new Scanner(new File(fileNameAndPath+".csv"));) {
            int products = 0;
            double totalCost = 0;
            while (sc.hasNext()) {
                // products += arr[0];
                
                String line = sc.nextLine();
                String[] arr = line.split(",");
                System.out.println("There are " + arr[0] + " " + arr[1] + ", each cost $" + arr[2]);
            }
        } catch (FileNotFoundException e) {
            System.out.println(fileNameAndPath + " is invalid");
        }
    }
}
