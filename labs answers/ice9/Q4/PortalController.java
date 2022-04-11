// controller class containing the logic for bank transfer
public class PortalController {
	private Bank bank; // store all accounts in the bank

	// constructor
    public PortalController() {
        bank = new Bank();
    }


    // Write your answer below.
    public void transfer(String fromAccNumber, String toAccNumber, double amount) throws Exception {
        Account fromAccount = bank.retrieveAccount(fromAccNumber);
        Account toAccount = bank.retrieveAccount(toAccNumber);

        double balance = fromAccount.getBalance();

        if (balance >= amount) {
            fromAccount.deduct(amount);
            toAccount.add(amount);
        } else {
            throw new Exception("Insufficient funds.");
        }
    }
}
