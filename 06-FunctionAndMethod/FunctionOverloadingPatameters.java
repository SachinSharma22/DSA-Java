import java.util.Scanner;

public class FunctionOverloadingPatameters {
    public static int printSum(int a, int b){
        return a+b;
    }
    public static int printSum(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter second Number: ");
        int b = sc.nextInt();
        System.out.print("Enter third Number: ");
        int c = sc.nextInt();
        int total = printSum(a, b);
        System.out.println("Total of two numbers = "+ total);
        int total1 = printSum(a, b,c);
        System.out.println("Total of three numbers = "+ total1);

        sc.close();
    }
}
