// abstract means
// -> cannot be instantiated
// -> Animal a = new Animal();
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    
    public void doWalk() {
        System.out.println("walk");
    }
    public abstract void doShout();

}
