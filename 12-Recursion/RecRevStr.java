public class RecRevStr {
    public static void revStr(String str, int i){
        if(i == str.length()-1){
            System.out.print(str.charAt(i) + " ");
            return;
        }
        revStr(str, i+1);
        System.out.print(str.charAt(i) + " ");
    }
    public static void main(String[] args) {
        String str = "hello";
        int i = 0;
        revStr(str,i);
    }
}
