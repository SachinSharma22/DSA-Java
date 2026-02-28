public class Rotate90Deg {
    public static void rotate(int[][] matrix){
        int start = 0;
        int end = matrix[0].length - 1;
        for (int i = 0; i < matrix.length; i++) {
            int temp = matrix[i][start];
            matrix[i][start] = matrix[i][end];
            matrix[i][end] = temp;
        }
        print(matrix);
    }
    public static void transpose(int[][] matrix){
        int[][] tranMat = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                tranMat[j][i] = matrix[i][j];
            }
        }
        rotate(tranMat);
    }

    public static void print(int[][] matrix){
        for(int[] a : matrix){
            for(int b : a){
                System.out.print(b+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
         int[][] matrix = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        transpose(matrix);
    }
}
