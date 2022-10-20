package k.methods;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO 01: Methods we've used so far
		//
		
		// TODO 02: Method return types
		//
		Main.findSumOfArray(new int[] {1, 3, 6});
	}
	
	// TODO 03: Creating our own methods
	private static void findSumOfArray(int[] numbers) {
		int sum = 0;
		
		for(int num: numbers) {
			sum += num;
		}
		
		System.out.println("The total is " + sum);
		
		String[] words = findWordsInASentence("This is a sentence");
		System.out.println(Arrays.toString(words));
	}
	
	private static String[] findWordsInASentence(String sentence) {
		return sentence.split(" ");
	}
}
