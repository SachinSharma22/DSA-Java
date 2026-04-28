import java.util.HashSet;

public class UnionAndIntersection {
    public static void union(int[] num1, int[] num2) {
        
        HashSet<Integer> un = new HashSet<>();
        for (int i = 0; i < num1.length; i++) {
            un.add(num1[i]);
        }
        for (int i = 0; i < num2.length; i++) {
           un.add(num2[i]) ;
        }

        System.out.println("Union size = " + un.size());
    }

    public static void intersection(int[] num1, int[] num2) {

    }
    public static void main(String[] args) {
       int arr1[] = {7,3,9};
       int arr2[] = {6,3,9,2,9,4};
       union(arr1, arr2);
    }
}