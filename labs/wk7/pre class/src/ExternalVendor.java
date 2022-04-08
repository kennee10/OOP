public class ExternalVendor {
    private int remainingComputers;
    private int costOfComputer;

    // constructor
    public ExternalVendor() {
        remainingComputers = 5;
        costOfComputer = 2000;
    }

    // getter for costOfComputer
    public int getCostOfComputer() {
        return costOfComputer;
    }

    // call this to order a computer
    public void orderComputer() throws NoStockException {
        if (remainingComputers == 0) {
            throw new NoStockException("We are out of stock");
        }
        else {
            remainingComputers--;
            // other stuff here that completes the order
        }
    }
}
