import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number you want to check:- ");
        int num = sc.nextInt();

        if(num%2 ==0){
            System.out.printf("%d is even number", num);
        }else{
            System.out.printf("%d is odd number", num);
        }

        sc.close();
    }
}
