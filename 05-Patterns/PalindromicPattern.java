public class PalindromicPattern {
    public static void main(String[] args) {
        int n =5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            int m = i;
            for (int k = 1; k <= 2*i - 1; k++) {
                System.out.print(m+" ");
                if(k<i){
                    m--;
                }else{
                    m++;
                }
            }
            System.out.println();
        }
    }
}
