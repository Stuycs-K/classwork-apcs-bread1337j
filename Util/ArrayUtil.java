package Util;

import java.util.Arrays;

public class ArrayUtil {
    public static String arrToString(int[]arr){
        return Arrays.toString(arr);
    }

    public static String arrToString(int[][]arr){
        String s = "[";
        for(int[] i : arr){
            s += arrToString(i);
            s += ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s + "]";
    }

    public static int countZeros2D(int[][] nums){
        int c = 0;
        for(int[] i : nums){
            for(int j : i){
                if(j==0) c+= 1;
            }
        }
        return c;
    }

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

    public static int[][] swapRC(int[][]nums){
        int[][] arr = new int[nums[0].length][nums.length];
        for(int i=0; i < nums[0].length; i++) {
            for (int j = 0; j < nums.length; j++) {
                arr[i][j] = nums[j][i];
            }
        }
        return arr;
    }

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