import java.security.InvalidParameterException;

public class Demo {

    public void enterIntoDatabase(String id, String name, int age) throws InvalidParameterException {
        if (id.length()==0 || name.length()==0) {
            throw new InvalidParameterException("Invalid name or ID");
        } else if (age<21) {
            throw new InvalidParameterException("age is below 21");
        }

        return; // success
    }
}