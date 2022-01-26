// superclass, parent class
class Person {
    private int age;
    public Person(int age) {
        this.age = age;
    }


}

// subclass, child class
class Student extends Person {
    // default constructor
    // public Student() {
    //     super();
    // }

    private int gpa;

    public Student(int gpa) {
        // default super with no parameters
        // super();
        super(gpa);
        this.gpa = gpa;
    }

}

public class Test {
    public static void main(String[] args) {
        Student s = new Student(4);
    }
}
