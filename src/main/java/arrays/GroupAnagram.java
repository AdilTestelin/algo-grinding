package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {

    /**
     * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
     * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
     * <p>
     * Example 1:
     * <p>
     * Input: strs = ["eat","tea","tan","ate","nat","bat"]
     * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
     * Example 2:
     * <p>
     * Input: strs = [""]
     * Output: [[""]]
     * Example 3:
     * <p>
     * Input: strs = ["a"]
     * Output: [["a"]]
     */

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String stringSorted = new String(charArray);

            if (map.containsKey(stringSorted)) {
                List<String> array = map.get(stringSorted);
                array.add(str);
                map.put(stringSorted, map.get(stringSorted));
            } else {
                List<String> array = new ArrayList<>();
                array.add(str);
                map.put(stringSorted, array);
            }
        }

        return map.values().stream().toList();
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        System.out.println(groupAnagrams(strs));
    }
}
