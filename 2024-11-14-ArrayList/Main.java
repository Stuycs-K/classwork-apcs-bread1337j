import Util.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		JohnTimer timer = new JohnTimer();
		timer.start();
		createRandomArray(20000);
		timer.record();
		timer.displayms();
		createRandomArray(2000000);
		timer.record();
		timer.displayms();
	}

	static String[] intarr = new String[]{"", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
	public static ArrayList<String> createRandomArray(int size){	
		ArrayList<String> arr = new ArrayList<String>(size);

		for(int i=0; i<size; i++){
			arr.add(intarr[(int)(Math.random()*11)]);
		}

		return arr;
	
	}
}
