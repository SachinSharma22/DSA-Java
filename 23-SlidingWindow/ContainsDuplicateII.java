import java.util.HashSet;

public class ContainsDuplicateII {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

    HashSet<Integer> set = new HashSet<>();

    for(int i = 0; i < nums.length; i++) {

        // Remove element outside window
        if(i > k) {
            set.remove(nums[i - k - 1]);
        }

        // Duplicate found inside window
        if(set.contains(nums[i])) {
            return true;
        }

        // Add current element
        set.add(nums[i]);
    }

    return false;
}

    public static boolean containsNearbyDuplicateII(int[] nums, int k) {
        for(int i = 0; i< nums.length; i++) {
            for(int j = i+1; j<nums.length; j++) {
                if(nums[i] == nums[j] && Math.abs(i-j) <= k) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = {1,0,1,1};
        int k = 1;
        System.out.println(containsNearbyDuplicate(nums, k));
        
    }
}