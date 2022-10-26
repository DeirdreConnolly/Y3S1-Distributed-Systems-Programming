package ie.cit.soft8023.myapp;

/*
Use link to humanBeing if superBeing transformed from a human
 */

import java.util.List;

public class SuperBeing extends Being {        // Inherit from Being

	private int superPower;
	private int maxSuperPower;
	private int superPowerDamage;


	// Constructors
	public SuperBeing(String name, int health, int damage, int defence, RollingDie die, int superPower, int superPowerDamage) {
		super(name, health, damage, defence, die);    // Inherited from Being
		this.superPower = superPower;
		this.maxSuperPower = superPower;
		this.superPowerDamage = superPowerDamage;
	}

	public SuperBeing(String name, int health, int maxHealth, int damage, int defence, RollingDie die, String message, String power, int speed, beingType humanBeing, beingType superBeing, int superPower, int maxSuperPower, int superPowerDamage) {
		super(name, health, maxHealth, damage, defence, die, message, power, speed, humanBeing, superBeing);
		this.superPower = superPower;
		this.maxSuperPower = maxSuperPower;
		this.superPowerDamage = superPowerDamage;
	}


	// superPowerBar method
	public String superPowerBar() {
		return graphicalBar(superPower, maxSuperPower);
	}


	// attack method
	public void attack(Being enemy) {

		if (superPower < maxSuperPower) {          // SuperPower isn't full
			superPower += 10;                // Increases by 10 each round (recharge)

			if (superPower > maxSuperPower) {
				superPower = maxSuperPower;        // Limit superPower to prevent it reaching a preposterous level
			}

			super.attack(enemy);       // Attack (from Being class)

		} else {                       // Superpower damage

			int hit = superPowerDamage + die.roll();        // Inflict random superpower damage

			setMessage(name + " used their superpower and took " + hit + " HP off");

			enemy.defend(hit);

			superPower = 0;        // Superpower charge depletes after attack
		}
	}
}