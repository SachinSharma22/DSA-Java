public class Transpose {

    public static void transpose(int[][] matrix){
        int[][] tranMat = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                tranMat[j][i] = matrix[i][j];
            }
        }
        print(tranMat);
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
        print(matrix);
        System.out.println("-----------------Transpose Matrix -------------------");
        transpose(matrix);
    }
}
