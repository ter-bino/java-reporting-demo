package c.data_types;

import java.util.Arrays;

public class ReferenceDemo {
	
	public static void main(String[] args) {
		//TODO 04: Two reference variable with the same object
		var array1 = new int[] {1, 2, 3, 4, 5};
		System.out.println("Array 1: " + Arrays.toString(array1));
		
		var array2 = array1;
		array2[0] = 10;
		System.out.println("Array 2: " + Arrays.toString(array2));
		System.out.println("Array 1: " + Arrays.toString(array1));
	}
}
