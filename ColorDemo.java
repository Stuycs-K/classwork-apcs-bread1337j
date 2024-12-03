import java.util.concurrent.TimeUnit;

public class ColorDemo{
	public static void main(String[] args){
		for(int i=0; i<256; i++){	
		System.out.println("\u001b[H");	
		for(int r = i; r < 256; r+=32){
  			for(int g = i; g <= 256; g+=32){
    				for(int b = i; b <= 256; b+=32){
      					System.out.print("\u001b[38;2;"+r+";"+g+";"+b+";7m.");
    					try{TimeUnit.MILLISECONDS.sleep(1);}catch(Exception e){}
				}
				//System.out.println("\u001b[H");
  			}
    		System.out.println();
		}
		}
	}
}