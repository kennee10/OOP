import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        char[] alphabets = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number:");
        int num = sc.nextInt();

        int completeCycle = num / 26;
        int extraIndex = num % 26;

        if (completeCycle != 0) {
            for (int i = 0; i < completeCycle; i++) {
                printAlphabets(26, alphabets);
            }
        }

        printAlphabets(extraIndex, alphabets);
    }

    public static void printAlphabets(int index, char[] alphabets) {
        for (int i = 0; i < index; i++) {
            // Array indexing
            System.out.print(alphabets[i] + " ");
        }
    }
}