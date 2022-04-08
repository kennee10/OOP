import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        // List<String> values = new ArrayList<>();
        // values.add("apple");
        // values.add("orange");
        // values.add("apple");
        
        Set<Person> values = new TreeSet<>();
        values.add(new Person("apple",2));
        values.add(new Person("orange",3));
        values.add(new Person("apple", 4));
        System.out.println(values);
    }
}
