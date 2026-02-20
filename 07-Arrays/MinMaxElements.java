import java.util.Scanner;

public class MinMaxElements {
    public static void findMinMaxElement(int[] arr){
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
        System.out.println("Max value is: " + max +" Min value is: " + min);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the array. ");
        int n = sc.nextInt();
        System.out.print("Enter values for array - ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        findMinMaxElement(arr);

        sc.close();
    }
}
