public class SortArray {
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

    public static void main(String[] args) {
        int[] arr = {1,3,2,5,4};
        int[] result = sortArray(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
