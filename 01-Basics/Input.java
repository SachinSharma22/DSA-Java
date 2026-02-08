import java.util.*;

public class Input {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter only one word: ");
    String input = sc.next(); //next() one take one word as input
    System.out.println(input);

    sc.nextLine();

    // For a whole line input use nextline();

    System.out.print("You can enter a whole sentence here: ");
    String name = sc.nextLine();
    System.out.println(name);


    //For taking int and float as input use nextInt() and nextFloat()

    System.out.print("Enter Integer Value: ");
    int intValue = sc.nextInt();

    System.out.print("Enter Float Value: ");
    float floatValue = sc.nextFloat();

    System.out.println(intValue);
    System.out.println(floatValue);

    // Sum of two number

    float sum = intValue + floatValue;
    System.out.println("Sum of two value = " + sum);

    //product of two number
    float product = intValue * floatValue;
    System.out.println("Product of two value = " + product);

    sc.close();

}
}
