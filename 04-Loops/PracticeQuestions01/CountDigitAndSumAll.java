import java.util.Scanner;

public class CountDigitAndSumAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you choice here: - ");
        int n = sc.nextInt();
        int remainder, division, counter = 0, sum = 0;
        while (n > 0) {
            remainder = n % 10;
            division = n /10;
            n = division;
            counter++;
            sum = sum+remainder;
        }
        System.out.println("Total digit in number is : " + counter);
        System.out.println("Sum of total digit is : " + sum);
        sc.close();
    }
}
