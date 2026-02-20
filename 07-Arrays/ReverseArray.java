public class ReverseArray {
    public static int[] reverseArray(int[] arr){
        int[] revArr = new int[arr.length];
        int index = 0;
        for (int i = arr.length-1; i>=0; i--) {
            revArr[index++] = arr[i];
        }
        return revArr;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8};
        int[] result = reverseArray(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
