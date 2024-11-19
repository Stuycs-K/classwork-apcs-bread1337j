import java.util.*;
import java.io.*;


public class Problem1{
	//static int[] dir = new int[]{0, 1};
	//static int[] matrix1 = new int[]{0, -1, 1, 0};
	//static int[] matrix2 = new int[]{0, 1, -1, 0};
	//public static int[] multiply(int[] var1, int[] multiplier){
//		int[] result = new int[2];
//		result[0] = var1[0] * multiplier[0] + var1[1] * multiplier[1];
//	        result[1] = var1[1] * multiplier[2] + var1[1] * multiplier[3];
//		return result;	
//	}
	static int dir = 0;

	public static void changeDir(int c){
		dir += c;
		if(dir<0){
			dir = Math.abs(dir);
		}
		if(dir>3){
			dir = dir%4;
		}
	}

	public static void main(String[] args){
		int x = 0;
		int y = 0;
		int[][] dirs = new int[][]{{0, 1}, {-1, 0}, {0, -1}, {1, 0}};
		int dir = 0;
		try{
			Scanner sc = new Scanner(new File("Input.txt"));
			while(sc.hasNext()){
				String s = sc.next();
				if(s.charAt(0) == 'L'){
					changeDir(1);
					x += dirs[dir][0] * Character.getNumericValue(s.charAt(1));	
				}else if(s.charAt(0) == 'R') {
					changeDir(-1);
					y += dirs[dir][1] * Character.getNumericValue(s.charAt(1));
				}
				else{
					System.out.println(s + " " + s.charAt(0) + " " + s.charAt(1));
				}
		
			}
			System.out.println(x+y);
		}catch(FileNotFoundException e){}

	
	}
}

