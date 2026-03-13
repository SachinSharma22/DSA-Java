public class SumOfArrayElement {
    public static int sumElement(int[] arr, int i){
        if(i == arr.length){
            return 0;
        }
        return arr[i] + sumElement(arr, i+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(sumElement(arr, 0));
    }
}
