package src;

import src.Util.JohnTimer;

import java.util.*;

public class Main{
	public static void main(String[] args){
		JohnTimer timer = new JohnTimer();
		System.out.println("Timing creation of array of length 20000000, in ms");
		timer.start();
		createRandomArray(20000000);
		timer.record();
		timer.displayms();
		System.out.println("Doing it a few more times for good measure");
		for(int i=0; i<4; i++){
			createRandomArray(20000000);
			timer.record();
			timer.displayms();
		}
	}

	static String[] intarr = new String[]{"", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
	public static ArrayList<String> createRandomArray(int size){	
		ArrayList<String> arr = new ArrayList<String>(size+1);

		for(int i=0; i<size; i++){
			arr.add(intarr[(int)(Math.random()*11)]);
		}

		return arr;
	
	}
}
