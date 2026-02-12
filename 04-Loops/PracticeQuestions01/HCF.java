import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 && b == 0) {
            System.out.println("HCF is undefined");
        } else if (a == 0) {
            System.out.println("HCF is " + b);
        } else if (b == 0) {
            System.out.println("HCF is " + a);
        } else {
            while (b != 0) {
                int r = a % b;
                a = b;
                b = r;
            }
            System.out.println("HCF is " + a);
        }

        sc.close();
    }
}
