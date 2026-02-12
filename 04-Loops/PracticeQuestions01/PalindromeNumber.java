import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you choice here: - ");
        int n = sc.nextInt();
        int original = n;
        int r, d, rev = 0;
        while(n > 0){
            r = n % 10;
            d = n /10;
            n = d;
            rev = rev * 10 + r;
        }
        if(original == rev){
            System.out.printf("%d is a Palindrome Number.", original);
        }else{
            System.out.printf("%d is not a Palindrome Number.", original);
        }

        sc.close();
    }
}
