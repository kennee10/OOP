import java.io.*;
import java.util.*;

public class PurchasingDept {
    private int availableFunds;
    private ExternalVendor v;

    // constructor
    public PurchasingDept(int initAvailableFunds) {
        availableFunds = initAvailableFunds;
        v = new ExternalVendor();
    }

    // call this to purchase a computer
    // might throw PurchasingException or NoStockException
    public void purchaseComputer() throws NoStockException {
        int costOfComputer = v.getCostOfComputer();
        if (availableFunds < costOfComputer) {
            // creating a new PurchasingException obj
            throw new PurchasingException("Not enough money to perform purchase");
        }
        else {
            v.orderComputer();
            // System.out.println("Just bought 1 computer, funds left: " + availableFunds);
            availableFunds -=costOfComputer;
        }
    }
}
