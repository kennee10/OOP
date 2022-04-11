import java.util.Scanner;

public class CheckMembershipMenu {
    private CheckMembershipCtrl ctrl;

    public CheckMembershipMenu(CheckMembershipCtrl ctrl) {
        this.ctrl = ctrl;
    }

    public void display() {
        System.out.println("== Team Management System ==");
        System.out.println("1. Check student's team enrolment");
        System.out.println("2. Quit Application");
        System.out.print("Please enter your choice: ");
    }

    public void readOption() {
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            display();
            choice = sc.nextInt();
            switch (choice) {
                case 1 :
                    checkMembershipDuration();
                    break;
                case 2 :
                    System.out.println("bye bye");
                    break;
                default :
                    System.out.println("Enter a choice between 1 to 2");
            }
        } while (choice != 2);
    }

    // complete the checkMembershipDuration method here
    public void checkMembershipDuration() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the student's name> ");
        String studName = sc.nextLine();

        System.out.print("Enter the team's name> ");
        String teamName = sc.nextLine();

        int duration = ctrl.checkMembershipDuration(studName, teamName);
        
        if (duration == -1) {
            System.out.println(studName + " is not in the team " + teamName + ".");
            System.out.println();
            return;
        }

        String whenStr = "when";
        if (duration != 0) {
            whenStr = duration + " days after";
        }
        System.out.printf("%s joined the team %s the team is formed.%n%n", studName, whenStr);
    }
}
