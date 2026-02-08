public class OperatorsPractice {
    public static void main(String[] args) {
        // Q1. Pre vs Post Increment (Classic Trap)
        // int a = 5;
        // int b = a++ + ++a;
        // System.out.println(a + " " + b);

        // Q2. Short-Circuit with Side Effects
        // int x = 10;
        // boolean result = (x++ > 10) && (++x > 12);
        // System.out.println(x + " " + result);

        // Q3. OR Short-Circuit Confusion
        // int x = 5;
        // boolean r = (x++ > 5) || (++x > 7);
        // System.out.println(x + " " + r);

        // Q4. Bitwise vs Logical Operator
        // int a = 3, b = 4;
        // boolean r = (a++ > 3) | (b++ > 4);
        // System.out.println(a + " " + b + " " + r);

        // Q5. Assignment Operator Chain
        // int a = 5;
        // a += a++ + ++a;
        // System.out.println(a);

        // Q6. Relational + Arithmetic Combo
        // int a = 10, b = 20;
        // System.out.println(a++ + b > b++ + a);
        // System.out.println(a + " " + b);

        // Q7. Operator Precedence Nightmare
        // int a = 2, b = 3, c = 4;
        // int result = a + b * c / b - a;
        // System.out.println(result);

        // Q9. Logical + Assignment Mix
        int x = 1;
        boolean r = (x = 2) == 2 && (x = 3) == 3;
        System.out.println(x + " " + r);

    }
}
