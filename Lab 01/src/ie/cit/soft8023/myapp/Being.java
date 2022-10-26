package ie.cit.soft8023.myapp;

/*
Abstract Class
Hides certain details, showing only essential info to user
A restricted class that cannot be used to create objects (no access to it, must be inherited from another class)
Can have both abstract and regular methods
 */

class Being {      // Superclass

	// Attributes
	protected String name;        // Protected instead of private so that HumanBeing/SuperBeing can inherit
	protected int health;
	protected int maxHealth;
	protected int damage;
	protected int defence;
	protected RollingDie die;     // Rolling die instance
	private String message;       // Can keep as private as not directly related to HumanBeing


	protected String power;
	protected int speed;


	enum beingType {             // Enumeration -- specifically listed (think seasons) -- public, static, final (cannot be changed)
		HUMANBEING,
		SUPERBEING
	}

	private beingType humanBeing = beingType.HUMANBEING;
	private beingType superBeing = beingType.SUPERBEING;


	// Constructors
	public Being() {
	}


	public Being(String name, int health, int damage, int defence, RollingDie die) {
		this.name = name;
		this.health = health;
		this.maxHealth = health;    // Assume warrior has full health once created (constructor doesn't need maxHealth parameter)
		this.damage = damage;
		this.defence = defence;
		this.die = die;
	}


	public Being(String name, int health, int maxHealth, int damage, int defence, RollingDie die, String message, String power, int speed, beingType humanBeing, beingType superBeing) {
		this.name = name;
		this.health = health;
		this.maxHealth = maxHealth;
		this.damage = damage;
		this.defence = defence;
		this.die = die;
		this.message = message;
		this.power = power;
		this.speed = speed;
		this.humanBeing = humanBeing;
		this.superBeing = superBeing;
	}


	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getMaxHealth() {
		return maxHealth;
	}

	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getDefence() {
		return defence;
	}

	public void setDefence(int defence) {
		this.defence = defence;
	}

	public RollingDie getDie() {
		return die;
	}

	public void setDie(RollingDie die) {
		this.die = die;
	}

	public String getMessage() {
		return message;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public beingType getHumanBeing() {
		return humanBeing;
	}

	public void setHumanBeing(beingType humanBeing) {
		this.humanBeing = humanBeing;
	}

	public beingType getSuperBeing() {
		return superBeing;
	}

	public void setSuperBeing(beingType superBeing) {
		this.superBeing = superBeing;
	}


	// whoAreYou method
	public void whoAreYou() {

		System.out.println("I am " + name + "!");
	}


	// whatAreYou method
	public void whatAreYou() {

//		System.out.println("I am a " + beingType + "!");

	}


	// whatAreYouCapableOf method
	public void whatAreYouCapableOf() {

		System.out.println("I have the following attacks: " +
							"\n" + power);
	}


	// toString method
	@Override
	public String toString() {
		return name;
	}


	// isAlive method
	public boolean isAlive() {
		return (health > 0);
	}


	// graphicalBar method
	public String graphicalBar(int current, int maximum) {

		String s = "[";
		int total = 20;        // Max amount of characters
		double count = Math.round(((double) current / maximum) * total);       // Calculate health

		if ((count == 0) && (isAlive())) {
			count = 1;
		}

		for (int i = 0; i < count; i++) {
			s += "▓";        // Symbol for remaining health/superpower recharge (originally mana)
		}
		for (int i = 0; i < total - count; i++) {
			s += "░";        // Symbol for lost health/superpower recharge (originally mana)
		}

		s += "]";

		return s;
	}


	// healthBar method
	public String healthBar() {
		return graphicalBar(health, maxHealth);
	}


	// attack method
	public void attack(Being enemy) {        // Takes enemy as parameter

		int hit = (damage + die.roll());       // Inflict random damage

		setMessage(name + " attacks with a hit worth " + hit + " HP");

		enemy.defend(hit);
	}


	// defend method
	public void defend(int hit) {

		int injury = (hit - (defence + die.roll()));    // Subtract random damage

		if (injury > 0) {
			health -= injury;
			message = (name + " defended against the attack but still lost " + injury + " HP\n");

			if (health <= 0) {
				health = 0;
				message += ("\n>>> FATAL ATTACK <<<\n" + name + " has fallen\n");		// Warrior dies
			}

		} else
			message = (name + " blocked the hit");

		setMessage(message);
	}


	void setMessage(String message) {
		this.message = message;
	}


	public String getLastMessage() {
		return message;
	}
}

