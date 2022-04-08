// Test.java
public class Test {
    public static void main(String[] args) {
        Object o = new Fruit();
        Fruit f = new Fruit();

        System.out.print(o.equals(f));
        System.out.println(f.equals(o));
        
    }
}
