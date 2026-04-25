import java.util.HashSet;
import java.util.Iterator;

public class IteratorOnHashSet {

    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("delhi");
        cities.add("Sonbhadra");
        cities.add("Nepal");
        cities.add("thailand");
        cities.add("mumbai");

        // Iterator it = cities.iterator();

        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }

        for(String city: cities) {
            System.out.println(city);
        }
        
    }
}