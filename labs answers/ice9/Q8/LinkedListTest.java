import java.util.Random;

public class LinkedListTest {
    private static LinkedList list = new LinkedList();
    public static void main(String[] args) {
        init();
        appendTest();
        insertTest();
        removeTest();
        removeAtTest();
        errorsTest();
    }

    public static void init() {
        list.add(10);
        list.add(20);
        list.add(30);
        display();
    }

    public static void appendTest() {
        System.out.println("Append Test");
        list.add(40);
        display();
    }

    public static void insertTest() {
        System.out.println("Insert Test");
        list.add(0,5);
        System.out.println("List Size:" + list.size());
        display();
        list.add(list.size() - 1, 35);
        System.out.println("\nList Size:" + list.size());
        display();
    }

    public static void removeTest() {
        System.out.println("Remove 2 elements");
        list.remove();
        list.remove();
        display();
    }

    public static void removeAtTest() {
        System.out.println("Remove elements at Positions");
        list.remove(list.size() - 1);
        list.remove(1);
        display();
    }

    public static void errorsTest(){        
        
        System.out.println("Adding: at 4th index");
        display();
        list.add(4, -1);        
        display();

        System.out.println("Removing element at 2nd index");
        list.remove(2);        
        display();
    }

    
    public static void display() {
        System.out.println("--------");
        Node temp = list.getHead();
        System.out.println(temp.getValue());
        while (temp.getNext() != null) {
            temp = temp.getNext();
            System.out.println(temp.getValue());
        }
        System.out.println("--------");
    }
}