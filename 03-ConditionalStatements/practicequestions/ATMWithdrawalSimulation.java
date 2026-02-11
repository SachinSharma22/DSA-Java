import java.util.Scanner;

public class ATMWithdrawalSimulation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total amount in your account: - ");
        int balance = sc.nextInt();

        System.out.print("Enter withdraw amount: - ");
        int withdrawAmount = sc.nextInt();

        if (withdrawAmount % 100 != 0) {
            System.out.println("Invalid Amount");
        } 
        else if (withdrawAmount > balance) {
            System.out.println("Insufficient Balance");
        } 
        else if (balance - withdrawAmount < 500) {
            System.out.println("Minimum Balance Violation");
        } 
        else {
            int remainingBalance = balance - withdrawAmount;
            System.out.println("------------Total Amount Details --------------------");
            System.out.println("Your withdraw amount is - " + withdrawAmount);
            System.out.println("Your balanced amount is - " + remainingBalance);
        }

        sc.close();
    }
}
