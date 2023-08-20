package arrays;

import java.util.Arrays;

public class SortedSquaredArray {

    /**
     * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
     * Example 1:
     * <p>
     * Input: nums = [-4,-1,0,3,10]
     * Output: [0,1,9,16,100]
     * Explanation: After squaring, the array becomes [16,1,0,9,100].
     * After sorting, it becomes [0,1,9,16,100].
     * Example 2:
     * <p>
     * Input: nums = [-7,-3,2,3,11]
     * Output: [4,9,9,49,121]
     */

    public static int[] sortedSquaredArray(int[] numbers) {
        int[] result = new int[numbers.length];
        int insertionIndex = numbers.length - 1;
        int leftPointer = 0;
        int rightPointer = numbers.length - 1;

        for (int i = 0; i < numbers.length; i++) {
            int leftValue = Math.abs(numbers[leftPointer]);
            int rightValue = Math.abs(numbers[rightPointer]);

            if (leftValue > rightValue) {
                result[insertionIndex] = leftValue * leftValue;
                leftPointer++;
            } else {
                result[insertionIndex] = rightValue * rightValue;
                rightPointer--;
            }
            insertionIndex--;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {-7, -5, -4, 3, 6, 8, 9, 10};
        System.out.println(Arrays.toString(sortedSquaredArray(numbers)));
    }
}
