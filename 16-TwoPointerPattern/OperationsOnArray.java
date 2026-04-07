public class OperationsOnArray {
    public static int[] operationZero(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] == nums[i+1]) {
                nums[i] = nums[i] * 2;
                nums[i+1] = 0;
                
            }
        }
        // Step 2: Move zeros to end (Two Pointer)
        int j = 0; // pointer for placing non-zero

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // swap nums[i] and nums[j]
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                j++;
            }
        }
        return nums;
    }

    public static void printArr(int[] arr) {
        for(int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,0};
       int[] result = operationZero(arr);
       printArr(result);
    }
}