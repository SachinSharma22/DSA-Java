public class SecondLargestElement {
    public static int secondLargest(int[] arr){
        if(arr.length < 2){
            throw new IllegalArgumentException("Array must have at least 2 elements");
        }
        int largest = Integer.MIN_VALUE;
        int secLar = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest){
                secLar = largest;
                largest = arr[i];
            }else if(arr[i] > secLar && arr[i] != largest){
                secLar = arr[i];
            }

            if (secLar == Integer.MIN_VALUE) {
                throw new IllegalArgumentException("No second largest element (all elements may be equal)");
        }

        }
        return secLar;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,5,3,6,4};
        int val = secondLargest(arr);
        System.out.println("Second Largest value in the array is: "+ val);
    }
}
