import java.util.Scanner;

public class PowerFunction {
    public static int calculatePower(int a, int b){
        int total = 1;
        for (int i = 1; i <= b; i++) {
            total *= a;
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = sc.nextInt();
        System.out.print("Enter exponenet: ");
        int b = sc.nextInt();
        System.out.println("Value is: "+ calculatePower(a,b));
        sc.close();
    }
}
