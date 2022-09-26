package i.arrays_and_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListVsArrayList {

	public static void main(String[] args) {
		// TODO 03: traversing lists
		List<Integer> numberArray = new ArrayList<>();
		populateList(numberArray);
		
		List<Integer> numberLinked = new LinkedList<>();
		populateList(numberLinked);
		
		long startTime, endTime;
		double taskTime;

		int arraySize = numberArray.size();
		startTime = System.nanoTime();
		for(int i=0; i<arraySize; i++) {
			numberArray.get(i);
		}
		endTime = System.nanoTime();
		taskTime = (endTime-startTime)/1000000.0;
		System.out.println("ArrayList took " + taskTime + "ms.");
		
		int linkedSize = numberLinked.size();
		startTime = System.nanoTime();
		for(int i=0; i<linkedSize; i++) {
			numberLinked.get(i);
		}
		endTime = System.nanoTime();
		taskTime = (endTime-startTime)/1000000.0;
		System.out.println("LinkedList took " + taskTime + "ms.");
	}

	private static void populateList(List<Integer> list) {
		for(int i=0; i<100000; i++) {
			list.add(i);
		}
	}
}
