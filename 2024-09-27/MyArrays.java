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
        return str + "]";
    }
    public static int[] returnCopy(int[] arr){
    	int[] copy = new int[arr.length];
	for(int i=0; i<arr.length; i++){
	    copy[i] = arr[i];
	}
	System.out.println(arrayToString(copy));
	System.out.println(arrayToString(arr));
	return copy;
    }
    public static int[] concatArr(int[] arr1, int[] arr2){
        int[] concatarr = new int[arr1.length+arr2.length];
	for(int i=0; i<arr1.length; i++){
	    concatarr[i]=arr1[i];
	}
	for(int i=arr1.length; i<arr1.length+arr2.length; i++){
	    concatarr[i]=arr2[i-arr1.length];
	}
	return concatarr;
    }

    public static boolean testReturnCopy(int[] arr){
        int[] copy = arr.clone();
	for(int i=0; i<arr.length; i++){
	    if(arr[i] != copy[i]){
		    return false;
	    }
	}
	return true;
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
	System.out.println(testReturnCopy(new int[]{1, 2, 3}));
	System.out.println(testConcatArr(new int[]{1, 2, 3}, new int[]{4, 5, 6}));
   
   
   
    }



}
