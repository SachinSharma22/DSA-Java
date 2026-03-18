import java.util.ArrayList;

public class MonotonicArrayList {
    public static boolean checkMonotonic(ArrayList<Integer> list){
        boolean increasing = true;
        boolean decreasing = true;
        for (int i = 0; i < list.size()-1; i++) {
            if(list.get(i) < list.get(i+1)){
                decreasing = false;
            }

            if(list.get(i) > list.get(i+1)){
                increasing  = false;
            }
        }
        return increasing || decreasing;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        
        
        System.out.println(checkMonotonic(list));
    }
}
