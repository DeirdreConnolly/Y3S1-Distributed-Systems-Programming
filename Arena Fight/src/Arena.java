public class Arena {

	private Warrior warrior1;
	private Warrior warrior2;
	private RollingDie die;

	public Arena(Warrior warrior1, Warrior warrior2, RollingDie die) {
		this.warrior1 = warrior1;
		this.warrior2 = warrior2;
		this.die = die;
	}


	// Draw arena
	private void render() {
		System.out.println("------------------------- ARENA -------------------------\n");
//		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~ WARRIORS ~~~~~~~~~~~~~~~~~~~~~~~ \n");
		printWarrior(warrior1);
		System.out.println();
		printWarrior(warrior2);
		System.out.println();
	}


	// Print messages with dramatic pause using threading
	private void printMessage(String message) {

		System.out.println(message);

		try {
			Thread.sleep(500);

		} catch (InterruptedException ex) {
			System.err.println("Unable to put the thread to sleep");
		}
	}


	// fight Method
	public void fight() {

		// Original order
		Warrior w1 = warrior1;
		Warrior w2 = warrior2;

		System.out.println("Welcome to the Arena!\n");
		System.out.println("Today " + warrior1 + " will battle against " + warrior2 + "!\n");


		// Swapping the warriors
		boolean warrior2Starts = (die.roll() <= die.getSidesCount() / 2);

		if (warrior2Starts) {
			w1 = warrior2;
			w2 = warrior1;
		}

		System.out.println(w1 + " goes first!\n\nLet the battle begin...\n");


		// Fight loop repeats as long as both warriors are alive
		while (w1.isAlive() && w2.isAlive()) {    // While both are alive

			w1.attack(w2);                        // Attack
			render();                             // Draw arena

			printMessage(w1.getLastMessage());    // Attack message
			printMessage(w2.getLastMessage());    // Defence message

			if (w2.isAlive()) {                   // If w2 still alive

				w2.attack(w1);                    // Attack
				render();

				printMessage(warrior2.getLastMessage());    // Attack message
				printMessage(warrior1.getLastMessage());    // Defence message
			}

			System.out.println();
		}
	}


	// print Method
	private void printWarrior(Warrior w) {

		System.out.println("> " + w);
		System.out.print("Health: ");
		System.out.println(w.healthBar());

		if (w instanceof Mage) {    // If mage, print mana
			System.out.print("Mana:\t");
			System.out.println(((Mage) w).manaBar());
		}
	}
}