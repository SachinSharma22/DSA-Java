import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrime(int a){
        
        if(a <= 1){
           return false;
        }
        // You can also use Math.squart(a) in instead of (n/2) for better time complexity
        for(int i = 2; i*i <= a; i++){
            if(a % i == 0){
               return false;
            }
            
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to challenge the prime checker: ");
        int n = sc.nextInt();
       
        if(isPrime(n)){
            System.out.println(n + " is a prime number.");
        }else{
            System.out.println(n + " is not a prime number.");
        }

        sc.close();
    }
}
