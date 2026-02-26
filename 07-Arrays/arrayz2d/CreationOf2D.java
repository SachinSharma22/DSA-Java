package arrayz2d;

import java.util.Scanner;

public class CreationOf2D {
    public static void searchElement(int[][] matrix, int key){
        
         for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == key){
                    System.out.println("Value is available on index [ " + i +" " + j + " ]");
                    return;
                }
            }
        }
        System.out.println("Key not found.");  
        return;      
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("-------------------------------------------------------");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        searchElement(matrix, 55);
        sc.close();
    }
}
