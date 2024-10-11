public class JohnTests {
    private String[] expected;
    private String[] out;
    private int index = 0;
    int length = 100;
    public JohnTests(int len){
        expected = new String[len];
        out = new String[len];
        length = len;
    }
    public JohnTests(){
        expected = new String[100];
        out = new String[100];
    }

    public String multstring(String str, int n){
        String out = new String();
        for(int i=0; i<n; i++){
            out += str;
        }
        return out;
    }
    public void queue(Object e, Object o){
        expected[index] = "" + e;
        out[index] = "" + o;
        index += 1;
    }

    public void fire(){
        System.out.println("Expected:                     | Result:                      | Correct?");
        System.out.println("-----------------------------------------------------------------------");
        int c = 0;
        for(int i=0; i<expected.length; i++) {if (expected[i]!=null){
            int len = 30 - expected[i].length();
            if (len < 0) {
                len = 0;
            }
            int len2 = 29 - out[i].length();
            if (len2 < 0) {
                len2 = 0;
            } //could definitely be written better if needed, however it is not needed.
            System.out.println(expected[i] + multstring(" ", len) + "| " + out[i] + multstring(" ", len2) + "| " + expected[i].equals(out[i]));
            if (expected[i].equals(out[i])) c += 1;
        }}
        System.out.println("                                                             | % Correct: " + 100 * (double)c / expected.length);
        expected = new String[length];                                                             //
        out = new String[length];
        System.out.println("-----------------------------------------------------------------------");
    }
}
