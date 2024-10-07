public class ArrayMethods{
    //TEST CASE ARRAYS
    static int[][] arr1 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    static int[][] arr2 = new int[][]{{5, 5, 5}, {5, 5, 5}, {5, 5, 5}};
    static int[][] arr3 = new int[100][100]; //should be 0s
    static int[][] arr4 = new int[][]{};
    static int[][] arr5 = new int[][]{{-1, -2, 3}, {4, -5, 6}, {7, 8, -9}};




    public static String arrayToString(int[] nums){
        String endstring = "[";
        for (int i =0; i< nums.length; i++){
            endstring += nums[i];
            endstring += ", ";}
        endstring = endstring.substring(0, (endstring.length() - 2)) + "]";
        return endstring;}


    public static String arrayToString(int[][] arr){
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

    public static void main(String[] args){
        System.out.println("arrayToString([1, 2, 3])" + " -> " + arrayToString(new int[]{1, 2, 3}));
        System.out.println("arr2DToStr");
        System.out.println("[[1, 2, 3], [4, 5, 6], [7, 8, 9]]" + " | " + arrayToString(arr1));
        System.out.println("arr2DSum");
        System.out.println(arr2DSum(arr1) + "| 45");
        System.out.println(arr2DSum(arr2) + "| 45");
        System.out.println(arr2DSum(arr3) + "| 0");
        System.out.println(arr2DSum(arr4) + "| 0");
        System.out.println("swapRC");
        System.out.println(arrayToString(swapRC(new int[][]{{1,2,3},{4,5,6}})) + " | [[1,4],[2,5],[3,6]]");
        System.out.println("copy");
        int[][] arr6 = copy(arr5);
        System.out.println(arrayToString(arr6) + " | " + arrayToString(arr5));
        System.out.println("replaceNegative");
        replaceNegative(arr5);
        System.out.println("[[1, 0, 3], [4, 1, 6], [7, 8, 1]] | " + arrayToString(arr5));
        System.out.println("Making sure the copy didn't change with it");
        System.out.println(arrayToString(arr6));
    }


}
