package src;

import java.util.ArrayList;

public class ArrayListPractice {
	// 
	public static void replaceEmpty(ArrayList<String> original) {
		// Modify the ArrayList such that empty strings are replaced with "Empty"
		for (int i = 0; i < original.size(); i++) {
			if (original.get(i).equals("")) {
				original.set(i, "Empty");
			}
		}
	}
	// 
	public static ArrayList<String> makeReversedList(ArrayList<String> original) {
		// return new ArrayList that is in reversed order of original
		ArrayList<String> a = new ArrayList<String>(original.size());
		for (int i = original.size() - 1; i > -1; i--) {
			// 
			a.add(original.get(i));
		}
		return a;
	}
	// 
	public static ArrayList<String> mixLists(ArrayList<String> a, ArrayList<String> b) {
		// return a new array list that has values of a, b alternating (e.g. a[0], b[0], a[1]...)
		ArrayList<String> arr = new ArrayList<String>(a.size()+b.size());
		int c = a.size() - b.size(); // c = 0 -> same length; c > 0 -> a is bigger, c < 0 -> b is bigger
		if(c==0) {
			for(int i=0; i<a.size(); i++) {
				arr.add(a.get(i));
				arr.add(b.get(i));
			}
		}
		if(c>0) {
			for(int i=0; i<b.size(); i++) {
				arr.add(a.get(i));
				arr.add(b.get(i));
			}
			for(int i=b.size(); i<a.size(); i++){
				arr.add(a.get(i));
			}
		}
		if(c<0) {
			for(int i=0; i<a.size(); i++) {
				arr.add(a.get(i));
				arr.add(b.get(i));
			}
			for(int i = a.size(); i<b.size(); i++){
				arr.add(b.get(i));
			}
		}

		return arr;
	}
}