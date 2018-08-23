import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

  @org.junit.jupiter.api.Test
  void isAnagram() {
    Anagram anagramFinder=new Anagram();
    assertTrue(anagramFinder.isAnagram("abd","dba"));
  }
}