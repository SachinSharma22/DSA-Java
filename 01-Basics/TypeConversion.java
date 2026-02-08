import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        float num = number;
        System.out.println(num);

        int num1 = 'A';   // char → int
        System.out.println(num1); // 65


        sc.close();

        // byte → short → int → long → float → double
    }
    
}
