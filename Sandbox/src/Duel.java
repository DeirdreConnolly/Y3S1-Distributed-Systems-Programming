import java.util.Random;

public class Duel {

	Random battle = new Random();

	int newHealth, newHealth1;
	int outcome, outcome1, outcome2, outcome3;
	int attack, attack1;
	int defense, defense1;
	int health, health1;

	void calculateWinner() {
		do {
			outcome = attack - defense1;
			newHealth1 = health1 - outcome;
			System.out.println("Your attack does " + outcome + " damage!");
			System.out.println("");
			System.out.println("Enemy Health");
			System.out.println(newHealth1);
			System.out.println("");
			outcome2 = attack1 - defense;
			newHealth = health - outcome2;
			System.out.println("Enemies attack does " + outcome2 + " damage!");
			System.out.println("");
			System.out.println("Your Health");
			System.out.println(newHealth);
			if (newHealth1 > 0 && newHealth > 0) {
				outcome = attack - defense1;
				outcome1 = 2 * outcome;
				newHealth1 = health1 - outcome1;
				System.out.println("Your attack does " + outcome + " damage!");
				System.out.println("");
				System.out.println("Enemy Health");
				System.out.println(newHealth1);
				outcome = attack1 - defense;
				outcome1 = 2 * outcome;
				newHealth = health - outcome1;
				System.out.println("");
				System.out.println("Enemies attack does " + outcome2 + " damage!");
				System.out.println("");
				System.out.println("Your Health");
				System.out.println(newHealth);
				if (newHealth1 > 0 && newHealth > 0) {
					outcome = attack - defense1;
					outcome1 = 3 * outcome;
					newHealth1 = health1 - outcome1;
					System.out.println("Your attack does " + outcome + " damage!");
					System.out.println("");
					System.out.println("Enemy Health");
					System.out.println(newHealth1);
					outcome = attack1 - defense;
					outcome1 = 3 * outcome;
					newHealth = health - outcome1;
					System.out.println("");
					System.out.println("Enemies attack does " + outcome2 + " damage!");
					System.out.println("");
					System.out.println("Your Health");
					System.out.println(newHealth);
					if (newHealth1 > 0 && newHealth > 0) {
						outcome = attack - defense1;
						outcome1 = 4 * outcome;
						newHealth1 = health1 - outcome1;
						System.out.println("Your attack does " + outcome + " damage!");
						System.out.println("");
						System.out.println("Enemy Health");
						System.out.println(newHealth1);
						outcome = attack1 - defense;
						outcome1 = 4 * outcome;
						newHealth = health - outcome1;
						System.out.println("");
						System.out.println("Enemies attack does " + outcome2 + " damage!");
						System.out.println("");
						System.out.println("Your Health");
						System.out.println(newHealth);
						if (newHealth1 > 0 && newHealth > 0) {
							outcome = attack - defense1;
							outcome1 = 5 * outcome;
							newHealth1 = health1 - outcome1;
							System.out.println("Your attack does " + outcome + " damage!");
							System.out.println("");
							System.out.println("Enemy Health");
							System.out.println(newHealth1);
							outcome = attack1 - defense;
							outcome1 = 5 * outcome;
							newHealth = health - outcome1;
							System.out.println("");
							System.out.println("Enemies attack does " + outcome2 + " damage!");
							System.out.println("");
							System.out.println("Your Health");
							System.out.println(newHealth);
						}
					}
				}
			}
		} while (newHealth1 > 0 && newHealth > 0);
		if (newHealth1 <= 0 && newHealth > 0) {
			System.out.println("You win!");
		}
		if (newHealth <= 0 && newHealth1 > 0) {
			System.out.println("You lose!");
		}
		if (newHealth <= 0 && newHealth1 <= 0) {
			System.out.println("Draw!");
		}
	}
}
