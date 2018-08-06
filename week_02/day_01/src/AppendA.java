public class AppendA {
  // - Create an array variable named `animals`
//   with the following content: `["koal", "pand", "zebr"]`
// - Add all elements an `"a"` at the end
  public static void main(String[] args) {
    String[] animals= new String[] {"koal", "pand", "zebr", "rók"};

    for (int i=0; i<animals.length;i++){
      animals[i]+="a";
    }


      for (int j = 0; j < animals.length; j++) {
        System.out.print(animals[j] + " ");
      }


  }

}
