package arrays;

import java.util.HashMap;

public class ValidAnagram {

  public static boolean validAnagram(String word1, String word2) {
    HashMap<Character, Integer> mapWord1 = new HashMap<>();
    HashMap<Character, Integer> mapWord2 = new HashMap<>();

    char[] word1Array = word1.toCharArray();
    char[] word2Array = word2.toCharArray();

    for (char character: word1Array) {
      if(mapWord1.containsKey(character)) {
        mapWord1.put(character, mapWord1.get(character) + 1);
      } else {
        mapWord1.put(character, 1);
      }
    }

    for (char character: word2Array) {
      if(mapWord2.containsKey(character)) {
        mapWord2.put(character, mapWord2.get(character) + 1);
      } else {
        mapWord2.put(character, 1);
      }
    }

    return mapWord1.equals(mapWord2);
  }
}
