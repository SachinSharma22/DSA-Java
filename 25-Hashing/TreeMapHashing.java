import java.util.TreeMap;

public class TreeMapHashing {

    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 100);
        tm.put("China", 150);
        tm.put("Japan", 15);
        
        System.out.println(tm);
    }
}