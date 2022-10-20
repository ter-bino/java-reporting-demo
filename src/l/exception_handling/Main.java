package l.exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		// TODO 01: InputMismatchException
//		try {
//			int num = in.nextInt();
//			System.out.println(num);
//		} catch (InputMismatchException e) {
//			System.out.println("You entered the incorrect data type");
//		}
		// TODO 02: NumberFormatException
//		try {
//			String string = in.nextLine();
//			System.out.println(Integer.parseInt(string));
//		} catch (NumberFormatException e) {
//			System.out.println("Can't convert that String to an integer");
//		} finally {
//			System.out.println("This will always run");
//		}
		int num;
		
		while(true) {
			try {
				System.out.print("Enter an integer: ");
				num = in.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid!");
			} finally {
				in.nextLine();
			}
		}
		System.out.println(num);
		
		
		in.close();
	}

}
