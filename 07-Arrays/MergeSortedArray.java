import java.util.Arrays;
// import java.util.Scanner;

public class MergeSortedArray {
    // For Merging two array
     public static int[] mergeArray(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length+arr2.length];
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            result[index++] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            result[index++] = arr2[i];
        }
        return result;
    }
    // To remove zeros form array
    public static int[] removeZero(int [] nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                result[index++] = nums[i];
            }
        }
        return result;
    }
    //Sort merged array
     public static int[] sortArray(int[] nums){
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = 0; j < nums.length - i - 1; j++) {
                if(nums[j] > nums[j+1]) {
                int temp = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = temp;
                }
            }
        }
    return nums;
}

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[j++];
        }

        Arrays.sort(nums1);

        for (int i : nums1) {
            System.out.print(i + " ");
        }
    }
   public static void main(String[] args) {

    int nums1[] = {1,2,3,0,0,0};
    int nums2[] = {2,5,6};
    int m = 3;
    int n = 3;
    merge(nums1, m, nums2, n);

    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter size of first array: ");
    // int n = sc.nextInt();
    // int[] nums1 = new int[n];
    // System.out.print("Enter values of array");
    // for(int i = 0; i< n; i++){
    //     nums1[i] = sc.nextInt();
    // }

    // // For second array
    // System.out.print("Enter size of Second array: ");
    // int m = sc.nextInt();
    // int[] nums2 = new int[m];
    // System.out.print("Enter values of array");
    // for(int i = 0; i< m; i++){
    //     nums2[i] = sc.nextInt();
    // }
    // int[] mergedArray = mergeArray(nums1, nums2);
    // int[] zeroRemovedArray = removeZero(mergedArray);
    // int[] sortedArray = sortArray(zeroRemovedArray);
    // System.out.println("Sorted and Merged array in non-decreasing order is: - ");
    // for (int i = 0; i < sortedArray.length; i++) {
    //     System.out.print(sortedArray[i] + " ");
    // }

    // sc.close();
   } 
}
