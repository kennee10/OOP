import java.util.*;

public class PortalMenu {
	private PortalController pctrl;

    // constructor
	public PortalMenu(PortalController pctrl) {
		this.pctrl = pctrl;
	}

	// gets account to, account from and amount to transfer from user input and performs transfer
    public void processTransfer() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter your account number > ");
        String fromAccNum = console.nextLine();
        System.out.print("Enter account to transfer to > ");
        String toAccNum = console.nextLine();
        System.out.print("Enter amount to transfer > ");
        double amount = console.nextDouble();

        try {
            pctrl.transfer(fromAccNum, toAccNum, amount);
            System.out.printf("%.1f is transferred from %s to %s\n", amount, fromAccNum, toAccNum);
        } catch (Exception e) {
            System.out.printf("%s has insufficient funds for transfer\n", fromAccNum);
        }
    }        
}
