public class ChangeElement {
  //      # - Create an array variable named `s`
//      #   with the following content: `[1, 2, 3, 8, 5, 6]`
//      # - Change the 8 to 4
//      # - Print the fourth element
  public static void main(String[] args) {
    int[] s = new int[]{1, 2, 3, 8, 5, 6};
    // not sure if i should change just s[3] or ALL 8's, so i'll do the more complicated one
for (int i=0; i<s.length; i++){
  if (s[i]==8) {s[i]=4;}

    }
    System.out.println(s[3]);
  }
}
