public class Example1 {
    // checked by the compiler
    // unchecked by the compiler
    // indexOf("abc", 'a') -> 0
    // indexOf("abc", 'b') -> 1
    // indexOf("abc", 'c') -> 2
    // indexOf("abc", 'd') -> -1 
    
    public static int indexOf(String s, char c) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                return i;
            }
        }
        // return -1; // error code
        throw new StringIndexOutOfBoundsException();
    }
    public static void main(String[] args) {
        // handling a method that returns an error code
        // int x = indexOf("abc", 'd');
        // if (x == -1) {
        //     System.out.println("character not found");
        // }

        try {
            int x = indexOf("abc", 'd');
        } catch (StringIndexOutOfBoundsException e) {
            
        }

        // unchecked exception
        // int x = 3;
        // int y = 0;
        // System.out.println(x/y);
    }
}