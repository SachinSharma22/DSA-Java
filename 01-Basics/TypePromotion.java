public class TypePromotion {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        // char c = a-b; this will error mentioned below
        // System.out.println(c);possible lossy conversion from int to char
        System.out.println((int)(a));
        System.out.println((int)(b));
        System.out.println(b-a);
    }
}
