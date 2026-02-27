/*Find the minimum element out of all maximum elements of each row */

public class MinimumEleOfAllMaxEle {
    public static int findMin(int[][] matrix){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < matrix[i].length; j++) {
                max = Math.max(max,matrix[i][j]);
            }
            min = Math.min(max, min);
        }
        return min;
    }
    public static void main(String[] args) {
        int[][] matrix = {{11,2,3},
            {14,15,16},
            {6,7,19}
        };
        int result = findMin(matrix);
        System.out.println(result);
    }
}
