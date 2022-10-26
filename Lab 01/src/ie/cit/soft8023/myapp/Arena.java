package ie.cit.soft8023.myapp;

public class Arena {

	private Being warrior1;
	private Being warrior2;
	private RollingDie die;


	// Constructors
	public Arena(Being warrior1, Being warrior2, RollingDie die) {
		this.warrior1 = warrior1;
		this.warrior2 = warrior2;
		this.die = die;
	}


	// Draw arena
	private void render() {
		System.out.println("------------------------- ARENA -------------------------\n");
		printWarrior(warrior1);
		System.out.println();
		printWarrior(warrior2);
		System.out.println();
	}


	// printMessage method
	private void printMessage(String message) {

		System.out.println(message);

		try {
			Thread.sleep(500);	// Adds dramatic pause between moves

		} catch (InterruptedException ex) {
			System.err.println("Unable to put the thread to sleep");
		}
	}


	// fight method
	public void fight() {

		// Original order
		Being w1 = warrior1;
		Being w2 = warrior2;

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


	// print method
	private void printWarrior(Being w) {

		System.out.println("> " + w);
		System.out.print("Health: \t");
		System.out.println(w.healthBar());

		if (w instanceof SuperBeing) {    // If superBeing, print superPower
			System.out.print("Superpower:\t");
			System.out.println(((SuperBeing) w).superPowerBar());
		}
	}
}