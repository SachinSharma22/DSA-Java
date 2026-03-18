import java.util.ArrayList;

public class LonelyNumbers {
    public static ArrayList<Integer> findLonelyNumbers(ArrayList<Integer> list){
    ArrayList<Integer> lonely = new ArrayList<>();

    for (int i = 0; i < list.size(); i++) {
        boolean isLonely = true;

        for (int j = 0; j < list.size(); j++) {
            if (i == j) continue;

            if (list.get(j) == list.get(i) ||
                list.get(j) == list.get(i) + 1 ||
                list.get(j) == list.get(i) - 1) {
                
                isLonely = false;
                break;
            }
        }

        if (isLonely) {
            lonely.add(list.get(i));
        }
    }

    return lonely;
}
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);
        System.out.println(findLonelyNumbers(list));
    }
}
