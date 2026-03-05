public class OddOrEven {
    public static void oddOrEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is odd");
        }
    }
    public static void main(String[] args) {
        oddOrEven(5);
        oddOrEven(53);
        oddOrEven(56);
    }
}
