package e.strings;

public class Main {

	public static void main(String[] args) {
		// TODO 01: String and it's methods
		String word = "One";
		System.out.println(word.toLowerCase());
		// TODO 02: String concatenation
		String sentence = "this";					// this
		sentence = sentence.concat(" is");			//  is, this is
		sentence = sentence.concat(" a");			//  a, this is a
		sentence = sentence.concat(" sentence");	//	sentence, this is a sentence
		
		System.out.println(sentence);
		// TODO 03: String pools
		
		// TODO 04: StringBuilder class
		StringBuilder sb = new StringBuilder("this");	// this
		sb.append(" is");								// is
		sb.append(" a");								// a
		sb.append(" sentence");							// sentence
		
		System.out.println(sb.toString());				// this is a sentence
	}

}
