public class JohnTests {

    public void printA(){
        System.out.println("A");
    }

    public static String multstring(String str, int n){
        String out = new String();
        for(int i=0; i<n; i++){
            out += str;
        }
        return out;
    }


    public static void test(String expected, String out){
        int len = 30 - expected.length();
        if(len < 0){
            len = 0;
        }
        int len2 = 29 - out.length();
        if(len2 < 0){
            len2 = 0;
        } //could definitely be written better if needed, however it is not needed.
        System.out.println(expected + multstring(" ", len) + "| " + out + multstring(" ", len2) + "| " + expected.equals(out));

    }
}
