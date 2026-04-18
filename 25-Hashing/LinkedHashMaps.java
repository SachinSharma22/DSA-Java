import java.util.LinkedHashMap;

public class LinkedHashMaps {

    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("Japan", 15);
        
        System.out.println(lhm);
    }
}