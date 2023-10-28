import java.util.*;
public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] mat1 = {{1, 2}, {5, 3}};
        int[][] mat2 = {{2, 3}, {4, 1}};
        
        int rows1 = mat1.length;
        int cols1 = mat1[0].length;
        int rows2 = mat2.length;
        int cols2 = mat2[0].length;
        
        if (cols1 != rows2) {
            System.out.println("Matrix multiplication is not possible.");
        } else {
            int[][] result = new int[rows1][cols2];
            
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols2; j++) {
                    for (int k = 0; k < cols1; k++) {
                        result[i][j] += mat1[i][k] * mat2[k][j];
                    }
                }
            }
            
            System.out.println("Matrix Product:");
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols2; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
