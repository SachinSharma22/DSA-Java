import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you choice here: - ");
        int n = sc.nextInt();
        boolean status = true;

        if(n <= 1){
            System.out.println("Not A Prime Number");
        }else{
            // You can also use Math.squart(n) in instead of (n/2) for better time complexity
            for(int i = 2; i<= (n/2); i++){
                if(n % i ==0){
                    status = false;
                    break;
                }
            }
        }

        if(!status){
            System.out.printf("%d is not a prime number",n);
        }else{
            System.out.printf("%d is a prime number",n);
        }

        sc.close();
    }
}
