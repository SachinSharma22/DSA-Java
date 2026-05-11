import java.util.HashMap;

public class FirstNonRepeatingChar {
    public static void firstNonRepChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : str.toCharArray()) {
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        //Find first non-repeating character
        for(char ch : str.toCharArray()) {
            if(map.get(ch) == 1) {
                System.out.println(ch);
                break;
            }
        }
    }
    public static void main(String[] args) {
        String str = "aabbcdde";
        firstNonRepChar(str);
    }
}