public class Person {
    // instance attributes
    private double weight;
    private double height;
    private int age;
    // String name;

    // can define as many constructors but only 1 will run
    // specific constructor
    public void Person(double weight, double height, int age) {
        this.weight = weight; // if no this. prefix, it will refer to the parameter
        this.height = height; // local variables
        this.age = age;
    }

    public double calculateBMI() {
        return this.weight/(height * height);
    }

    // accessor, getter
    public double getWeight() {
        return weight;
    }

    // setter,
    public void setWeight(double weight) {
        this.weight = weight;
    }
}
