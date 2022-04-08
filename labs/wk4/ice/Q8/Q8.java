public class Q8<T> {
    private T t;

    public void set(T t) { this.t = t; }
    public T get() { return t; }


    public static void main(String[] args) {
        // Q8 example = new Q8();
        Q8<Integer> example = new Q8<Integer>();
        example.set(8);
        
        // String value = example.get();
        System.out.println(example.get());
        
    }
}