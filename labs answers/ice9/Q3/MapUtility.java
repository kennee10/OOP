import java.util.*;

public class MapUtility {
    public static void main(String[] args) {
        Map<String,String> input = new HashMap<>();
        input.put("Alfred", "81");
        input.put("Elise", "61");
        input.put("Billy", "41");
        input.put("Daniel", "41");
        input.put("Charlie", "54");


        System.out.println("Input:  " + input);
        Map<String,List<String>> result = reverse(input);
        System.out.println("Output: " + result);
    }

    public static Map<String, List<String>> reverse(Map<String, String> map) {
        Map<String, List<String>> result = new HashMap<>();

        for (String key : map.keySet()) {
            String value = map.get(key);
            if (!result.containsKey(value)) {
                result.put(value, new ArrayList<>());
            }
            result.get(value).add(key);
        }

        return result;
    }
}
