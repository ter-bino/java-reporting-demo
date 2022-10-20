package j.arrays_and_collections;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO 01: Arrays
//		int[] numbers = {2, 3, 5, 6, 8, 9};
//		
//		int sum = 0;
//		
//		for(int i=0; i<numbers.length; i++) {
//			sum += numbers[i];
//		}
//		
//		System.out.println(sum);
		
		// Additional:
		// TODO 02: ArrayList - dynamic array
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(2);
		numbers.add(3);
		numbers.add(5);
		numbers.add(6);
		numbers.add(8);
		numbers.add(9);
		
		for(int i=0; i<numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
	}

}
