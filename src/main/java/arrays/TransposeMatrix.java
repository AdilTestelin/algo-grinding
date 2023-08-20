package arrays;

import java.util.Arrays;

public class TransposeMatrix {

    /**
     * Given a 2D integer array matrix, return the transpose of matrix.
     * <p>
     * The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
     * <p>
     * Example 1:
     * <p>
     * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
     * Output: [[1,4,7],[2,5,8],[3,6,9]]
     * Example 2:
     * <p>
     * Input: matrix = [[1,2,3],[4,5,6]]
     * Output: [[1,4],[2,5],[3,6]]
     */

    public static int[][] transposeMatrix(int[][] matrix) {
        int row = matrix.length;
        int columns = matrix[0].length;

        int[][] result = new int[columns][row];

        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < row; j++) {
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
