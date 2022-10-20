package i.loop_statements;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// TODO 01: While loop
//		System.out.print("Enter a negative number: ");
//		int number = in.nextInt();
//		
//		while(number>=0) {
//			System.out.print("Enter a negative number: ");
//			number = in.nextInt();
//		}
//		
//		System.out.println("done");
		// TODO 02: Do-While loop
//		int number;
//		
//		do {
//			System.out.print("Enter a negative number: ");
//			number = in.nextInt();
//		} while (number>=0);
//		System.out.println("done");
		
		// TODO 03: For loop
//		System.out.print("Enter n: ");
//		int n = in.nextInt();
//		
//		int sum = 0;
//		
//		for(int i=2; i<n; i+=2) {
//			sum += i;
//		}

//		System.out.print("The sum of all positive even numbers before n is + " + sum);
		// TODO 04: For-each loop
		int[] numbers = new int[]{1, 2, 3, 4, 5};
		
//		for(int i=0; i < numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}
		
		for(int num: numbers) {
			System.out.println(num);
		}
	}
}
