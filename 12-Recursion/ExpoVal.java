public class ExpoVal {
    public static int expoVal(int n, int x){
        if(n == 0){
            return 0;
        }
        if(x == 0){
            return 1;
        }
        if(x == 1){
            return n;
        }
        return n * expoVal(n, x-1);
    }
    public static void main(String[] args) {
        int n = 2;
        int x = 10;
        int result = expoVal(n, x);
        System.out.println(result);
    }
}
