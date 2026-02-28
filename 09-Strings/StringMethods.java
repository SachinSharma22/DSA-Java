import java.util.Scanner;

public class StringMethods {
    public static void printChar(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String str1 = sc.nextLine();
        // int strLength = str1.length();
        // System.out.println("The length of the string " + str1 + " is = " + strLength);

        // System.out.println("Enter second string. ");
        // String str2 = sc.nextLine();
        
        // Concatenation in java
        // String str3 = str1 +" " + str2;
        // System.out.println(str3);

        // Char at in java
        String str4 = "fever";
        // char ch = str4.charAt(3);
        // System.out.println(ch);

        
        printChar(str4);
        sc.close();
    }
}
