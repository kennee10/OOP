import java.util.*;
import java.util.Scanner;

public class UnionApp {
    public static void main(String[] args) {
        Set<String> map = new HashSet<>();

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first line> ");
        String line1 = sc.nextLine();

        System.out.print("Enter second line> ");
        String line2 = sc.nextLine();

        String[] arr1 = line1.split(",");
        String[] arr2 = line2.split(",");

        for (String c: arr1) {
            map.add(c);
        }
        for (String c: arr2) {
            map.add(c);
        }
        System.out.println(map);
    }
}