public class Human {
    String name;
    int age;

    public void Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Human h;
        // System.out.println(h);
        Human g = new Human();
        System.out.println(g);
    }
}
