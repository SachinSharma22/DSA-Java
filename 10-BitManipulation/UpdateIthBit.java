public class UpdateIthBit {
    public static int clearItBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }
    public static int updateIthBit(int n, int i, int newBit){
        // if (newBit == 0) {
        //     return clearItBit(n, i);
        // }else{
        //     setIthBit(n, i);
        // }
        n = clearItBit(n, i);
        int bitMask = newBit<<i;
        return n| bitMask;
    }
    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 2, 1));
    }
}
