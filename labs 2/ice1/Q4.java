import java.util.ArrayList;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        // ArrayList
        ArrayList<Integer> intList = new ArrayList<>();
        boolean continueLoop = true;

        Scanner sc = new Scanner(System.in);

        while (continueLoop) {
            System.out.print("Enter number:");
            int num = sc.nextInt();
            
            if (num >= 0) {
                intList.add(num);
            } else {
                continueLoop = false;
            }
        }

        String toPrint = "";
        int totalProduct = 1;
        // ForLoop: Looping through ele in ArrayList
        for (int ele: intList) {
            System.out.println(ele);
            totalProduct *= ele;
            toPrint += ele + " x ";
        }

        // String slicing / substring
        System.out.println(toPrint.substring(0 , toPrint.length()-3) + " = " + totalProduct);
    }
}