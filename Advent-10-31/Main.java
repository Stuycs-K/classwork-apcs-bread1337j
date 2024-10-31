import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner("String");
		while(sc.hasNext()){
				System.out.println(sc.next());
		}
		
		Scanner sc1 = new Scanner("This is a bunch of words");
		Scanner sc2 = new Scanner("10.0 1.04 99.0 -3.0 4.2");
		while(sc1.hasNext()){
			System.out.println(sc1.next());
		}
		int sum = 0;
		while(sc2.hasNextDouble()){
			sum += sc2.nextDouble();
		}
		System.out.println(sum);

		try{
			File file = new File("File");
			Scanner input = new Scanner(file);
			while(input.hasNextLine()){
				System.out.println(input.nextLine());
				if(input.hasNextLine()){
					input.nextLine();
				}
			}
			
			
			
			
			input.close();
			



		} catch (FileNotFoundException ex) {
			System.out.println("File not found");
			return;
		}


	}
}

