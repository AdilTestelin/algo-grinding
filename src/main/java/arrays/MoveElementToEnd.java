package arrays;

import java.util.Arrays;

public class MoveElementToEnd {

    /**
     * You are given an array of integers and an integer.
     * Write a function that moves all instances of that integer in the array to the end of the array. Return the array.
     * The function should mutate the input array, i.e. the operation should be performed in place, and doesn’t need to maintain the order of the integers.
     *
     * Sample input
     *
     * array = [1, 2, 1, 1, 3, 4, 1]
     * toMove = 1
     *
     * Sample Output
     *
     * [4,2, 3, 1, 1, 1, 1]
     *
     * Note that 4, 2, 3 doesn’t have to be ordered perfectly.
     */

    public static int[] moveElementToEnd(int[] array, int elementToMove) {
        int leftPointer = 0;
        int rightPointer = array.length - 1;

        while(leftPointer < rightPointer) {
            while (array[rightPointer] == elementToMove) {
                rightPointer--;
            }
            if (array[leftPointer] == elementToMove) {
                array[leftPointer] = array[rightPointer];
                array[rightPointer] = elementToMove;
            }
            leftPointer++;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 1, 1, 3, 4, 1, 2, 4, 6, 5, 5, 4, 4, 4, 1};

        System.out.println(Arrays.toString(moveElementToEnd(array, 4)));
    }
}
