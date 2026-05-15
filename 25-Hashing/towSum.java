import java.util.HashMap;

public class towSum {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];
            // Check if needed number already exists
            if(map.containsKey(needed)) {
                return new int[] {map.get(needed), i};
            }
            // Store current number and index
            map.put(nums[i], i);
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target = 9;
        int result[] = twoSum(arr, target);
        for (int i : result) {
            System.out.print(i + " ");
        }

    }
}