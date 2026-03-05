public class ClearLastIBit {
    public static int clearLastIBit(int n, int i){
        int bitMask = (~0)<< i;
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearLastIBit(15, 2));
    }
}
