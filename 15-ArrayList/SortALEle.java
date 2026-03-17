import java.util.ArrayList;
import java.util.Collections;

public class SortALEle {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(12);
        list.add(3);
        list.add(41);
        list.add(5);
        list.add(6);

        System.out.println(list);
        Collections.sort(list);//Ascending order
        System.out.println(list);

        // Descending order
        Collections.sort(list, Collections.reverseOrder());  //Collections.reverseOrder() is a comparator
        System.out.println(list);
    }
}
