package arrays;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if
 * every element is distinct.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,1]
 * Output: true
 * Example 2:
 *
 * Input: nums = [1,2,3,4]
 * Output: false
 * Example 3:
 *
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 */
public class ContainsDuplicate {

  public static boolean containsDuplicate(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i = 0; i < nums.length; i++) {
      if(map.containsKey(nums[i])) {
        map.put(nums[i], map.get(nums[i]) + 1);
      } else {
        map.put(nums[i], 1);
      }
    }

    for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue() > 1) {
        return false;
      }
    }
    return true;
  }


  public static boolean containsDuplicateWithSet(int[] nums) {
    HashSet<Integer> set = new HashSet<>();

    for (int i = 0; i < nums.length; i++) {
      if(!set.add(nums[i])) {
        return false;
      }
    }
    return true;
  }
}
