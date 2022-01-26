// superclass, parent class
// *DEFAULT extend*
// class Person extends java.lang.Object
class Person {
    private int age;
    public Person(int age) {
        this.age = age;
    }

    public String greet() {
        return "from Person class";
    }
}

// subclass, child class
class Student extends Person {
    // *DEFAULT constructor*
    // public Student() {
    //     super();
    // }

    private int gpa;

    public Student(int gpa) {
        // first line must be a this/super
        // *DEFAULT super with no parameters*
        // super();
        super(gpa);
        this.gpa = gpa;
    }

    // method overriding
    public String greet() {
        return super.greet() + "From student class";
    }
}

public class Test {
    public static void main(String[] args) {
        Student s = new Student(4);
        System.out.println(s.greet());
    }
}
