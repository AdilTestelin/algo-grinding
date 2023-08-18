package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    // BruteForce
    public static int[] twoSumBruteforce(int[] nums, int target) {
        int[] arrayResult = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    arrayResult[0] = i;
                    arrayResult[1] = j;
                    return arrayResult;
                }
            }
        }
        return arrayResult;
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mapOfIndex = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            mapOfIndex.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int y = target - nums[i];

            if (mapOfIndex.containsKey(y) && mapOfIndex.get(y) != i) {
                result = new int[]{mapOfIndex.get(y), i};
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] input = {3,3};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(input, target)));
    }
}
