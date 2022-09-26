package g.conditional_statements;

public class SwitchPerformanceDemo {

	public static void main(String[] args) {
		long startTime, endTime;
		double taskTime;
		// TODO 05: Performance of switch vs. multiple else if
		int num = 10;
		String result;
		
		startTime = System.nanoTime();
		if(num == 1) {
			result = "one";
		} else if (num == 2) {
			result = "two";
		} else if (num == 3) {
			result = "three";
		} else if (num == 4) {
			result = "four";
		} else if (num == 5) {
			result = "five";
		} else if (num == 6) {
			result = "six";
		} else if (num == 7) {
			result = "seven";
		} else if (num == 8) {
			result = "eight";
		} else if (num == 9) {
			result = "nine";
		} else if (num == 10) {
			result = "ten";
		} else {
			result = "not found";
		}
		System.out.println(result);
		endTime = System.nanoTime();
		taskTime = (endTime - startTime) / 1000000.0;
		System.out.println("Multiple if else took " + taskTime + "ms.");
		
		startTime = System.nanoTime();
		switch(num) {
		case 1:
			result = "one";
			break;
		case 2:
			result = "two";
			break;
		case 3:
			result = "three";
			break;
		case 4:
			result = "four";
			break;
		case 5:
			result = "five";
			break;
		case 6:
			result = "six";
			break;
		case 7:
			result = "seven";
			break;
		case 8:
			result = "eight";
			break;
		case 9:
			result = "nine";
			break;
		case 10:
			result = "ten";
			break;
		default:
			result = "not found";
		}
		System.out.println(result);
		endTime = System.nanoTime();
		taskTime = (endTime - startTime) / 1000000.0;
		System.out.println("Switch took " + taskTime + "ms.");

	}

}
