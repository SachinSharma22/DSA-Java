public class MaximumElement {
    // Row with maximum sum
    public static int maxSumRow(int[][] matrix){
        int max = Integer.MIN_VALUE;
        int count = 0;
        
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            if(max < sum){
                max = sum;
                count++;
            }
        }
        return count;
    }

    public static int findMax(int[][] matrix){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] >max){
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [][] matrix = {
            {1,4,9},
            {11,4,3},
            {2,2,3}
        };
        // int max = findMax(matrix);
        // System.out.println(max);

        int maxRowSum = maxSumRow(matrix);
        System.out.println(maxRowSum);
    }
}
