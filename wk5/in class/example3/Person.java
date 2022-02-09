
   
public class Person  implements Comparable<Person> {
    private int age;
    private String name;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Person another) {
        return age - another.age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) {
            return false;
        }
        Person another = (Person)obj;
        // objects of the same class
        // can access each other private attributes directly

        return age == another.age;  //another.getAge();
    }

    @Override
    public String toString() {
        return "age=" + age + ", name=" + name;
    }

     
}
