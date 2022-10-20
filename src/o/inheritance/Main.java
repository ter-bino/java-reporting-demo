package o.inheritance;

public class Main {

	public static void main(String[] args) {
		
		/* TODO 01: Repetitive codes among similar classes
		 *  
		 *  If you look at the Employee and Student classes, we have
		 *  commented out attribute name and method greet() which are
		 *  exactly the same with the ones that are defined inside of
		 *  the Person class.
		 *  
		 *  If we were not making use of inheritance, then we would
		 *  need those commented codes. This results to repetitive codes
		 *  across classes.
		 */
		
		
		/* TODO 02: Reducing code repetition with inheritance
		 * 
		 * To deal with these repetitive code across classes, we made use
		 * of inheritance. You can see in Employee and Student classes
		 * that we used the "extends" keyword to inherit from the
		 * Person class. With this, all attributes and methods from
		 * Person class are implicitly defined inside the Employee and
		 * Student classes as well. That's why even though name and
		 * greet() method are commented out in Employee and Student,
		 * we were still able to call them from the sample employee and
		 * student below.
		 */
		Person person = new Person();
		person.name = "Notaper";
		person.greet();
		
		Employee employee = new Employee();
		employee.name = "Notanem";
		employee.salary = 11111.11;
		employee.greet();
		employee.printSalary();
		
		Student student = new Student();
		student.name = "Notastu";
		student.grade = 74.44;
		student.greet();
		student.printGrade();
		
		/*
		 * NOTE:
		 * 
		 * Not because you have repetitive codes across classes mean
		 * you will use inheritance. You can use the "is-a" test to
		 * verify if inheritance is applicable.
		 * 
		 * Student is a Person? -> Yes, inheritance is applicable.
		 * Employee is a Person? -> Yes, inheritance is applicable.
		 * Customer is a Person? -> Yes, inheritance is applicable.
		 * Dog is a Person? -> No, inheritance is not applicable.
		 * BankAccount is a Person? -> No, inheritance is not applicable.
		 * Money is a Person? -> No, inheritance is not applicable.
		 * 
		 * You can search about "composition over inheritance", it's
		 * something else you can use if using inheritance is not an
		 * applicable option ;)
		 * 
		 * Person has a Dog? -> Yes, use composition.
		 * Person has a BankAccount? -> Yes, use composition.
		 * Person has Money? -> Yes, use composition.
		 */
	}
}

class Person {
	String name;
	
	void greet() {
		System.out.printf("Hello %s!\n", name);
	}
}

/*
 * We use "extends" to inherit from a different class.
 * Since we made Employee inherit from Person, it's
 * implied that Employee has all non-private fields
 * and methods of Person. Therefore, we can remove
 * name and greet() (commented it out)
 */
class Employee extends Person{
//	String name;
	double salary;

//	void greet() {
//		System.out.printf("Hello %s!\n", name);
//	}
	
	void printSalary() {
		System.out.printf("%s's salary is %.2f\n", name, salary);
	}
}

class Student extends Person{
//	String name;
	double grade;
	
//	void greet() {
//		System.out.printf("Hello %s!\n", name);
//	}
	
	void printGrade() {
		System.out.printf("%s's grade is %.2f\n", name, grade);
	}
}
