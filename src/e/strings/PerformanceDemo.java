package e.strings;

public class PerformanceDemo {

	public static void main(String[] args) {
		// TODO 05: Performance difference of String and StringBuilder
		long startTime, endTime;
		double timeTook;
		
		startTime = System.nanoTime();
		String sentence = "this";
		sentence = sentence + " is";
		sentence = sentence + " a";
		sentence = sentence + " sentence";
		System.out.println(sentence);
		endTime = System.nanoTime();
		timeTook = (endTime-startTime)/1000000.0;
		System.out.println("String took " + timeTook + "ms.");

		startTime = System.nanoTime();
		StringBuilder sb = new StringBuilder("this");
		sb.append(" is");
		sb.append(" a");
		sb.append(" sentence");
		System.out.println(sb.toString());
		endTime = System.nanoTime();
		timeTook = (endTime-startTime)/1000000.0;
		System.out.println("StringBuilder took " + timeTook + "ms.");
	}
}
