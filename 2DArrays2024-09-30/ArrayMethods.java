public class ArrayMethods{
    //TEST CASE ARRAYS
    static int[][] arr1 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    static int[][] arr2 = new int[][]{{5, 5, 5}, {5, 5, 5}, {5, 5, 5}};
    static int[][] arr3 = new int[100][100]; //should be 0s
    static int[][] arr4 = new int[][]{};





    public static String arrayToString(int[] nums){
        String endstring = "[";
        for (int i =0; i< nums.length; i++){
            endstring += nums[i];
            endstring += ", ";}
        endstring = endstring.substring(0, (endstring.length() - 2)) + "]";
        return endstring;}


    public static String arr2DToStr(int[][] arr){
        String s = "[";
        for(int[] i : arr){
            s += arrayToString(i);
            s += ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s + "]";
    }

    public static int arr2DSum(int[][] nums){
        int c = 0;
        for(int[] arr : nums){
            for(int i : arr){
                c += i;
            }
        }
        return c;
    }
    /**Rotate an array by returning a new array with the rows and columns swapped.
     * You may assume the array is rectangular and neither rows nor cols is 0.
     * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
     */
    public static int[][] swapRC(int[][]nums){
        int[][] arr = new int[nums[0].length][nums.length];
        for(int i=0; i < nums[0].length; i++) {

            for (int j = 0; j < nums.length; j++) {
                arr[i][j] = nums[j][i];
            }
        }



        return arr;
    }


    public static void main(String[] args){
        System.out.println("arrayToString([1, 2, 3])" + " -> " + arrayToString(new int[]{1, 2, 3}));
        System.out.println("arr2DToStr");
        System.out.println("[[1, 2, 3], [4, 5, 6], [7, 8, 9]]" + " | " + arr2DToStr(arr1));
        System.out.println("arr2DSum");
        System.out.println(arr2DSum(arr1) + "| 45");
        System.out.println(arr2DSum(arr2) + "| 45");
        System.out.println(arr2DSum(arr3) + "| 0");
        System.out.println(arr2DSum(arr4) + "| 0");
        System.out.println("swapRC");
        System.out.println(arr2DToStr(swapRC(new int[][]{{1,2,3},{4,5,6}})) + " | [[1,4],[2,5],[3,6]]");

    }


}
