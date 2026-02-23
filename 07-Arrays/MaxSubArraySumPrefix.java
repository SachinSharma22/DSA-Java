public class MaxSubArraySumPrefix {
    public static int findMaxSubArraySum(int[] nums){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefixArray[] = new int[nums.length];
        prefixArray[0] = nums[0];
        for (int i = 1; i < prefixArray.length; i++) {
            prefixArray[i] = prefixArray[i-1] + nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            int start = i;
            for (int j = i; j < nums.length; j++) {
                int end = j;
                currSum = start == 0 ? prefixArray[end] : prefixArray[end] - prefixArray[start-1];

                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        int result = findMaxSubArraySum(arr);
        System.out.println("Max Sub Array sum is: "+result);
    }
}
