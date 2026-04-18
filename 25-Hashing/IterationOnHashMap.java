import java.util.HashMap;
import java.util.Set;

public class IterationOnHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        // Insert O(1)
        hm.put("India", 100);
        hm.put("China", 105);
        hm.put("US", 50);
        hm.put("Indo", 5);
        hm.put("Japan", 22);

        //Iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);
    }
}
