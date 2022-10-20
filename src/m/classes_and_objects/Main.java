package m.classes_and_objects;

/*
 * This is the solution for item 1 in SampleProblem.txt
 */
public class Main {

	public static void main(String[] args) {
		/* TODO 01: Instantiating objects.
		 *
		 * We use the 'new' keyword followed by the constructor
		 * of a class to create objects.
		 * 
		 * The 'new Money()' returns a reference to an object of
		 * type Money inside the heap or memory.
		 * 
		 * We then assign that reference as the value to the
		 * variable money
		 */
		Money money1 = new Money();
		
		/* TODO 02: Accessing attributes.
		 * 
		 * We can access attributes of money object with "."
		 */
		money1.currency = "PHP";
		money1.amount = 150.00;
		
		/* TODO 03: Using constructors to initialize attributes.
		 * 
		 * We can also create objects via its constructor by
		 * passing the appropriate argument according to the
		 * parameter defined inside the class. This sets the
		 * value of the attributes during object creation.
		 */
		Money money2 = new Money("USD", 250.25);
		Money money3 = new Money("PHP", 1325.20);
		
		
		
		/* TODO 04: Calling instance methods.
		 * 
		 * We can call attributes of money object with "."
		 */
		money1.printMoney();
		money2.printMoney();
		money3.printMoney();
	}

}

class Money {
	/*
	 * These are examples of instance variables.
	 * They are the attributes of objects with
	 * type Money. You can access them using the
	 * "." operator. See above in TO-DO 02.
	 */
	String currency;
	double amount;
	
	/*
	 * This is an example of a constructor. Constructors
	 * are used to set values for the attributes without
	 * the need of "." operators like we did in TO-DO 02.
	 * Instead, we have parameters in the constructor that
	 * are required when creating objects of this type.
	 * See how a constructor is created below, and used
	 * in TO-DO 03.
	 */
	Money(String currency, double amount) {
		/*
		 * The this keyword refers to the object instance
		 * of this class that is currently in use.
		 */
		this.currency = currency;
		this.amount = amount;
	}
	/*
	 * We can have multiple constructors with different
	 * parameters. This is called constructor overloading.
	 */
	Money() {
		/*
		 * Instead of setting attributes on all of our
		 * constructors, we can call a different constructor
		 * with more complete parameters through this().
		 * This this() method will pass the arguments to
		 * the other constructor with appropriate parameters.
		 * The values we pass are usually what we want to be
		 * the default values. In this case, null for the
		 * currency and 0 for the amount.
		 * 
		 * This is called constructor chaining.
		 */
		this(null, 0);
	}
	
	/*
	 * This is an example of an instance method
	 * it belongs to objects of type Money. You
	 * also access them with the "." operator.
	 * See above in TO-DO 04.
	 */
	void printMoney() {
		System.out.printf("%s %.2f\n", currency, amount);
	}
}
