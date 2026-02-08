public class TypeCasting {
    public static void main(String[] args) {
        // Type Casting: Manual conversion from larger to smaller data type.
        
        double val = 99.999;
        // int num = val; ---> Just for check the error
        int num = (int) val;
        System.out.println(num);

        //another example

        float f = 9.8f;
        int x = (int) f;

        System.out.println(x); // 9

    }
}
