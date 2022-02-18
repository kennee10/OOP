public class Fridge implements AutoCloseable {
    public void close() {
        System.out.println("closing");
    }
}
