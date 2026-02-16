import java.util.Scanner;

public class EvenOdd {
    public static void checkEvenOdd(int a){
        if(a%2 == 0){
            System.out.println(a + " is an even number.");
        }else{
            System.out.println(a+" is an odd number.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number here: ");
        int a = sc.nextInt();
        checkEvenOdd(a);
       
        sc.close();
    }
}
