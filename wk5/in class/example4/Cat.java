
public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public Object clone() {
        return new Cat(super.getName());
    }
}
