/*You are given an integer array nums where the largest integer is unique.

Determine whether the largest element in the array is at least twice as much as every other number in the array. If it is, return the index of the largest element, or return -1 otherwise.

Example 1:

Input: nums = [3,6,1,0]
Output: 1
Explanation: 6 is the largest integer.
For every other number in the array x, 6 is at least twice as big as x.
The index of value 6 is 1, so we return 1. */

public class LargestAtLeastTwiceOfOthers {
    public static int findLargest(int[] arr){
        if(arr.length == 1){
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]> max){
                max = arr[i];
                index = i;
            }
        }
        int half = max/2;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == max){
                continue;
            }else if(arr[i]> half){
                return -1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int arr[] = {3,6,1,0,7,13};
        int index = findLargest(arr);
        System.out.println("Largest Element is available on : "+ index);
    }
}
