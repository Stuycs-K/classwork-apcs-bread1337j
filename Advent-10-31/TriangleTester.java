import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;
public class TriangleTester{
	public static void main(String[] args){
		System.out.println(countTrianglesB("inputTri.txt"));
	}
	public static boolean testTriangle(String[] nums){
		return(Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]) > Integer.parseInt(nums[2])
				&&
			Integer.parseInt(nums[1]) + Integer.parseInt(nums[2]) > Integer.parseInt(nums[0])
				&&
			Integer.parseInt(nums[0]) + Integer.parseInt(nums[2]) > Integer.parseInt(nums[1])
		      );
	}
	public static boolean testTriangle(int[] nums){
		return((nums[0]) + (nums[1]) > (nums[2])
				&&
			(nums[1]) + (nums[2]) > (nums[0])
				&&
			(nums[0]) + (nums[2]) > (nums[1])
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
				//String[] nums1 = sc.nextLine().split("  ", 0);
				//String[] nums2 = sc.nextLine().split("  ", 0);
				//String[] nums3 = sc.nextLine().split("  ", 0); //assume rows are multiples of 3
				int[] nums1 = new int[3];
				int[] nums2 = new int[3];
				int[] nums3 = new int[3]; //the final spaghettification

				nums1[0] = sc.nextInt();
				nums1[1] = sc.nextInt();
				nums1[2] = sc.nextInt();

				nums2[0] = sc.nextInt();
				nums2[1] = sc.nextInt();
				nums2[2] = sc.nextInt();
				
				nums3[0] = sc.nextInt();
				nums3[1] = sc.nextInt();
				nums3[2] = sc.nextInt();


				//for(int i=0; i<3; i++){
				//	nums1[i] = nums1[i].trim();
				//	nums2[i] = nums2[i].trim();
				//	nums3[i] = nums3[i].trim();
				//}


				

				//System.out.println(Arrays.toString(tri1));
				//System.out.println(Arrays.toString(tri2));
				//System.out.println(Arrays.toString(tri3));
				if(testTriangle(new int[]{nums1[0], nums2[0], nums3[0]})) c += 1;
				if(testTriangle(new int[]{nums1[1], nums2[1], nums3[1]})) c += 1;
				if(testTriangle(new int[]{nums1[2], nums2[2], nums3[2]})) c += 1;

			}
			sc.close();	
			return c;
		}catch(FileNotFoundException e){
			System.out.println("File not found");
			return -1;
		}
	}
}
