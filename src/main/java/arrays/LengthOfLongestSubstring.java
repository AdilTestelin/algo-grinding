package arrays;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {

    /**
     * Use of a two pointers methods to keep tracks of the substring in the String
     */
    public static int lengthOfLongestSubstring(String s) {
        int counter = 0;
        int temporaryCounter = 0;
        int leftPointer = 0;
        int rightPointer = 0;
        Set<Character> currentSubstring = new HashSet<>();
        int stringLength = s.length();

        if(s.isEmpty()) {
            return 0;
        }

        if(s.length() == 1 || s.isBlank()) {
            return 1;
        }

        while (leftPointer < stringLength && rightPointer < stringLength) {
            Character currentCharacter = s.charAt(rightPointer);
            if(!currentSubstring.contains(currentCharacter)) {
                currentSubstring.add(s.charAt(rightPointer));
                temporaryCounter++;
                rightPointer++;
            } else {
                leftPointer++;
                rightPointer = leftPointer;
                currentSubstring = new HashSet<>();
                temporaryCounter = 0;
            }
            if(counter < temporaryCounter) {
                counter = temporaryCounter;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        String test = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(test));
    }
}
