package strings;

public class PalindromeCheck {

    /**
     * Problem Statement
     * Write a function that takes in a non-empty string and that returns a boolean representing whether or not the string is a palindrome.
     * A palindrome is dened as a string that is written the same forward and backward.
     * <p>
     * Sample input:"abcdcba"
     * <p>
     * Sample output: True (it is a palindrome)
     */
    public static boolean palindromeCheck(String word) {
        int leftPointer = 0;
        int rightPointer = word.length() - 1;

        char[] wordArray = word.toCharArray();

        while (leftPointer < rightPointer) {
            if (wordArray[leftPointer] != wordArray[rightPointer]) {
                return false;
            }
            leftPointer++;
            rightPointer--;
        }
        return true;
    }


    public static void main(String[] args) {
        String palindrome = "abcdcba";
        System.out.println(palindromeCheck(palindrome));
    }
}
