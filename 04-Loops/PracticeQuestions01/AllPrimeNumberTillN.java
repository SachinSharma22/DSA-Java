import java.util.Scanner;

public class AllPrimeNumberTillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you choice here: - ");
        int n = sc.nextInt();
        
        for(int a = 2; a <= n; a++){
            boolean isPrime = true;
            for(int i = 2; i <= a/2; i++){
                if(a % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(a + " ");
            }
        }

        sc.close();
    }
}
