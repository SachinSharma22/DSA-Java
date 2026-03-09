public class PrintDecreasing {
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        return n * factorial(n-1);
        
    }
    public static int printSum(int n){
        if(n <= 1){
            return n;
        }
        return n + printSum(n-1);

    }
    public static void printInc(int n){
        if(n ==0) {
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");
    }
    public static void printDec(int n){
        if(n ==1){
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        // printDec(n);
        // printInc(n);
        // int result = printSum(n);

        // Factorial function
        int result = factorial(n);
        System.out.println(result);
    }
}
