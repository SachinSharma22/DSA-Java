package practice;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 10, b = 20, temp = 0;
        System.out.println("------------ Before Swap ------------------");
        System.out.println("a = " + a + " b = " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("------------ After Swap ------------------");
        System.out.println("a = " + a + " b = " + b);

    }
}
