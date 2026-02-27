public class outputIn2D {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        //Printing first row
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[0][i] + " ");
        }
        System.out.println();
        System.out.println("--------------------Printing second row ------------------");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[1][i] + " ");
        }
        System.out.println();
        System.out.println("--------------------Printing third row ------------------");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[2][i] + " "); 
        }

        System.out.println();
        System.out.println("--------------------Printing whole matrix ------------------");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("--------------------Printing whole matrix column wise ------------------");
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
