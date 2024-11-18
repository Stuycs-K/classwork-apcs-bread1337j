package src;

import src.Util.JohnTimer;

import java.lang.reflect.Array;
import java.util.*;

public class Main{
	public static void main(String[] args){
		JohnTimer timer = new JohnTimer();
		System.out.println("Timing creation of array of length 50000000, in ms");
		timer.start();
		ArrayList<String> longarr = createRandomArray(50000000);
		timer.record();
		timer.displayms();
		System.out.println("Doing it a few more times for good measure");
		for(int i=0; i<10; i++){
			createRandomArray(50000000);
			timer.record();
			timer.displayms();
		}

		System.out.println("Making random array of length 100:");
		ArrayList<String> randarr = createRandomArray(100);
		System.out.println(randarr);
		System.out.println("Running it through replaceEmpty:");
		ArrayListPractice.replaceEmpty(randarr);
		System.out.println(randarr);
		System.out.println("Running the very long arraylist through replaceEmpty:");
		timer.start();
		ArrayListPractice.replaceEmpty(longarr);
		timer.record();
		timer.displayms();
		System.out.println("Reversing the array:");
		ArrayList<String> reverserandarr = ArrayListPractice.makeReversedList(randarr);
		System.out.println(reverserandarr);
		System.out.println("Reversing the very long array: ");
		timer.start();
		ArrayList<String> reversedlongarr = ArrayListPractice.makeReversedList(longarr);
		timer.record();
		timer.displayms();
		System.out.println("Mixing array with it's reversed version");
		ArrayList<String> mix = ArrayListPractice.mixLists(randarr, reverserandarr);
		System.out.println(mix);
		System.out.println("Mixing the very long arrays: ");
		timer.start();
		ArrayList<String> veryLongMix = ArrayListPractice.mixLists(longarr, reversedlongarr);
		timer.record();
		timer.displayms();

	}
	static SplittableRandom rand = new SplittableRandom(); //faster math.random()
	static String[] intarr = new String[]{"", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
	public static ArrayList<String> createRandomArray(int size){	
		ArrayList<String> arr = new ArrayList<String>(size+1);

		for(int i=0; i<size; i++){

			arr.add(intarr[(int)(rand.nextDouble(1)*11)]);

		}

		return arr;
	
	}
}
