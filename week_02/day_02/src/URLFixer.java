public class URLFixer {
  public static void main(String... args){
    String url = "https//www.reddit.com/r/nevertellmethebots";

    // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
    // Also, the URL is missing a crutial component, find out what it is and insert it too!
    // Try to solve it more than once using different String functions!
    String fixedUrl=url.replaceAll("https//","https://");
    fixedUrl=fixedUrl.replaceAll("bots", "odds");
    System.out.println(fixedUrl);

    //using split and concat
    String http="https:";
    String odds="odds";
    String[] urls= url.split("https");
    fixedUrl=urls[1];
    urls= fixedUrl.split("bots");
    fixedUrl=urls[0];
    fixedUrl=http.concat(fixedUrl).concat(odds);

    //substrings would also work but i'm too lazy and it's in the TakesLonger exercise

    System.out.println(fixedUrl);
  }
}