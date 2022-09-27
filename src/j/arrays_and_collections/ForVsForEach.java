package j.arrays_and_collections;

import java.util.LinkedList;
import java.util.List;

public class ForVsForEach {

	public static void main(String[] args) {
		// TODO 04: Efficient traversal of lists
		List<Integer> numberLinked = new LinkedList<>();
		populateList(numberLinked);
		
		long startTime, endTime;
		double taskTime;
		
		int linkedSize = numberLinked.size();
		startTime = System.nanoTime();
		for(int i=0; i<linkedSize; i++) {
			System.out.print(numberLinked.get(i) + " ");
		}
		endTime = System.nanoTime();
		taskTime = (endTime-startTime)/1000000.0;
		System.out.println("\nFor loop took " + taskTime + "ms.");
		
		startTime = System.nanoTime();
		for(int i: numberLinked) {
			System.out.print(i + " ");;
		}
		endTime = System.nanoTime();
		taskTime = (endTime-startTime)/1000000.0;
		System.out.print("\nFor each loop took " + taskTime + "ms.");
	}
	
	private static void populateList(List<Integer> list) {
		for(int i=0; i<10000; i++) {
			list.add(i);
		}
	}
}
