import java.io.*;

public class Test {
    public static void main(String[] args) {
        PurchasingDept dept = new PurchasingDept(5000);
        int noOfComputerPurchased = 0;

        // try to buy 5 computers
        try {
            while (noOfComputerPurchased < 5) {
                dept.purchaseComputer();
                noOfComputerPurchased++;
                System.out.println(noOfComputerPurchased + " computer(s) purchased successfully");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
