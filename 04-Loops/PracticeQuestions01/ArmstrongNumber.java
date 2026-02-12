import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you choice here: - ");
        int n = sc.nextInt();
        int r,d,armNum = 0;
        int org = n;
        while(n>0){
            r = n % 10;
            d = n / 10;
            n = d;
            armNum += (r*r*r);
        }

        System.out.println((org == armNum) ? "Armstrong Number" : "Not Armstrong Number");

        sc.close();
    }
}
