public class CompareString {
    public static void main(String[] args) {
        String str1 = "Sachin";
        String str2 = "Sachin";
        String str3 = new String("Sachin");

        if(str1 == str2){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        if(str1 == str3){
           System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        } 
        
        // /compare with equal function

        if(str1.equals(str2)){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        if(str1.equals(str3)){
            System.out.println("strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
    }
}
