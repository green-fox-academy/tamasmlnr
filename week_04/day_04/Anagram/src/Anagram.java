public class Anagram {

  public boolean isAnagram(String word1, String word2) {
    if (word1.length() == word2.length()) {
      for (int i = 0; i < word1.length(); i++) {
        if (word1.charAt(i) != (word2.charAt(word1.length() - 1 - i))) return false;
      }
    } else return false;
    return true;
  }
}
