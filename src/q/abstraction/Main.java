package q.abstraction;

public class Main {

	public static void main(String[] args) {
		/*
		 * See below, even though the method useRole() accepts type
		 * Role as parameter, we were able to pass Mage and Tank
		 * objects.
		 */
		useRole(new Mage());
		useRole(new Tank());
	}
	
	/*
	 * In the useRole() method below, we are accepting a Role data
	 * type even though we can't create objects of type Role, this
	 * means we can use objects whose type is a subclass of Role.
	 * 
	 * Inside the method, we are able to use the dealDamage() and
	 * takeDamage() methods even though they are not defined by
	 * the Role class.
	 * 
	 * This is the idea of abstraction. We know what subclasses of
	 * Role can do without knowing how are they going to do it. We
	 * just know that a subclass of Role will implement the methods
	 * dealDamage() and takeDamage().
	 * 
	 * This is "program the interface, not the implementation". The
	 * phrase tells us to program without our code being directly
	 * reliant to subclass of Role which can cause problems if
	 * changes are done on that subclass. Making our code reliant on
	 * the interface or abstract class instead allows our code to
	 * have minimal dependency with other codes, which minimizes
	 * the problems we can encounter in the future if code is
	 * changed.
	 */
	static void useRole(Role role) {
		role.dealDamage();
		role.takeDamage();
	}

}

/*
 * 'abstract' keyword defines this class as abstract.
 * This means we can't instantiate an object of type
 * Role. If you do this:
 * 
 * Role role = new Role();
 * 
 * You will get an error and won't be able to compile.
 * 
 * PS. You can make this an interface instead of an
 * abstract class, then you can remove the abstract
 * keywords on the method. Should look like:
 * 
 * interface Role {
 * 		void dealDamage();
 * 		void takeDamage();
 * }
 */
abstract class Role {
	abstract void dealDamage();
	abstract void takeDamage();
}

/*
 * To implement an abstract class, we just need to use
 * the 'extends' keyword on the implementation class.
 * Then, we are required to implement/override all the
 * abstract methods declared in the abstract class.
 * 
 * PS. If you're using an interface and not an abstract
 * class, then you need to use the 'implements' keyword
 * instead of 'extends'. Should look like:
 * 
 *  class Mage implements Role {
 *  	(...some code...)
 *  }
 */
class Mage extends Role{

	@Override
	void dealDamage() {
		System.out.println("A Mage deals 150 damage!");
	}

	@Override
	void takeDamage() {
		System.out.println("A Mage takes 100 damage!");
	}
}

class Tank extends Role {

	@Override
	void dealDamage() {
		System.out.println("A Tank deals 15 damage!");
	}

	@Override
	void takeDamage() {
		System.out.println("A Tank takes 20 damage!");
	}
}




