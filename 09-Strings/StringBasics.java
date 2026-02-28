import java.util.Scanner;

public class StringBasics {
    public static void main(String[] args) {
        // String str = "xyz";
        // System.out.println(str);
        // char[] ch = {'a','b','c','d'};
        // System.out.println(ch);

        // String str1 = new String("YOYO");
        // System.out.println(str1);

        // Strings in java are immutable

        // Strings Input
        Scanner sc = new Scanner(System.in);
        // String str = sc.next();//Input of only one word
        String str = sc.nextLine();//For more than a word
        System.out.println(str);
        sc.close();
    }
}
