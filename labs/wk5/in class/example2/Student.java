
public class Student extends Human {
    public void talk() {
        System.out.println("mug mug mug");
    }

    public static void main(String[] args) {
        Human s = new Student();
        s.talk();
    }
}
