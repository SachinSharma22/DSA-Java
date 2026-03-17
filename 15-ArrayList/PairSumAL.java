import java.util.ArrayList;

public class PairSumAL {

    //brute force
    public static boolean pairSum1(ArrayList<Integer> list, int target){
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if(list.get(i) + list.get(j) == target){
                    return true;
                }
            }
        }
        return false;
    }

    // Two pointer approach
    public static boolean pairSum2(ArrayList<Integer> list, int target){
        int lp = 0;
        int rp = list.size()-1;
        while(lp != rp){
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }
            if(list.get(lp) + list.get(rp) > target){
                rp--;
            }else{
                lp++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;
        if(pairSum2(list, target)){
            System.out.println("Target Found");
        }else{
            System.out.println("Target not found.");
        }
    }
}
