import java.util.*;

public class PersonComparator 
        // extends Object
        implements Comparator<Person> {
    public int compare(Person p1, Person p2) {
        // "abc".compareTo("adc") 
        // (a - a) => 0
        // (b - d) => -2

        // "abc".compareTo("abc")
        // (a - a) -> 0
        // (b - b) -> 0
        // (c - c) -> 0
        return p1.getName().compareTo(p2.getName());
    }
}
