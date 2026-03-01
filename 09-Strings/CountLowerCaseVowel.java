import java.util.Scanner;

public class CountLowerCaseVowel {
    public static int countVowel(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count ++;
            }
        }
        return count;
    }
    public static int countLowerCase(String str){
        char[] ch = {'a','e','i','o','u'};
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            for(int j = 0 ; j<str.length();j++){
                if(str.charAt(j) == ch[i]){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string here: ");
        String str = sc.nextLine();
        // int count = countLowerCase(str);
        int count = countVowel(str);
        System.out.println(count);
        sc.close();
    }
}
