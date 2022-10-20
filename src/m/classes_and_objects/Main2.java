package m.classes_and_objects;

/*
 * This is the solution for item 2 in SampleProblem.txt
 */
public class Main2 {
	
	public static void main(String[] args) {
		/*
		 * Sample main from the instruction of the
		 * sample activity
		 */
		Television television = new Television();
		television.channelUp();
		television.channelDown();
		television.channelDown();
	}

}

class Television {
	
	/*
	 * Private so it can't be accessed from outside and be
	 * set to values outside 1 - 10.
	 */
	private int currentChannel = 1;
	
	void channelUp() {
		if(currentChannel < 10) {
			System.out.println("Switched to channel " + ++currentChannel + "!");
		} else {
			System.out.println("..nothing happens..");
		}
	}
	
	void channelDown() {
		if(currentChannel > 1) {
			System.out.println("Switched to channel " + --currentChannel + "!");
		} else {
			System.out.println("..nothing happens..");
		}
	}
}
