package n.encapsulation;

public class Main2 {

	public static void main(String[] args) {
		
		Player player = new Player("Noobgamer69", 100);
		
		player.hitPlayer(50);
		player.healPlayer(10);
		player.hitPlayer(65);
		player.hitPlayer(65);
		player.healPlayer(10);
		
		//this throws exception (space not allowed)
		//player.setUsername("noob gamer");

		System.out.println(player.getUsername());
		System.out.println(player.getHealth());
	}

}

class Player {
	private String username;
	private int health;
	
	Player(String username, int health) {
		this.username = username;
		this.health = health;
	}
	
	String getUsername() {
		return username;
	}
	
	int getHealth() {
		return health;
	}
	
	void setUsername(String username) {
		if(username.contains(" "))
			throw new IllegalArgumentException("Username can't contain spaces");
		else
			this.username = username;
	}
	
	void hitPlayer(int damageAmount) {
		if(health == 0) {
			System.out.printf("%s is already dead!\n", username);
			return; //don't proceed for dead players!
		}
		
		health = health - damageAmount;
		if(health > 0) {
			System.out.printf("%s took %d damage, %d health remaining.\n", username, damageAmount, health);
		} else {
			health = 0;
			System.out.printf("%s took %d damage and died.\n", username, damageAmount);
		}
	}
	
	/*
	 * This sets a rule that only players that are not yet dead
	 * are allowed to heal.
	 */
	void healPlayer(int healAmount) {
		if(health > 0) {
			health = health + healAmount;
			System.out.printf("%s healed %d health. %d current health\n", username, healAmount, health);
		} else {
			System.out.printf("Dead players can't heal!\n");
		}
	}
	
	/*
	 * This Player class follows the definition of encapsulation:
	 * 
	 * 		✓ Private attributes/fields
	 * 		✓ Methods that interact with the attributes
	 * 		✓ Protects attributes from invalid states
	 * 
	 * "bundle data together with methods that interact with that data" 
	 */
	
}
