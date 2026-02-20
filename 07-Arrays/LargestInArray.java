public class LargestInArray {
    public static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,1,15,3,7,8};
        int max = findMax(arr);
        System.out.println("Maximum in given array is: " + max);
    }
}
