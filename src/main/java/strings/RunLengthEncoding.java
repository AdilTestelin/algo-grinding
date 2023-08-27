package strings;

public class RunLengthEncoding {

    /**
     * Given a non-empty string, we are asked to write a function that is going to run-length-encode the input string and return the encoded string.
     * Run-length encoding refers to replacing repetitive, consecutive data by a count and one copy of a repeated data.
     * For instance, AAABB will be encoded as 3A2B. If a sequence contains more than 9 consecutive, identical characters, we first encode 9 characters, then the remaining ones.
     * For instance, AAAAAAAAAA (10 As) will be encode as 9A1A.
     */
    public static String runLengthEncoding(String stringToEncode) {
        int start = 0;
        StringBuilder result = new StringBuilder();
        char[] stringToEncodeArray = stringToEncode.toCharArray();
        char currentChar = stringToEncodeArray[0];
        for (int i = 0; i < stringToEncode.length(); i++) {
            if (stringToEncodeArray[i] == currentChar && start < stringToEncode.length() - 1 && start < 9) {
                start++;
            } else {
                result.append(start);
                result.append(currentChar);
                currentChar = stringToEncodeArray[i];
                start = 1;
            }
        }
        result.append(start);
        result.append(currentChar);
        return result.toString();
    }

    public static void main(String[] args) {
        String stringToEncode = "AAAAAAAAAAAAABBCCCCDD";
        System.out.println(runLengthEncoding(stringToEncode));
    }
}
