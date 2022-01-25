import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {
        // its like a container that contains the address of multiple addresses
        ArrayList container = new ArrayList();
        // ArrayList<type> container = new ArrayList<>();
        // each address will be an address of a dish
        container.add(new Dish("laksa", 5));
        container.add(new Dish("chicken rice", 4.5));
        // arraylist methods
        container.get(0); // gets first item in container
        container.size();
    }
}
