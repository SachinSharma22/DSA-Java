import java.util.Arrays;

public class StringAnagrams {
    public static boolean isAnagram(String s, String t){
        if (s.length() != t.length()) {
        return false;
        }

        char[] sCharArr = s.toCharArray();
        char[] tCharArr = t.toCharArray();

        Arrays.sort(sCharArr);
        Arrays.sort(tCharArr);

        return Arrays.equals(sCharArr, tCharArr);
        
    }
    public static void main(String[] args) {
        String str1 = "anagram";
        String str2 = "nagaram";
        if(isAnagram(str1, str2)){
            System.out.println("Anagrams");
        }else{
            System.out.println("Not Anagrams");
        }
    }
}
