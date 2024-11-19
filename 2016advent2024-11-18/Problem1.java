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
	static int[][] dirs = new int[][]{{0, 1}, {-1, 0}, {0, -1}, {1, 0}};
	public static int[] getDir(int dir){
		if(dir<0){
			dir += 4;
			return getDir(dir);
		}	
		else if(dir>3){
			dir = dir%4;
			return dirs[dir];
		}else{
			return dirs[dir];
		}
	}

	public static void main(String[] args){
		int x = 0;
		int y = 0;
		
		int dir = 0;
		try{
			Scanner sc = new Scanner(new File("Input.txt"));
			while(sc.hasNext()){
				String s = sc.next().replaceAll(",", "");
				s.replaceAll(",", "");
				System.out.println("" + s.charAt(0) + " | " + s.substring(1, s.length()));
				int dist = Integer.valueOf(s.substring(1, s.length()));
				System.out.println(dist);
				if(s.charAt(0) == 'L'){
					dir += 1;
					//System.out.println("L");
					x = x + getDir(dir)[0] * dist;	
					y = y + getDir(dir)[1] * dist;
				}else if(s.charAt(0) == 'R') {
					dir -= 1;
					System.out.println("R, " + dist + " | " + Arrays.toString(getDir(dir)));
					x = x + getDir(dir)[0] * dist;
					y = y + getDir(dir)[1] * dist;
				}
				else{
					System.out.println(s + " " + s.charAt(0) + " " + s.charAt(1));
				}
				System.out.println("" + x + " , " + y + " | " + getDir(dir)[0] + " , " + getDir(dir)[1] + " ; " + dir + " Total dist so far: " + (Math.abs(x) + Math.abs(y)));
		
			}
			System.out.println(Math.abs(x)+Math.abs(y));
		}catch(FileNotFoundException e){}

	
	}
}

