import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;


public class Unique {
  public static void main(String[] args) {
    //  Create a function that takes a list of numbers as a parameter
    //  Returns a list of numbers where every number in the list occurs only once


    //  Example
    System.out.println(unique(new int[]{1, 11, 34, 11, 52, 61, 1, 34}));
    //  should print: `[1, 11, 34, 52, 61]`
  }


  public static ArrayList unique(int[] original) {
    ArrayList<Integer> unique = new ArrayList();
    for (int number : original) {
      if (!unique.contains(number)) {
        unique.add(number);
      }
    }
    return unique;


    // i spent an hour with this below so i'll just leave this here


//    public static boolean contains(int[] arr, int key) {
//      return Arrays.stream(arr).anyMatch(i -> i == key);
//    }

//    int[] unique = new int[original.length];
//    for (int i = 0; i < original.length; i++) {
//

//      unique[i]=original[i];
//      if (!contains(original, original[i])){
//        unique[i]=original[i];
//      }
//
//
//    }
//for (int i=0; i<unique.length;i++)
//{
//  System.out.println(unique[i]);
//}
//return unique;
  }

}

