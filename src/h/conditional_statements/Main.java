package h.conditional_statements;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 01: If-Else
		Scanner in = new Scanner(System.in);
//		System.out.print("Enter the customer's age: ");
//		int age = in.nextInt();
//		
//		if(age<=7) {
//			System.out.println("Discounted");
//		} else {
//			System.out.println("Not discounted");
//		}
		
		// TODO 02: Else if
//		System.out.print("Enter the water's temperature: ");
//		int temp = in.nextInt();
//		
//		if(temp>=100) {
//			System.out.println("Boiling");
//		} else if (temp<=0) {
//			System.out.println("Freezing");
//		} else {
//			System.out.println("Waiting");
//		}
		// TODO 03: Shorthand if-else (ternary)
//		System.out.print("Enter the customer's age: ");
//		int age = in.nextInt();
//		System.out.println((age<=7) ? "Discounted" : "Not discounted");
		
		// TODO 04: Switch, break and default
		System.out.print("Enter day of week (1-7): ");
		int dayOfWeek = in.nextInt();
		
		switch(dayOfWeek) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Looking forward to the weekend!");
		}
	}

}
