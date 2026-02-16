import java.util.Scanner;

public class PalindromeChecker {
    public static int revNum(int a){
        int r, d, rev = 0;
        while(a > 0){
            r = a % 10;
            d = a /10;
            a = d;
            rev = rev * 10 + r;
        }
        return rev;
    }
    public static boolean isPalindrome(int a){
        int rev = revNum(a);

        if(a == rev){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int a = sc.nextInt();
        if(isPalindrome(a)){
            System.out.println(a+" is a palindrome number");
        }else{
            System.out.println(a + " is not a palindrome number");
        }

        sc.close();
    }
}
