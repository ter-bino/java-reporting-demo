package n.encapsulation;

/*
 * Solution for item 1 in SampleProblem.txt
 */
public class Main {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		/* TODO 01: Invalid states
		 * 
		 * If attributes of an object are not private, they
		 * are prone to be modified into invalid states.
		 * 
		 * Example of invalid states are blank names, or a
		 * negative age.
		 * 
		 * Codes like the ones commented below will result to
		 * invalid states of object attributes if they are not
		 * private.
		 */
		//person.name = "";
		//person.age = -50;
		
		/* TODO 02: Private fields
		 * 
		 * By setting the fields name and age as private, the
		 * code from above should no longer be allowed. If you
		 * uncomment the code above, it will be underlined with
		 * red and cause compilation error :)
		 */
		
		/* TODO 03: Getters and Setters
		 * 
		 * But how are we supposed to interact with the attributes
		 * if they are private? This is where we use getters and
		 * setters. Getters returns the value of attributes while
		 * setters are used to modify the value.
		 * 
		 * According to the defined Person class at the bottom, the
		 * commented codes throw an exception, you can uncomment it
		 * to try.
		 */
		person.setName("Peter");
		person.setAge(27);
		//person.setName(null);
		//person.setName("");
		//person.setAge(-4);
		
		System.out.println(person.getName());
		System.out.println(person.getAge());
		
		person.greet();
		
		/* TODO 04: What breaks encapsulation (just a note)
		 * 
		 * One thing that can break encapsulation in java is the fact
		 * that non-primitive data types are "reference" data types.
		 * 
		 * If you remember the discussion back in data types, reference
		 * data types contains references to objects in the memory. If
		 * we have a getter that returns this reference value, then an
		 * attribute object can actually be controlled outside of the
		 * class, thus there are no controls to avoid invalid states
		 * from outside of the class.
		 * 
		 * A solution for this problem is instead of returning attribute
		 * objects directly on the getters, we can create a copy of that
		 * object with exact same values, and return the copy instead.
		 */

	}

}

class Person {
	
	/*
	 * The attributes of this class are set to private
	 * because we want to protect it from being changed
	 * into invalid states. See TO-DO 01 and 02 above.
	 */
	private String name;
	private int age;
	
	/*
	 * Below are examples of getters. A getter should
	 * have a return type that matches the data type
	 * of the value that it gets.
	 * 
	 * As a convention, getters are named with the format:
	 * get<variable to get>()
	 *  just like the ones below.
	 */
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
	
	/*
	 * Below are examples of setters. A setter should
	 * always be a void method, with a parameter whose
	 * type matches the data type of the attribute to
	 * be modified.
	 * 
	 * As a convention, setters are named with the format:
	 * set<variable to modify>()
	 * just like the ones below.
	 *  
	 *  To actually implement the feature of encapsulation
	 *  that "protects data of objects", we need our setters
	 *  to validate values before actually modifying the
	 *  attribute. If values are invalid, we can choose to:
	 *  do nothing, set default values, or throw an exception.
	 *  In the below examples, we will have the program throw
	 *  an IllegalArgumentException.
	 */
	void setName(String name) {
		//name.isBlank() is preferable, but it's only available with Java 11 onwards.
		if(name.isEmpty() || name==null)
			throw new IllegalArgumentException("Name can't be empty!");
		else
			this.name = name;
	}
	void setAge(int age) {
		if(age < 1)
			throw new IllegalArgumentException("Age can't be 0 or below!");
		else
			this.age = age;
	}
	
	void greet() {
		System.out.println("Hello, " + name + "! You are " + age + " years old!");
	}
	
	/*
	 * This Person class follows the definition of encapsulation:
	 * 
	 * 		✓ Private attributes/fields
	 * 		✓ Methods that interact with the attributes
	 * 		✓ Protects attributes from invalid states
	 * 
	 * "bundle data together with methods that interact with that data" 
	 */
}
