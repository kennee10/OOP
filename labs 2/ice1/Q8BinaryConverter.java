import java.util.Scanner;

public class Q8BinaryConverter {
  
  public static void main(String[] args) {
    

    String binary = "";
    String output = "";

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number:");
    int num = sc.nextInt();
    int num1 = num;

    while (num != 0) {
      if (num % 2 == 0) {
        binary += 0;
      } else {
        binary += 1;
      }
      num /= 2;
    }

    for (int i = binary.length()-1; i >= 0; i--) {
      output += binary.charAt(i);
    }

    // printf
    System.out.printf("Binary equivalent of %d is %s", num1, output);
  }
}