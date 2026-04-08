public class MaxSubArrSum {
    public static int maxSubArrSum(int[] nums, int k) {
        // K--> window size
        int sum = 0;
        int maxSum = 0;
        int i = 0;
        int j = 0;
        while (j < nums.length) {
            sum += nums[j];
            if(j-i+1 < k) {
                j++;
            } else {
                maxSum = Math.max(maxSum, sum);
                sum = sum - nums[i];
                i++;
                j++;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr [] = {2,5,1,8,2,9,1};
        int k = 3;
        System.out.println(maxSubArrSum(arr, k));
    }
}