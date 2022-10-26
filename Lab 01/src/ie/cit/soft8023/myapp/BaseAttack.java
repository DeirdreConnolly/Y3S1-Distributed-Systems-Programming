package ie.cit.soft8023.myapp;

/*
Abstract Class
Hides certain details, showing only essential info to user
A restricted class that cannot be used to create objects (no access to it, must be inherited from another class)
Can have both abstract and regular methods
 */

abstract class BaseAttack implements Attack {     // BaseAttack (Abstract class) implements an Attack interface (with method, attack)


	public void attack(){

		LaserEye laserEye = new LaserEye();
		FreezeRay freezeRay = new FreezeRay();
		Punch punch = new Punch();
		Kick kick = new Kick();


//		attacks.add(new Punch(3));
//		attacks.add(new EyeLaser(1));
//		attacks.add(new FreezeRay(1));
	}








//	RollingDie die;
//
//	// isAlive method
//	public boolean isAlive(int health) {
//		return (health > 0);
//	}
//
//
//	// graphicalBar method
//	public String graphicalBar(int current, int maximum, int health) {
//
//		String s = "[";
//		int total = 20;        // Max amount of characters
//		double count = Math.round(((double) current / maximum) * total);       // Calculate health
//
//		if ((count == 0) && (isAlive(health))) {
//			count = 1;
//		}
//
//		for (int i = 0; i < count; i++) {
//			s += "▓";        // Symbol for remaining health/superpower recharge (originally mana)
//		}
//		for (int i = 0; i < total - count; i++) {
//			s += "░";        // Symbol for lost health/superpower recharge (originally mana)
//		}
//
//		s += "]";
//
//		return s;
//	}
//
//
//	// healthBar method
//	public String healthBar(int maxHealth, int health) {
//		return graphicalBar(health, maxHealth, health);
//	}
//
//
//	// attack method
//	public void attack(Being enemy, int damage, String name) {        // Takes enemy as parameter
//
//		int hit = (damage + die.roll());       // Inflict random damage
//
//		setMessage(name + " attacks with a hit worth " + hit + " HP");
//
//		enemy.defend(hit);
//	}
//
//
//	// defend method
//	public void defend(int hit, Object defence, int health, String name, String message) {
//
//		int injury = (hit - (defence + die.roll()));    // Subtract random damage
//
//		if (injury > 0) {
//			health -= injury;
//			message = (name + " defended against the attack but still lost " + injury + " HP\n");
//
//			if (health <= 0) {
//				health = 0;
//				message += ("\n>>> FATAL ATTACK <<<\n" + name + " has fallen\n");		// Warrior dies
//			}
//
//		} else
//			message = (name + " blocked the hit");
//
//		setMessage(message);
//	}
//
//
//	void setMessage(String message) {
//		this.message = message;
//	}
//
//
//	public String getLastMessage() {
//		return message;
//	}
}