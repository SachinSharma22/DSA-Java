public class ClearIthBit {
    public static int clearItBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearItBit(10, 1));
    }
}
