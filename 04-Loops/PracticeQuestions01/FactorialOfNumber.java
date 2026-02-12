import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you choice here: - ");
        int n = sc.nextInt();
        int fact = 1;

        if(n < 0){
            System.out.println("Factorial not defined for negative numbers.");
        }else if(n == 0 || n == 1){
            System.out.println("Factorial is : 1");
        }else{
            for(int i = n; i>0; i--){
                fact = fact * i;
            }
            System.out.println(fact);
        }
       
        sc.close();
    }
}
