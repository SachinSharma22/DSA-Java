import java.util.HashMap;

public class ValidAnagram {
    /* Given two string s and t, return true if t is anagram of s, and false otherwise,
    An anagram is a word or phrase formed by rearranging letter of a different word or phrase, typically using all the origanal letter exectly once */


    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (map.get(ch) != null) {
                if(map.get(ch) == 1) {
                    map.remove(ch);
                }else{
                    map.put(ch, map.get(ch) - 1);
                }
            }else {
                return false;
            }
        }
        return map.isEmpty();
    }
    public static void main(String[] args) {
        String s = "race";
        String t = "care";
        System.out.println(isAnagram(s, t));

    }
}