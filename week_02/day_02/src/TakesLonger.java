public class TakesLonger {
  public static void main(String... args){
    String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

    // When saving this quote a disk error has occured. Please fix it.
    // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
    // Using pieces of the quote variable (instead of just redefining the string)
    String partOne=quote.substring(0,21);
    String partTwo="always takes longer than";
    String partThree=quote.substring(20,quote.length());
    quote=partOne+partTwo+partThree;

    System.out.println(quote);
  }
}