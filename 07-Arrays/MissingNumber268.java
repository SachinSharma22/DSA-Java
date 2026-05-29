import java.util.Arrays;

public class MissingNumber268 {

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if(nums[i] != i){
                return i;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        int [] nums = {9,6,4,2,3,5,7,0,1};
        int result = missingNumber(nums);
        if(result < 0) {
            System.out.println("All Done, Nothing is missing");
        }else {
            System.out.println("Missing number in the array is: " + result);
        }
    }
}