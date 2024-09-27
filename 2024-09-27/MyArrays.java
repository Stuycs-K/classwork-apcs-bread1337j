public class MyArrays{
    public static String arrayToString(int[]nums){
        String str = "[";
        for(int i: nums){
            str += i;
            str += ", ";
        }
        if(str.length() > 3){
            str = str.substring(0, str.length()-2); //could definitely write this better but whatveer
        }
        return str;
    }
    public static boolean testReturnCopy(int[] arr){
        return(returnCopy(arr) == arr.clone());
    }
    public static boolean testConcatArr(int[] arr1, int[] arr2){
        int[] concatarr = concatArr(arr1, arr2);
        for(int i=0; i<concatarr.length; i++){
            if(i<arr1.length){
                if(concatarr[i] != arr1[i]){
                    return false;
                }
            }else{
                if(concatarr[i]!=arr2[i-arr1.length]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){

    }

}
