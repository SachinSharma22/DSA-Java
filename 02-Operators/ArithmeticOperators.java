public class ArithmeticOperators {
    public static void main(String[] args) {
        // Two type of arithmetic operator available in java
        /*1. Binary Operator
        2. Unary Operator */

        // 1. Binary Operator
        int a = 19;
        int b = 90;

        System.out.println("Sum = " + (a+b));
        System.out.println("Substract = " + (a-b));
        System.out.println("Product = " + (a*b));
        System.out.println("Divide = " + (b/a));
        System.out.println("Modulo/(Remainder) = " + (b%a));

        System.out.println("---------------------------------------------------------------");

        // 2. Unary Operator
        /*I. Increament/Decreament
        Pre-Increament/Pre-decreament ++a/--a
        Post-Increament/Post-decreament a++/a--*/

        int n = 10;
        int m = ++n;
        System.out.println(n);
        System.out.println(m);

        System.out.println("---------------------------------------------------------------");
        
        int j = 10;
        int k = j++;
        System.out.println(j);
        System.out.println(k);
    }
    
}
