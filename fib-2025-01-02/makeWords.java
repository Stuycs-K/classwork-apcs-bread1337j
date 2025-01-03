import java.io.*;

public class makeWords {
	
	public static OutputStream printout = new BufferedOutputStream(System.out);
	public static void makeWords(int ltrs, String out, String in){
		if(out==null){
			out = new String();
		}
		if(ltrs==0){
		try{
			printout.write((out + "\n").getBytes());			
		}catch(IOException e){System.out.println("Caught IO Exception!");}
		}else{
			for(int i=0; i<in.length(); i++){
				makeWords(ltrs-1, out + in.charAt(i), in);
			}
		}
	}
	

	public static void main(String[] args){
		makeWords(8, "", "abcdef");
		try{
			printout.flush();
		}catch(IOException ignored){
			
		}
	}
}
