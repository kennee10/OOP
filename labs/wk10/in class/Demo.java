import java.util.*;
// List
// Map
// Set
public class Demo {
    // time efficiency
    // space efficiency
    public static void main(String[] args) {
        //ArrayList<String> values = new ArrayList<>();
        List<String> values = new ArrayList<>();
        values.add("apple");
        values.add("orange");
        values.add("apple");
        values.add("apple");
        
        

        for (int i =  values.size() - 1; i >= 0 ; i--) {
            if (values.get(i).equals("apple")) {
                values.remove(i);
            }
        }
        System.out.println(values);

        // for (String s : values) {
        //     System.out.println(s);
        // }

        // Iterator<String> iter = values.iterator();
        // while (iter.hasNext()) {
        //     String value = iter.next();
        //     if (value.equals("apple")) {
        //         iter.remove();
        //     }
        // }
        // System.out.println(values);
    }
}
