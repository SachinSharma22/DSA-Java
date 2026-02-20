public class LinearSearch {
    public static int findIndex(int[] arr, int value){
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == value){
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14};
        int value = 10;
        int index = findIndex(arr,value);
        System.out.println("The value 10 is presented on " + index);
    }
}
