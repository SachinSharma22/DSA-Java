import java.util.Stack;

public class LongestValidString {
    public static int findLongestValid(String str) {
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int maxLength = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '('){
                st.push(i);
            }else{
                st.pop();
                if (st.isEmpty()) { 
                    st.push(i);
                }else{
                    int length = i - st.peek();
                    maxLength = Math.max(maxLength,length);
                }
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String str = "))()()))";
        System.out.println(findLongestValid(str));
    }
}