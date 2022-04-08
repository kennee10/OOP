public class Adder {
    public static void main(String... args) {
        int sum = 0;
        String output = "";

            for (String value: args) {
                try {
                    sum += Integer.parseInt(value);
                    output += value + " + ";
                } catch (NumberFormatException e) {
                    // do smth
                }
            }

            if (output.length() > 3) {
                System.out.println(output.substring(0, output.length() - 3) + " = " + sum);
            }
        
    }
}
