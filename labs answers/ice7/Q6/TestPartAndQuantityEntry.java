import java.util.Scanner;

public class TestPartAndQuantityEntry {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        PartAndQuantityEntry entry = new PartAndQuantityEntry();

        while (true) {
            try {
                System.out.print("Enter part number:");
                int partNo = console.nextInt();
                System.out.println();
                
                System.out.print("Enter quantity:");
                int quantity = console.nextInt();
                
                entry.enterPartAndQuantity(partNo, quantity);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println();
            }
        }
    }
}
