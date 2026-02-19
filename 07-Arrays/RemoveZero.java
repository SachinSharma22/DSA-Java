public class RemoveZero {
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
    public static void main(String[] args) {
        int[] arr = {1,0,3,5,0,7};
        int[] result = removeZero(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
