package d.basic_input;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO 01: Input through Scanner class
//		Scanner in = new Scanner(System.in);
//		
//		System.out.println("Enter your name:");
//		String name = in.nextLine();
//		System.out.println(name);
		
		// TODO 02: Input through dialogs
		String name2 = JOptionPane.showInputDialog("Enter your name:");
		JOptionPane.showMessageDialog(null, name2);
	
	}

}
