import java.util.*;

public class DictDemo {
    public static void main(String[] args) {
        Map<String,Integer> map = new TreeMap<>();

        map.put("orange",3);
        map.put("apple",2);
        map.put("pear",4);
        
        Set<String> keys = map.keySet();
        for (var aKey : keys) {
            System.out.println(aKey + " -> " + map.get(aKey));
        }
    }
}
