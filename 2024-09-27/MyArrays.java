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
    
    public static void main(String[] args){

    }

}