public class PartAndQuantityEntry {
    public void enterPartAndQuantity(int partNo, int quantity) throws IllegalArgumentException {
        if (partNo < 0 || partNo > 999 || quantity < 1 || quantity > 5000) 
            throw new IllegalArgumentException("Invalid order, part number should be between 0 and 999, and quantity between 1 and 5000.");
        System.out.println("Successfully inserted order");
    }
}
