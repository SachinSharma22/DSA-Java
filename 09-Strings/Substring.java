public class Substring {
    public static String printSubString(String str, int si, int ei){
        String resStr = "";
        for (int i = si; i < ei; i++) {
            resStr += str.charAt(i);
        }
        return resStr;
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        int si = 0;
        int ei = 7;
        String subStr = printSubString(str,si,ei);
        System.out.println(subStr);
    }
}
