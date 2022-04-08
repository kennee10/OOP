import java.util.*;

public class RandomTest {
    
    public static void main(String[] args) {
        Random r = new Random(1); // 1 here is the seed. it keeps the 'random numbers the same'
        System.out.println(r.nextInt(10));
        System.out.println(r.nextInt(10));
        System.out.println(r.nextInt(10));
        System.out.println(r.nextInt(10));

        System.out.println(r.nextDouble());
        System.out.println(Math.random());
    }
}
