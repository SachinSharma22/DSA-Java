import java.util.Arrays;

public class StringAnagrams {
    public static void isAnagram(String str1, String str2){
        // Change strings into character array
        char[] str1CharArray = str1.toCharArray();
        char[] str2CharArray = str2.toCharArray();

        // Sort both arrays
        Arrays.sort(str1CharArray);
        Arrays.sort(str2CharArray);
        if (str1.length() == str2.length()) {
            if(str1CharArray.equals(str2CharArray)){
                System.out.println(str1+ " and " + str2 + " are anagrams. ");
            }else{
                System.out.println(str1+ " and " + str2 + " are not anagrams. ");
            }
        }else{
           System.out.println(str1+ " and " + str2 + " are not anagrams. ");
        }
        
    }
    public static void main(String[] args) {
        String str1 = "aab";
        String str2 = "abb";
        isAnagram(str1, str2);
    }
}
