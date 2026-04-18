import java.util.HashMap;

public class HashingBasic {

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        // Insert O(1)
        hm.put("India", 100);
        hm.put("China", 105);
        hm.put("US", 50);

        System.out.println(hm);

        // Get O(1)

        // int popuInd = hm.get("India");
        // System.out.println("Population of India is = " + popuInd);

        // Invalid key return null
        // System.out.println(hm.get("Thailand"));

        // containsKey()
        // System.out.println(hm.containsKey("India"));
        // System.out.println(hm.containsKey("Thailand"));

        // Remove()
        // System.out.println(hm.remove("China"));
        // System.out.println(hm);

        //size
        System.out.println(hm.size());

        //isEmpty()
        System.out.println(hm.isEmpty());

        //clear() --> clear all the data from HashMap
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}