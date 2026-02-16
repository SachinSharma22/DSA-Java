import java.util.Scanner;

public class MaximumOfThreeNumbers {
    public static int findMaximum(int a, int b, int c){
        int max = a;

        if(b > max){
            max = b;
        }
        if(c>max){
            max = c;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number here: ");
        int a = sc.nextInt();
        System.out.print("Enter second number here: ");
        int b = sc.nextInt();
        System.out.print("Enter third number here: ");
        int c = sc.nextInt();

        int max = findMaximum(a,b,c);
        System.out.println(max + " is greatet in all of the given numbers.");

        sc.close();
    }
}
