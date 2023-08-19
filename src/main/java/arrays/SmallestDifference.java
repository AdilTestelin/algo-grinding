package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SmallestDifference {

    /**
     * Write a function that takes in two non-empty arrays of integers.
     * The function should nd the pair of numbers (one from the rst array, one from the second array) whose absolute difference is closest to zero.
     * The function should return an array containing these two numbers, with the number from the rst array in the rst position.
     * Assume that there will only be one pair of numbers with the smallest difference.
     * Sample input: [-1, 5, 10, 20, 28, 3], [26, 134, 135, 15, 17] Sample output: [28, 26]
     */

    public static int[] smallestDifference(int[] firstArray, int[] secondArray) {
        int pointerFirstArray = 0;
        int pointerSecondArray = 0;
        int smallestDifference = Integer.MAX_VALUE;
        int[] result = new int[2];

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        while (pointerFirstArray < firstArray.length && pointerSecondArray < secondArray.length) {
            int currentDifference = Math.abs(firstArray[pointerFirstArray] - secondArray[pointerSecondArray]);
            if (currentDifference < smallestDifference) {
                smallestDifference = currentDifference;
                result = new int[]{firstArray[pointerFirstArray], secondArray[pointerSecondArray]};

                pointerFirstArray++;
            } else {
                pointerSecondArray++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] firstArray = {-1, 3, 5, 10, 20};
        int[] secondArray = {15, 17, 26, 134, 135};
        System.out.println(Arrays.toString(smallestDifference(firstArray, secondArray)));
    }
}
