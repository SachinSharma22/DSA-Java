public class RotateKTimes {
    public static int[] reverseArray(int[] arr, int start, int end){
        // int start = 0;
        // int end = n-1;
       while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
    public static int[] rotateArrayWithoutExtraSpace(int[] arr, int k){
        int n = arr.length;
        k = k%n;
        reverseArray(arr, n-k, n-1);
        reverseArray(arr, 0, n-k-1);
        reverseArray(arr, 0, n-1);
        return arr;
    }
     public static int[] rotateArray(int[] arr, int k){
        int n = arr.length;
        k = k%n;
        int[] result = new int[n];
        int j = 0;
        for (int i = n-k; i < n; i++) {
            result[j++] = arr[i];
        }
        for (int i = 0; i < n-k; i++) {
            result[j++] = arr[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};
        int rotationTime = 3;
        
        // Rotation with extra storage
        // int result[] = rotateArray(arr,rotationTime);
        // int result[] = reverseArray(arr);

        //Rotation inPlace
        int result[] = rotateArrayWithoutExtraSpace(arr, rotationTime);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
