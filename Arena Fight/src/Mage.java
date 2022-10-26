public class Mage extends Warrior {        // Inherit from Warrior

	private int mana;
	private int maxMana;
	private int magicDamage;


	// Constructor
	public Mage(String name, int health, int damage, int defence, RollingDie die, int mana, int magicDamage) {

		super(name, health, damage, defence, die);    // Inherited from Warrior
		this.mana = mana;
		this.maxMana = mana;
		this.magicDamage = magicDamage;
	}


	// manaBar Method
	public String manaBar() {
		return graphicalBar(mana, maxMana);
	}


	@Override
	public void attack(Warrior enemy) {        // Override because we are changing the behaviour from the inherited method

		if (mana < maxMana) {          // Mana isn't full
			mana += 10;                // Increases by 10 each round

			if (mana > maxMana) {
				mana = maxMana;        // Limit mana to prevent it reaching a preposterous level
			}

			super.attack(enemy);       // Attack (from Warrior class)

		} else {    				   // Magic damage

			int hit = magicDamage + die.roll();		// Inflict random magic damage

			setMessage(name + " used magic and took " + hit + " HP off");

			enemy.defend(hit);

			mana = 0;		// Mana depletes after using magic attack
		}
	}
}