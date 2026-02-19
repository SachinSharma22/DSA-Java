public class MergeArray {
    public static int[] mergeArray(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length+arr2.length];
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            result[index] = arr1[i];
            index++;
        }
        for (int i = 0; i < arr2.length; i++) {
            result[index] = arr2[i];
            index++;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        int[] result = mergeArray(arr1,arr2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
}
