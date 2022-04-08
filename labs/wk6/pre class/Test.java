import java.security.InvalidParameterException;

public class Test {
    public static void main(String[] args) {
        Demo d = new Demo();

        try {
            d.enterIntoDatabase("abc", "some name", 21);
        }
        catch (InvalidParameterException e) {
            System.out.println("error: " + e.getMessage());
        }
    }
}
