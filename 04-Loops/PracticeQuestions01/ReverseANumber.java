import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you choice here: - ");
        int n = sc.nextInt();
        System.out.println("Original Number is : " + n);
        int r, d, rev = 0;
        while(n > 0){
            r = n % 10;
            d = n /10;
            n = d;
            rev = rev * 10 + r;
        }
        
        System.out.println("Reversed Number is : " + rev);
        sc.close();
    }
}
