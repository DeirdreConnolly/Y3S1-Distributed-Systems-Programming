public class Warrior {

	protected String name;        // Protected instead of private so that Mage can inherit from Warrior
	protected int health;
	protected int maxHealth;
	protected int damage;
	protected int defence;
	protected RollingDie die;     // Rolling die instance
	private String message;       // Can keep as private as not directly related to Warrior


	// Constructor
	public Warrior() {
	}

	public Warrior(String name, int health, int damage, int defence, RollingDie die) {
		this.name = name;
		this.health = health;
		this.maxHealth = health;    // Assume warrior has full health once created (constructor doesn't need maxHealth parameter)
		this.damage = damage;
		this.defence = defence;
		this.die = die;
	}


	// toString Method
	@Override
	public String toString() {
		return name;
	}


	// isAlive Method
	public boolean isAlive() {
		return (health > 0);
	}


	// graphicalBar Method
	public String graphicalBar(int current, int maximum) {

		String s = "[";
		int total = 20;        // Max amount of characters
		double count = Math.round(((double) current / maximum) * total);       // Calculate health

		if ((count == 0) && (isAlive())) {
			count = 1;
		}

		for (int i = 0; i < count; i++) {
			s += "▓";        // Symbol for remaining health/mana
		}
		for (int i = 0; i < total - count; i++) {
			s += "░";        // Symbol for lost health/mana
		}

		s += "]";

		return s;
	}


	// healthBar Method
	public String healthBar() {
		return graphicalBar(health, maxHealth);
	}


	// attack Method
	public void attack(Warrior enemy) {        // Takes enemy as parameter

		int hit = (damage + die.roll());       // Inflict random damage

		setMessage(name + " attacks with a hit worth " + hit + " HP");

		enemy.defend(hit);
	}


	// defend Method
	public void defend(int hit) {

		int injury = (hit - (defence + die.roll()));    // Subtract random damage

		if (injury > 0) {
			health -= injury;
			message = (name + " defended against the attack but still lost " + injury + " HP\n");

			if (health <= 0) {
				health = 0;
				message += ("\n>>> FATAL ATTACK <<<\n" + name + " has fallen");		// Warrior dies
			}

		} else
			message = (name + " blocked the hit");

		setMessage(message);
	}


	protected void setMessage(String message) {
		this.message = message;
	}


	public String getLastMessage() {
		return message;
	}
}