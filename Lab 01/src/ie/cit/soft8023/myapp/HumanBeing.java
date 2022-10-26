package ie.cit.soft8023.myapp;

/*
Can be assigned punch/kick, but not laserEye/freezeRay
 */

import java.util.List;

public class HumanBeing extends Being {     // Subclass of Being


	// Constructors
	public HumanBeing(String name, int health, int damage, int defence, RollingDie die) {
		this.name = name;
		this.health = health;
		this.maxHealth = health;    // Assume warrior has full health once created (constructor doesn't need maxHealth parameter)
		this.damage = damage;
		this.defence = defence;
		this.die = die;
	}


	public HumanBeing(String name, int health, int maxHealth, int damage, int defence, RollingDie die, String message, String power, int speed, beingType humanBeing, beingType superBeing) {
		super(name, health, maxHealth, damage, defence, die, message, power, speed, humanBeing, superBeing);
	}
}




