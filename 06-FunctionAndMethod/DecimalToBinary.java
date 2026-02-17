import java.util.Scanner;

public class DecimalToBinary {
    public static void decToBin(int decNum){
        // int myNum = decNum;
        int changeNum = 0;
        int pow  = 0;
        while (decNum > 0) {
            int lastDigit = decNum % 2;
            changeNum = changeNum + (lastDigit * (int)(Math.pow(10, pow)));
            pow++;
            decNum = decNum /2;
        }
        System.out.println(changeNum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your decimal number here to change in binary: ");
        int n = sc.nextInt();
        decToBin(n);
        sc.close();
    }
}
