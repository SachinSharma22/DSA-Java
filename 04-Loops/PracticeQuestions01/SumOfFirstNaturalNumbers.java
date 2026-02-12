import java.util.Scanner;

public class SumOfFirstNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your choice: - ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0; i< n; i++){
            sum += i;
        }
        System.out.println("Total is - " + sum);
        sc.close();
    }
}
