package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in
 * any order.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,1,1,2,2,3], k = 2
 * Output: [1,2]
 * Example 2:
 * <p>
 * Input: nums = [1], k = 1
 * Output: [1]
 */
public class TopKFrequentElements {

  public static int[] topKFrequentElements(int[] nums, int k) {
    List<Integer> result = new ArrayList<>();
    Map<Integer, Integer> frequency = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (!frequency.containsKey(nums[i])) {
        frequency.put(nums[i], 1);
      } else {
        frequency.put(nums[i], frequency.get(nums[i]) + 1);
      }
    }
    for (int i = 0; i < k; i++) {
      int maxValue = Integer.MIN_VALUE;
      int maxKey = 0;
      for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
        if (entry.getValue() > maxValue) {
          maxValue = entry.getValue();
          maxKey = entry.getKey();
        }
      }
      result.add(maxKey);
      frequency.remove(maxKey);
    }

    return result.stream().mapToInt(i -> i).toArray();
  }
}
