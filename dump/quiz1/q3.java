public class q3 {
    public static void main(String[] args) {
        int x = 3;
        int y = ++x;
        System.out.printf("%d%d", x--, y+1);
        System.out.printf("%d%d%n", x--, y+1);
    }
}
