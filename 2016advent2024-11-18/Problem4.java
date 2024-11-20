import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

class bebra{
	char c;
	int n;
}
public class Problem4{
	//notes for future self: just convert to char and compare that. do NOT make an array of the alphabet
	//sum for the example test case should be 1514
	public static void main(String[] args){
		try{
			Scanner sc = new Scanner(new File("Input4.txt"));
			int sum = 0;
			while(sc.hasNextLine()){

				//make goofy ahh arrays
				String line = sc.nextLine();
				String[] s = line.split("-");
				String[] values = Arrays.copyOfRange(s, 0, s.length-1);
				ArrayList<Character> yes = new ArrayList<Character>(10);
				ArrayList<Integer> yup = new ArrayList<Integer>(10);
				for(String i : values){
					for(int j=0; j<i.length(); j++){
						int no = yes.indexOf(i.charAt(j));
						if(no==-1){
							yes.add(i.charAt(j));
							yup.add(1);
						}else {
							yup.set(no, yup.get(no)+1);
						}
					}


				}
				System.out.println(yes);
				System.out.println(yup);

				//adjust the arrays by order of appearance
				int n = yup.size();
				for (int i = 0; i < n - 1; i++) {
					for (int j = 0; j < n - i - 1; j++) {
						if (yup.get(j) > yup.get(j+1)) {
							int temp = yup.get(j);
							yup.set(j, yup.get(j+1));
							yup.set((j + 1), temp);
							char temp2 = yes.get(j);
							yes.set(j, yes.get(j+1));
							yes.set((j+1), temp2);
						}
					}
				}
				Collections.reverse(yes);
				Collections.reverse(yup);
				System.out.println(yes);
				System.out.println(yup);


				//grab the thingamajig at the end and the sector id
				String thingamajig = s[s.length-1].split("\\[")[1];
				thingamajig = thingamajig.substring(0, thingamajig.length()-1);
				int sector = Integer.valueOf(s[s.length-1].split("\\[")[0]);

				//System.out.println(thingamajig);
				//System.out.println(sector);

				//this is what writing code while half a sleep leads to saved for future records in a museum.
				/*

				int checked = 999999999;
				for(int i=0; i<5; i++){
					char checker = thingamajig.charAt(i);
					System.out.println(checker);
					if(yes.indexOf(checker) == -1){
						System.out.println("Not present break");
						toAdd = false;
						break;
					}
					int check = yup.get(yes.indexOf(checker));
					if(check > checked) {toAdd = false;  System.out.println("amount break"); break;}
					if(check == checked) {
						if(i>0) {
							if (checker - thingamajig.charAt(i - 1) < 0) {
								System.out.println("alphabet break");
								toAdd = false;
								break;
							}
						}
					}
					checked = check;
				}*/
				boolean toAdd = true;
				//check if toAdd should stay as true

				//add
				if(toAdd){
					sum += sector;
				}
				System.out.println(sum);
			}



		}catch(FileNotFoundException e){}
	
	}
}
