import java.util.ArrayList;

public class OperationsInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);

        // System.out.println("---------------Get Operation -------------------");

        // // Get element
        // int ele = list.get(2);
        // System.out.println("Element is : " + ele);

        // System.out.println("---------------Delete Operation -------------------");
        // list.remove(3);
        // System.out.println(list);

        // System.out.println("---------------Set Operation -------------------");
        // list.set(2, 22);
        // System.out.println(list);

        System.out.println("---------------Contains Operation -------------------");
        System.out.println(list.contains(3));
        System.out.println(list.contains(33));

    }
}
