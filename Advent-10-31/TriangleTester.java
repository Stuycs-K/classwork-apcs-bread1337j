import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;
public class TriangleTester{
	public static void main(String[] args){
		System.out.println(countTrianglesB("InputB.txt"));
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

	public static int countTrianglesB(String filename){
		try{
			File in = new File(filename);
			Scanner sc = new Scanner(in);
			int c = 0;
			while(sc.hasNextLine()){
				String[] nums1 = sc.nextLine().split(" ");
				String[] nums2 = sc.nextLine().split(" ");
				String[] nums3 = sc.nextLine().split(" "); //assume rows are multiples of 3

				String[] tri1 = new String[]{nums1[0], nums2[0], nums3[0]};
				String[] tri2 = new String[]{nums1[1], nums2[1], nums3[1]};
				String[] tri3 = new String[]{nums1[2], nums2[2], nums3[2]};

				System.out.println(Arrays.toString(tri1));
				System.out.println(Arrays.toString(tri2));
				System.out.println(Arrays.toString(tri3));
				if(testTriangle(tri1)) c += 1;
				if(testTriangle(tri2)) c += 1;
				if(testTriangle(tri3)) c += 1;

			}
			sc.close();	
			return c;
		}catch(FileNotFoundException e){
			System.out.println("File not found");
			return -1;
		}
	}
}
