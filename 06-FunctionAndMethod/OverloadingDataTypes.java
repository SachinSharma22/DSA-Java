import java.util.Scanner;

public class OverloadingDataTypes {
    public static int printSum(int a, int b){
        return a+b;
    }
    public static float printSum(float a, float b, float c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        float a = sc.nextFloat();
        System.out.print("Enter second Number: ");
        float b = sc.nextFloat();
        System.out.print("Enter third Number: ");
        float c = sc.nextFloat();
        // int total = printSum(a, b);
        // System.out.println("Total of two numbers = "+ total);
        float total1 = printSum(a, b,c);
        System.out.println("Total of three numbers = "+ total1);

        sc.close();

    }
}
