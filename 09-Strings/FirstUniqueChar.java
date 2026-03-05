public class FirstUniqueChar {
    public static int findIndex(String s){
        int freq[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)-'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if(freq[s.charAt(i)-'a'] == 1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String str = "loveleetcode";
        int index = findIndex(str);
        System.out.println(index);
    }
}
