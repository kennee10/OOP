import java.util.ArrayList;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("beng", 12));
        people.add(new Person("tiong", 16));
        people.add(new Person("seng", 9));
        System.out.println(people);
        Collections.sort(people, new PersonComparator());
        System.out.println(people);
    }
}
