import java.util.Scanner;
import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numArray[] = {};

        while (true) {
            System.out.println("Enter number:");
            int num = sc.nextInt();

            if (num < 0) {
                if (numArray.length == 0) {
                    System.out.println("No positive number is entered");
                }
                break;
            }
            else
                numArray = addInt(numArray.length, numArray, num);
        }

        // System.out.println(Arrays.toString(numArray));

        int total_product = 1;
        String msg = "";

        for (int i = 0; i < numArray.length; i++) {
            total_product *= numArray[i];
            if (i == numArray.length - 1) {
                msg += numArray[i] + " = " + total_product;
            }
            else
                msg += numArray[i] + " x ";
        }
        System.out.println(msg);
    }

    // function to add an int to an array
    public static int[] addInt(int n, int[] arr, int x) {
        
        int i;

        int newarr[] = new int[n+1];

        for (i = 0; i < n; i++) {
            newarr[i] = arr[i];
        }

        newarr[n] = x;

        return newarr;
    }
}