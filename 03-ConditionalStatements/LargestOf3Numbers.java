public class LargestOf3Numbers {
    public static void main(String[] args) {
        int a = 200;
        int b = 200;
        int c = 30;
        int max;
        if(a >= b && a >= c){
            max = a;
        }else if(b >= c){
            max = b;
        }else{
            max = c;
        }
        System.out.printf("Largest Number is %d", max);

        // More Optimized way

        // max = a;

        // if(b > max){
        //     max = b;
        // }
        // if(c > max){
        //     max = c;
        // }
        // System.out.printf("Largest Number is %d", max);
    }
}
