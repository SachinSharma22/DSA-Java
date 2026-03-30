import java.util.Arrays;

public class MinSumAbsDiff {
/*Given two array A and B of equal size n. Pair Each element of Array A to an element in array B, such that sum S of absolute difference of all the pairs is minimum.*/
    public static void main(String[] args) {
        int[] a = {4,1,8,7};
        int b[] = {2,3,6,5};
        Arrays.sort(a);
        Arrays.sort(b);
        int minDiff = 0;
        for (int i = 0; i < b.length; i++) {
            minDiff += Math.abs(a[i]-b[i]);
        }

        System.out.println("Minimum diff = " + minDiff);
    }
}