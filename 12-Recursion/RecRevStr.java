public class RecRevStr {
    public static void revStrWithBuilder(String str, int i, StringBuilder res){
        if(i == str.length()){
            return;
        }
        revStrWithBuilder(str, i+1, res);
        res.append(str.charAt(i));
    }
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
        // revStr(str,i);

        //for string builder
        StringBuilder res = new StringBuilder();
        revStrWithBuilder(str,i,res);
        System.out.println(res.toString());
    }
}
