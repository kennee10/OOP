// thrown by the Vendor when there's no stock
public class NoStockException extends Exception {
    // constructor
    public NoStockException(String msg) {
        super (msg);
    }
}
