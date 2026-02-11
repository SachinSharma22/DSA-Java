import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {
        /* Conditions pass > 33 fail < 33 */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Marks Here: - ");
        int mark = sc.nextInt();

        String status = (mark >= 33) ? "PASS" : "Fail";
        System.out.println(status);
        
        sc.close();
    }
}
