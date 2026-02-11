import java.util.Scanner;

public class PositiveNegativeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a valid number to check: - ");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("Number is Zero.");
            
        }else{
            String type = (num>0) ? "POSITIVE" : "NEGATIVE";
            System.out.println(type);
        }

        sc.close();
    }
}
