public class BinarySearch {
    public static int findIndex(int[] arr, int target){
        
        int first = 0;
        int last = arr.length-1;
        while(first<=last){
            int mid = (first + last)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid]<target){
                first = mid+1;
            }else{
                last = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14};
        int target = 10;
        int result = findIndex(arr,target);
        System.out.println("Given integer is available on index: " + result);
    }
}
