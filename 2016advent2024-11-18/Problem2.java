import java.util.*;
import java.io.*;


public class Problem2{

	static String[][] map = new String[][]{
			{null, null, "1", null, null},
			{null, "2", "3", "4", null},
			{"5", "6", "7", "8", "9"},
			{null, "A", "B", "C", null},
			{null, null, "D", null, null}
	};


	static int x = 2;
	static int y = 1;
	public static void sanitaryCordChange(int shiftx, int shifty){
		if(y+shifty>4){return;}
		if(x+shiftx>4){return;}
		if(x+shiftx<0){return;}
		if(y+shifty<0){return;}
		if(map[y+shifty][x+shiftx] != null){
			x += shiftx;
			y += shifty;
		}


		//if(x<1){x = 1;}
		//if(y<0){y = 0;}
		//if(x>3){x = 3;}
		//if(y>2){y = 2;}
	
	
	}


	public static void main(String[] args){
		
		try{
			
			Scanner sc = new Scanner(new File("Input2.txt"));
			while(sc.hasNext()){
				String s = sc.next();
				for(int i=0; i<s.length(); i++){
					char c = s.charAt(i);
					if(c=='U'){
				        	sanitaryCordChange(0, -1);		
					}
					if(c=='L'){
						sanitaryCordChange(-1, 0);
					}
					if(c=='R'){
						sanitaryCordChange(1, 0);
					}
					if(c=='D'){
						sanitaryCordChange(0, 1);
					}
				}
				System.out.println(map[y][x]);
			
			
			}

		}catch(FileNotFoundException e){}		
	}
}
