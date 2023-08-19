package arrays;

public class ValidateSubsequence {

    /**
     * Given two non-empty arrays of integers, write a function that determines whether the second array is a subsequence of the first one.
     * A subsequence of an array is a set of numbers that aren't necessarily adjacent in the array but that are in the same order as they appear in the array.
     */

    public static boolean validateSubsequence(int[] array, int[] sequence) {
        int sequenceOffset = 0;

        for(int i = 0; i < array.length; i++) {
            if(sequenceOffset == array.length) {
                break;
            }
            if(array[i] == sequence[sequenceOffset]) {
                sequenceOffset++;
            }
        }
        return sequenceOffset == sequence.length;
    }

    public static void main(String[] args) {
        int[] array = {5, 1, 22, 25, 6, -1, 8, 10};
        int[] sequence = {1, 22, -1, 10};

        System.out.println(validateSubsequence(array, sequence));
    }
}
