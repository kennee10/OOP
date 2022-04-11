import java.util.*;

public class UnionApp {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter first line> ");
        String first = console.nextLine();

        System.out.print("Enter second line> ");
        String second = console.nextLine();

        String[] firstTokens = first.split(",");
        String[] secondTokens = second.split(",");

        Set<String> uniqueTokens = new HashSet<>();

        for (String token : firstTokens) {
            uniqueTokens.add(token);
        }
        for (String token : secondTokens) {
            uniqueTokens.add(token);
        }       
        
        //to sort it in ascending order of their "integer values"        
        List<Integer> intList = new ArrayList<>();
        for (String s: uniqueTokens){
            intList.add(Integer.parseInt(s));
        }       
        
        Collections.sort(intList);
        
        Iterator<Integer> iter = intList.iterator();
        String output = "";

        while (iter.hasNext()) {
            output += String.valueOf(iter.next()) + ',';
        }    
         
        System.out.println(output.substring(0, output.length() - 1)); 
        
    }
}
