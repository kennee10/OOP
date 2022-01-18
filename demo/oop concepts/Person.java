public class Person {
    // instance attributes
    double weight;
    double height;
    int age;

    // can define as many constructors but only 1 will run
    // specific constructor
    public Person(double weight, double height, int age) {
        this.weight = weight; // if no this. prefix, it will refer to the parameter
        this.height = height;
        this.age = age;
    }
}
