public class ReverseString {
    public static void reverseString(char[] s){
        int start = 0;
        int end = s.length-1;
        while(start<end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        for(char ch : s){
            System.out.print(ch + " ");
        }
    }
    public static void main(String[] args) {
        String str = "Hello";
        char[] strCharArray = str.toCharArray();
        reverseString(strCharArray);
    }
}
