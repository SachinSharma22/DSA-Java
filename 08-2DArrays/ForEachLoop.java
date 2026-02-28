public class ForEachLoop {
    public static void main(String[] args) {
        // for single Dimensension array
        // int[] arr = {1,2,3,4,5};
        // for(int a : arr){
        //     System.out.print(a + " ");
        // }

        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[i].length; j++) {
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        //print using for each loop on inner loop
        // for (int i = 0; i < matrix.length; i++) {
        //     for(int a : matrix[i]){
        //         System.out.print(a + " ");
        //     }
        //     System.out.println();
        // }

        // Usig for each loop in both loop to print matrix
        for(int[] a : matrix){
            for(int b : a){
                System.out.print( b + " ");
            }
            System.out.println();
        }

    }
}
