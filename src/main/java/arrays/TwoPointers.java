package arrays;

import java.util.Arrays;

public class TwoPointers {
    public static int[] twoPointers(int[] nums, int target) {
        int[] arrayResult = new int[2];
        nums = Arrays.stream(nums).sorted().toArray();
        int leftPointer = 0;
        int rightPointer = nums.length - 1;
        for(int i = 0; i < nums.length; i++) {
            if(leftPointer != rightPointer && nums[leftPointer] + nums[rightPointer] == target) {
                arrayResult[0] = leftPointer;
                arrayResult[1] = rightPointer;
                return arrayResult;
            } else if(nums[leftPointer] + nums[rightPointer] < target) {
                leftPointer++;
            } else if(nums[leftPointer] + nums[rightPointer] > target) {
                rightPointer--;
            }
        }
        return arrayResult;
    }

}
