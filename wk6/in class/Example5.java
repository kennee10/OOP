public class Example5 {
    public static void main(String[] args) {
        try (Fridge f = new Fridge()) {
            System.out.println("A");
        }
        System.out.println("B");
    }
}
