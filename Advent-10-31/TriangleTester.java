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
				String[] nums1 = new String[3];
				String[] nums2 = new String[3];
				String[] nums3 = new String[3]; //the final spaghettification

				nums1[0] = sc.next();
				nums1[1] = sc.next();
				nums1[2] = sc.next();

				nums2[0] = sc.next();
				nums2[1] = sc.next();
				nums2[2] = sc.next();
				
				nums3[0] = sc.next();
				nums3[1] = sc.next();
				nums3[2] = sc.next();



				//for(int i=0; i<3; i++){
				//	nums1[i] = nums1[i].trim();
				//	nums2[i] = nums2[i].trim();
				//	nums3[i] = nums3[i].trim();
				//}


				String[] tri1 = new String[]{nums1[0], nums2[0], nums3[0]};
				String[] tri2 = new String[]{nums1[1], nums2[1], nums3[1]};
				String[] tri3 = new String[]{nums1[2], nums2[2], nums3[2]};

				//System.out.println(Arrays.toString(tri1));
				//System.out.println(Arrays.toString(tri2));
				//System.out.println(Arrays.toString(tri3));
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
