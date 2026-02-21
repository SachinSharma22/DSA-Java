public class SubArrays {
    public static void printSubArrays(int[] arr){
        int n = arr.length;
        int index = 0;
        int sumArray[] = new int[n*((n-1)/2)];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k < j; k++) {
                    System.out.print(arr[k]+" ");
                    sum += arr[k];
                }
                System.out.print(" = "+ sum);
                sumArray[index++] = sum;
                System.out.println();
            }
            System.out.println();
        }
        for (int i = 0; i < sumArray.length; i++) {
            System.out.print(sumArray[i]+" ");
        }
        System.out.println("\n--------------------------------------------------");
        findMinMax(sumArray);
    }

    public static void findMinMax(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Minimum value in given array is: "+min+" \nMaximum value in given array is: "+ max);
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        printSubArrays(arr);
    }
}
