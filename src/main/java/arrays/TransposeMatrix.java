package arrays;

import java.util.Arrays;

public class TransposeMatrix {

    public static int[][] transposeMatrix(int[][] matrix) {
        int row = matrix.length;
        int columns = matrix[0].length;

        int[][] result = new int[row][columns];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix[j][i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.deepToString(transposeMatrix(matrix)));
    }
}
