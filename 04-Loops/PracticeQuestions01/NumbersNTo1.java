import java.util.Scanner;

public class NumbersNTo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        int num = sc.nextInt();
        int i = num;

        while(i > 0){
            System.err.println(i);
            i--;
        }
        sc.close();
    }
}
