public class RemoveDuplicates {
    public static int[] removeDup(int[] arr){
       int j = 0;
       for (int i = 0; i < arr.length; i++) {
        if(arr[i] != arr[j]){
            j++;
            arr[j] = arr[i];
        }
       }
       int result[] = new int[j+1];
       for (int i = 0; i <= j; i++) {
        result[i] = arr[i];
       }
        
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,4,4,5};
        int newArr[] = removeDup(arr);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+ " ");
        }
    }
}