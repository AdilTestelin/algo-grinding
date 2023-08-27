package arrays;

public class BinarySearch {

    /**
     * Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums.
     * If target exists, then return its index. Otherwise, return -1.
     * <p>
     * You must write an algorithm with O(log n) runtime complexity.
     */
    public static int search(int[] nums, int target) {
        int leftPointer = 0;
        int rightPointer = nums.length - 1;

        while (leftPointer <= rightPointer) {
            int pivot = leftPointer + (rightPointer - leftPointer) / 2;

            if (nums[pivot] == target) {
                return pivot;
            } else if (nums[pivot] < target) {
                leftPointer = pivot + 1;
            } else {
                rightPointer = pivot - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};

        System.out.println(search(nums, 2));
    }
}
