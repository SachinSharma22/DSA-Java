public class LastOccurance {
    public static int lastOcc(int[] arr, int i, int target){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOcc(arr, i+1, target);
        if(isFound == -1 && arr[i] == target){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,2,4,5,6,2,8};
        int target = 2;
        int i = 0;
        int result = lastOcc(arr, i, target);
        System.out.println(result);
    }
}
