import java.util.Scanner;

public class EvenOddFrom1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice: - ");
        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            if(i%2 == 0){
                System.out.printf("%d is even \n",i);
            }else{
                System.out.printf("%d is odd \n", i);
            }
        }
        sc.close();
    }
}
