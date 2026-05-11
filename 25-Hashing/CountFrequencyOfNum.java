import java.util.HashMap;

public class CountFrequencyOfNum {

    public static void countFreq(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int key : arr) {
            if(map.containsKey(key)) {
                map.put(key, map.get(key) +1);
            }else {
                map.put(key, 1);
            }
        }
        System.out.println(map);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1,3,2,1};
        countFreq(arr);
    }
}