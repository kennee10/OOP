import java.util.Objects;

public class Person implements Comparable<Person> {
    private int age;
    private String name;

    public Person( String name, int age) {
        this.age = age;
        this.name = name;
    }

    public int compareTo(Person another) {
        int compare = age - another.age;
        
        if (compare != 0) {
            return compare;
        }
        return name.compareTo(another.name);

        // int compare = name.compareTo(another.name);
        // if (compare != 0) {
        //     return compare;
        // }
        // return age - another.age;
    }
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) {
            return false;
        }
        Person another = (Person)obj;
        return name.equals(another.name) && age == another.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
    @Override
    public String toString() {
        return "Person [age=" + age + ", name=" + name + "]";
    }

    
}
