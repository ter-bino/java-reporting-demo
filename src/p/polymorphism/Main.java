package p.polymorphism;

public class Main {

	public static void main(String[] args) {
		/* TODO 01: Polymorphism - same method, done differently
		 * 
		 * Polymorphism means "many forms".
		 * 
		 * In OOP, polymorphism happens when methods of the same
		 * name can behave differently.
		 * 
		 * We can implement Polymorphism in java either through
		 * overriding or overloading.
		 */
		
		/* TODO 02: Method overriding - runtime polymorphism
		 * 
		 * In the examples below, we have Employee and Student
		 * objects below which overrides the inherited greet()
		 * method from Person.
		 * 
		 * In overriding, a method defined from the super class
		 * is re-defined in the subclass, to change the way it
		 * behaves if called via that subclass.
		 */
		//This is item 1 of sample problem
		Person person = new Person("Notaper");
		Employee employee = new Employee("Notanem");
		Student student = new Student("Notastu");
		person.greet();
		employee.greet();
		student.greet();
		
		/* TODO 03: Method overloading - comple-time polymorphism
		 * 
		 * In the example below, we are calling the same static
		 * method findPerimeter() from the Polygon class. Each of
		 * them are provided with different number of sides.
		 * 
		 * In overloading, methods can have the same name for as
		 * long as they have different parameters. We can use
		 * this to make a method behave differently, according
		 * to the provided arguments.
		 */
		int trianglePerimeter = Polygon.findPerimeter(10, 2, 9);
		int quadrilateralPerimeter = Polygon.findPerimeter(10, 12, 11, 9);
		int pentagonPerimeter = Polygon.findPerimeter(2, 2, 3, 2, 2);
		
		System.out.println("Triangle perimeter: " + trianglePerimeter);
		System.out.println("Quadrilateral perimeter: " + quadrilateralPerimeter);
		System.out.println("Pentagon perimeter: " + pentagonPerimeter);
	}

}

class Person {
	String name;
	
	Person(String name) {
		this.name = name;
	}
	
	void greet() {
		System.out.printf("Hello %s!\n", name);
	}
}

class Employee extends Person{

	double salary;
	
	Employee(String name) {
		/*
		 * the super keyword is used to refer to the super class.
		 * in this case, super() is the constructor of the super
		 * class.
		 */
		super(name);
	}

	/*
	 * @Override annotation is used to identify that a method is
	 * changing the behavior of an inherited method.
	 */
	@Override
	void greet() {
		System.out.printf("Hello %s! You're an employee!\n", name);
	}

	void printSalary() {
		System.out.printf("%s's salary is %.2f\n", name, salary);
	}
}

class Student extends Person{

	double grade;

	Student(String name) {
		super(name);
	}

	@Override
	void greet() {
		System.out.printf("Hello %s! You're a student!\n", name);
	}

	void printGrade() {
		System.out.printf("%s's grade is %.2f\n", name, grade);
	}
}

class Polygon {
	/*
	 * See below, we have 3 methods of the same name, but different
	 * parameters. This is method overloading. When we use the method
	 * findPerimeter(), even though we have a lot of methods with the
	 * same name, it will automatically find the one with parameters
	 * matching with the arguments provided in the method call.
	 */
	static int findPerimeter(int sideA, int sideB, int sideC) {
		return sideA + sideB + sideC;
	}
	
	static int findPerimeter(int sideA, int sideB, int sideC, int sideD) {
		return sideA + sideB + sideC;
	}
	
	static int findPerimeter(int sideA, int sideB, int sideC, int sideD, int sideE) {
		return sideA + sideB + sideC;
	}
}
