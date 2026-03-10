public class FirstOccurance {
    public static int firstOcc(int[] arr, int i, int target){
        if(i == arr.length){
            return -1;
        }

        if(arr[i] == target){
            return i;
        }
        return firstOcc(arr, i+1, target);
        
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,5};
        int i = 0;
        int target = 5;
        int result = firstOcc(arr, i, target);
        System.out.println(result);
    }
}
