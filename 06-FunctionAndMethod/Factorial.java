import java.util.Scanner;

public class Factorial {
    public static int findFactorial(int a){
        int fact = 1;
        if(a<0){
            fact = -1;
        }else if(a == 0 || a ==1){
            fact = 1;
        }else{
            for (int i = 1; i <= a; i++) {
            fact *= i;
            }
        }

        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find factorial: ");
        int a = sc.nextInt();
        int fact = findFactorial(a);
        if(fact<0){
            System.out.println("Factorial is not available for negative numbers.");
        }else{
            System.out.println(fact+ " is the factorial of given number.");
        }

        sc.close();
    }
}
