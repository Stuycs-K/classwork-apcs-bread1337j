import Util.JohnTests;

import java.util.Arrays;

public class ArrayDemo{
  static int[][] arr1 = new int[][]{{0,0,0},{1,1,0},{},{0,0,1},{1,1,1,1,1,0,1,1,1}};
  static int[][] arr2 = new int[][]{{-1, -2, 3}, {4, -5, 6}, {7, 8, -9}};
  public static void main(String[]args){
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()
    JohnTests Tester = new JohnTests();
    Tester.queue(7, countZeros2D(arr1));


    Tester.queue(11, arr2DSum(arr1));

    replaceNegative(arr2);
    Tester.queue("[[1, 0, 3], [4, 1, 6], [7, 8, 1]]", arrToString(arr2));

    Tester.queue("<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>", htmlTable(new int[][]{{1,2},{3}}));
    Tester.fire(1, true);
  }
  //0. Include your prior methods to help you print a 1D/2D array of ints.
  public static String arrToString(int[]arr){
    return Arrays.toString(arr);
  }

  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
  public static String arrToString(int[][]arr){
    String s = "[";
        for(int[] i : arr){
            s += arrToString(i);
            s += ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s + "]";
  }

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
    int c = 0;
    for(int[] i : nums){
      for(int j : i){
        if(j==0) c+= 1;
      }
    }
    return c;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
  public static int arrSum(int[] arr){
    int c = 0;
    for(int i : arr){
      c += i;
    }
    return c;
  }
  public static int arr2DSum(int[][] arr){
    int c = 0;
    for(int[] i : arr){
      c += arrSum(i);
    }
    return c;
  }

  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  //already did this for a homework
  public static void replaceNegative(int[][] vals){
        for(int i=0; i<vals.length; i++){
            for(int j=0; j<vals.length; j++){
                if(j==i){
                    if(vals[i][j] < 0){
                        vals[i][j] = 1;
                    }
                }else{
                    if(vals[i][j] < 0){
                        vals[i][j] = 0;
                    }
                }
            }
        }
    }

  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.
  public static int[] copy(int[] arr){
        int[] copylst = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            copylst[i] = arr[i];
        }
        return copylst;
    }
    public static int[][] copy(int[][] nums){
        int[][] copylst = new int[nums.length][];
        for(int i=0; i<nums.length; i++){
            copylst[i] = copy(nums[i]);
        }
        return copylst;
    }

  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC(int[][]nums){
        int[][] arr = new int[nums[0].length][nums.length];
        for(int i=0; i < nums[0].length; i++) {
            for (int j = 0; j < nums.length; j++) {
                arr[i][j] = nums[j][i];
            }
        }
        return arr;
    }

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][]nums){
    String why = "<table>";
    for(int[] aaaaa : nums) {
        why += "<tr>";
        for (int bbbbb : aaaaa) {
            why += "<td>" + bbbbb + "</td>";
        }
        why += "</tr>";
    }
    return why + "</table>";

  }
}
