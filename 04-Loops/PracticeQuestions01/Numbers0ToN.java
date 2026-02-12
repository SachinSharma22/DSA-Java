import java.util.Scanner;

public class Numbers0ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        int num = sc.nextInt();
        int i = 0;

        while(i < num){
            System.err.println(i);
            i++;
        }
        sc.close();
    }
}
