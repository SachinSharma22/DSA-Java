public class ReverseArray {
    public static int[] reverseArray(int[] arr){
        int[] revArr = new int[arr.length];
        int index = 0;
        for (int i = arr.length-1; i>=0; i--) {
            revArr[index++] = arr[i];
        }
        return revArr;
    }
    public static int[] reverseWithinArray(int[] arr){
        int f = 0;
        int l = arr.length-1;
        while(f<l){
            int temp = arr[f];
            arr[f] = arr[l];
            arr[l] = temp;
            f++;
            l--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        // int[] result = reverseArray(arr);
        int[] result = reverseWithinArray(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
