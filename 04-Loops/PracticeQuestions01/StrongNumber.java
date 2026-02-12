import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you choice here: - ");
        int n = sc.nextInt();
        int r, d,tf = 0;

        if(n<=0){
            System.out.println("Invalid Number");
        }

        int org = n;
            while(n>0){
            r = n % 10;
            d = n / 10;
            n = d;

            int fact = 1;
            for(int i = r; i>0; i--){
                fact *= i;
            }
            tf = tf + fact;
        }

        String check = (org == tf) ? "Strong Number": "Not Strong Number";
        System.out.println(check);

        sc.close();
    }
}
