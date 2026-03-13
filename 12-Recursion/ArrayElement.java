public class ArrayElement {
    public static void printArrayEle(int arr[], int i) {
        if(i == arr.length-1){
            System.out.print(arr[i]);
            return;
        }
        System.out.print(arr[i] + " ");
        printArrayEle(arr, i+1);
    }
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};
        printArrayEle(arr, 0);
    }
}
