public class MaxSubArraySumKadane {
    public static int findMaxSubArray(int[] arr){
        int currSum = arr[0];
        int maxSum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            currSum = Math.max(arr[i],currSum+arr[i]);
            maxSum = Math.max(maxSum,currSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr [] = {-2,-3,4,-1,-2,1,5,-3};
        int result = findMaxSubArray(arr);
        System.out.println("Max sub array sum is : " + result);
    }
}
