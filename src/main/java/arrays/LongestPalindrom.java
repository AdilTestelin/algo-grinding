package arrays;

public class LongestPalindrom {

    /**
     * Works while using a two pointers, exceed the time limit complexity on leetcode for extremely large string (due to the number of comparaison to make I think).
     */
    public static String longestPalindrome(String s) {
        int left = 0;
        int right = s.length();
        String substring = "";

        if (s.length() == 1) {
            return s;
        }

        while (left != s.length() - 1) {
            String currentSubstring = s.substring(left, right);
            if (currentSubstring.equals(new StringBuilder(currentSubstring).reverse().toString())) {
                if (currentSubstring.length() > substring.length()) {
                    substring = currentSubstring;
                }
                left++;
                right = s.length();
            } else {
                right--;
            }
        }
        return substring;
    }

    public static void main(String[] args) {
        String test = "\"cmmrracelnclsbtdmuxtfiyahrvxuwreyorosyqapfpnsntommsujibzwhgugwtvxsdsltiiyymiofbslwbwevmjrsbbssicnxptvwmsmiifypoujftxylpyvirfueagprfyyydxeiftathaygmolkcwoaavmdmjsuwoibtuqoewaexihispsshwnsurjopdwttlzyqdbkypvjsbuidsdnpgklhwfnqdvlffcysnxeywvwvblatmxbflnuykhfhjptenhcxqinomlwalvlezefqybpuepbnymzlruuirpiatqgjgcnfmrlzshauoxuoqopcikogfwpssjdeplytcapmujyvgtfmmolnuadpwblgmcaututcrwsqrlpaaqobjfnhudmsulztbdkxpfejavastxejtpbqfftdtcdhvtpbzfuqcwkxtldtjycreimiujtxudtmokcoebhodbkgkgxjzrgyuqhozqtidltodlkziyofdeszwiobkwesdijxbbagguxvofvtphqxgvidqfkljufgubjmjllxoanbizwtedykwmneaosopynzlzvrlqcmyaahdcagfatlhwtgqxsyxwjhexfiplwtrtydjzrsysrcwszlntwrpgfedhgjzhztffqnjotlfudvczwfkhuwmdzcqgrmfttwaxocohtuscdxwfvhcymjpkqexusdaccw\"";
        System.out.println(longestPalindrome(test));
    }

}
