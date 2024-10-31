import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester{
	public static void main(String[] args){
		System.out.println(countTrianglesA("InputA.txt"));
	}
	public static boolean testTriangle(String[] nums){
		return(Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]) > Integer.parseInt(nums[2])
				&&
			Integer.parseInt(nums[1]) + Integer.parseInt(nums[2]) > Integer.parseInt(nums[0])
				&&
			Integer.parseInt(nums[0]) + Integer.parseInt(nums[2]) > Integer.parseInt(nums[1])
		      );
	}

	public static int countTrianglesA(String filename){
		try{
			File in = new File(filename);
			Scanner sc = new Scanner(in);
			int c = 0;
			while(sc.hasNextLine()){
				String[] nums = sc.nextLine().split(" ");
				if(testTriangle(nums)) c+=1;
			}
			sc.close();	
			return c;
		}catch(FileNotFoundException e){
			System.out.println("File not found");
			return -1;
		}
	}
}
