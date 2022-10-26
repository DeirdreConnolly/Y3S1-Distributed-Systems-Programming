// https://codereview.stackexchange.com/questions/38105/battle-game-simulation

import java.util.Random;
import java.util.Scanner;

public class DuelMain {

	public static void main(String[] args) {
		Random battle = new Random();
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int hero, match, restart;

		Duel valon = new Duel();
		Duel rintar = new Duel();
		Duel zersious = new Duel();
		Duel balrock = new Duel();
		Duel hawkeye = new Duel();
		Duel yusef = new Duel();

		valon.attack = 6;
		valon.defense = 0;
		valon.health = 19;

		rintar.attack = 8;
		rintar.defense = 1;
		rintar.health = 16;

		zersious.attack = 5;
		zersious.defense = 2;
		zersious.health = 18;

		balrock.attack = 10;
		balrock.defense = 0;
		balrock.health = 15;

		hawkeye.attack = 7;
		hawkeye.defense = 1;
		hawkeye.health = 17;

		yusef.attack = 13;
		yusef.defense = 2;
		yusef.health = 10;


		System.out.println("Choose your HERO");
		System.out.println("Press 1 for the Mage Lord Valon             Press 2 for the Warrior Rintar");
		System.out.println("Attack      6               Attack      8");
		System.out.println("Defense     0               Defense     1");
		System.out.println("Health      19              Health      16");
		System.out.println("");
		System.out.println("");
		System.out.println("Press 3 for the Paladin Prince Zersious     Press 4 for the Orc Balrock");
		System.out.println("Attack      5               Attack      10");
		System.out.println("Defense     2               Defense     0");
		System.out.println("Health      18              Health      15");
		System.out.println("");
		System.out.println("");
		System.out.println("Press 5 for the Elf Hawkeye         Press 6 for the Dragon Summoner Yusef");
		System.out.println("Attack      7               Attack      13");
		System.out.println("Defense     1               Defense     2");
		System.out.println("Health      17              Health      10");
		hero = input.nextInt();
		if (hero == 1) {
			System.out.println("You have chosen Lord Valon!");
			for (hero = 1; ; ) {
				System.out.println("Your battle is against....");
				System.out.println("");
				match = 1 + battle.nextInt(5);
				if (match == 1) {
					System.out.println("Rintar!");
					System.out.println("");
					valon.attack1 = 8;
					valon.defense1 = 1;
					valon.health1 = 16;
					valon.calculateWinner();
				} else if (match == 2) {
					System.out.println("Prince Zersious!");
					System.out.println("");
					valon.attack1 = 5;
					valon.defense1 = 2;
					valon.health1 = 18;
					valon.calculateWinner();
				} else if (match == 3) {
					System.out.println("Balrock!");
					System.out.println("");
					valon.attack1 = 10;
					valon.defense1 = 0;
					valon.health1 = 15;
					valon.calculateWinner();
				} else if (match == 4) {
					System.out.println("Hawkeye!");
					System.out.println("");
					valon.attack1 = 7;
					valon.defense1 = 1;
					valon.health1 = 17;
					valon.calculateWinner();
				} else if (match == 5) {
					System.out.println("Yusef!");
					System.out.println("");
					valon.attack1 = 13;
					valon.defense1 = 2;
					valon.health1 = 10;
					valon.calculateWinner();
				}
				System.out.println("");
				System.out.println("Fight again?");
				System.out.println("1 for Yes");
				System.out.println("2 for No");
				restart = input.nextInt();
				if (restart == 1) {
					System.out.println("");
				} else if (restart == 2) {
					System.out.println("Thank you for playing!");
					break;
				}
			}
		}
		if (hero == 2) {
			System.out.println("You have chosen Rintar!");
			for (hero = 2; ; ) {
				System.out.println("Your battle is against....");
				System.out.println("");
				match = 1 + battle.nextInt(5);
				if (match == 1) {
					System.out.println("Lord Valon!");
					System.out.println("");
					rintar.attack1 = 6;
					rintar.defense1 = 0;
					rintar.health1 = 19;
					rintar.calculateWinner();
				} else if (match == 2) {
					System.out.println("Prince Zersious!");
					System.out.println("");
					rintar.attack1 = 5;
					rintar.defense1 = 2;
					rintar.health1 = 18;
					rintar.calculateWinner();
				} else if (match == 3) {
					System.out.println("Balrock!");
					System.out.println("");
					rintar.attack1 = 10;
					rintar.defense1 = 0;
					rintar.health1 = 15;
					rintar.calculateWinner();
				} else if (match == 4) {
					System.out.println("Hawkeye!");
					System.out.println("");
					rintar.attack1 = 7;
					rintar.defense1 = 1;
					rintar.health1 = 17;
					rintar.calculateWinner();
				} else if (match == 5) {
					System.out.println("Yusef!");
					System.out.println("");
					rintar.attack1 = 13;
					rintar.defense1 = 2;
					rintar.health1 = 10;
					rintar.calculateWinner();
				}
				System.out.println("");
				System.out.println("Fight again?");
				System.out.println("1 for Yes");
				System.out.println("2 for No");
				restart = input.nextInt();
				if (restart == 1) {
					System.out.println("");
				} else if (restart == 2) {
					System.out.println("Thank you for playing!");
					break;
				}
			}
		}
		if (hero == 3) {
			System.out.println("You have chosen Prince Zersious!");
			for (hero = 3; ; ) {
				System.out.println("Your battle is against....");
				System.out.println("");
				match = 1 + battle.nextInt(5);
				if (match == 1) {
					System.out.println("Lord Valon!");
					System.out.println("");
					zersious.attack1 = 6;
					zersious.defense1 = 0;
					zersious.health1 = 19;
					zersious.calculateWinner();
				} else if (match == 2) {
					System.out.println("Rintar!");
					System.out.println("");
					zersious.attack1 = 8;
					zersious.defense1 = 1;
					zersious.health1 = 16;
					zersious.calculateWinner();
				} else if (match == 3) {
					System.out.println("Balrock!");
					System.out.println("");
					zersious.attack1 = 10;
					zersious.defense1 = 0;
					zersious.health1 = 15;
					zersious.calculateWinner();
				} else if (match == 4) {
					System.out.println("Hawkeye!");
					System.out.println("");
					zersious.attack1 = 7;
					zersious.defense1 = 1;
					zersious.health1 = 17;
					zersious.calculateWinner();
				} else if (match == 5) {
					System.out.println("Yusef!");
					System.out.println("");
					zersious.attack1 = 13;
					zersious.defense1 = 2;
					zersious.health1 = 10;
					zersious.calculateWinner();
				}
				System.out.println("");
				System.out.println("Fight again?");
				System.out.println("1 for Yes");
				System.out.println("2 for No");
				restart = input.nextInt();
				if (restart == 1) {
					System.out.println("");
				} else if (restart == 2) {
					System.out.println("Thank you for playing!");
					break;
				}
			}
		}
		if (hero == 4) {
			System.out.println("You have chosen Balrock!");
			for (hero = 4; ; ) {
				System.out.println("Your battle is against....");
				System.out.println("");
				match = 1 + battle.nextInt(5);
				if (match == 1) {
					System.out.println("Lord Valon!");
					System.out.println("");
					balrock.attack1 = 6;
					balrock.defense1 = 0;
					balrock.health1 = 19;
					balrock.calculateWinner();
				} else if (match == 2) {
					System.out.println("Prince Zersious!");
					System.out.println("");
					balrock.attack1 = 5;
					balrock.defense1 = 2;
					balrock.health1 = 18;
					balrock.calculateWinner();
				} else if (match == 3) {
					System.out.println("Rintar!");
					System.out.println("");
					balrock.attack1 = 8;
					balrock.defense1 = 1;
					balrock.health1 = 16;
					balrock.calculateWinner();
				} else if (match == 4) {
					System.out.println("Hawkeye!");
					System.out.println("");
					balrock.attack1 = 7;
					balrock.defense1 = 1;
					balrock.health1 = 17;
					balrock.calculateWinner();
				} else if (match == 5) {
					System.out.println("Yusef!");
					System.out.println("");
					balrock.attack1 = 13;
					balrock.defense1 = 2;
					balrock.health1 = 10;
					balrock.calculateWinner();
				}
				System.out.println("");
				System.out.println("Fight again?");
				System.out.println("1 for Yes");
				System.out.println("2 for No");
				restart = input.nextInt();
				if (restart == 1) {
					System.out.println("");
				} else if (restart == 2) {
					System.out.println("Thank you for playing!");
					break;
				}
			}
		}
		if (hero == 5) {
			System.out.println("You have chosen Hawkeye!");
			for (hero = 5; ; ) {
				System.out.println("Your battle is against....");
				System.out.println("");
				match = 1 + battle.nextInt(5);
				if (match == 1) {
					System.out.println("Lord Valon!");
					System.out.println("");
					hawkeye.attack1 = 6;
					hawkeye.defense1 = 0;
					hawkeye.health1 = 19;
					hawkeye.calculateWinner();
				} else if (match == 2) {
					System.out.println("Prince Zersious!");
					System.out.println("");
					hawkeye.attack1 = 5;
					hawkeye.defense1 = 2;
					hawkeye.health1 = 18;
					hawkeye.calculateWinner();
				} else if (match == 3) {
					System.out.println("Balrock!");
					System.out.println("");
					hawkeye.attack1 = 10;
					hawkeye.defense1 = 0;
					hawkeye.health1 = 15;
					hawkeye.calculateWinner();
				} else if (match == 4) {
					System.out.println("Rintar!");
					System.out.println("");
					hawkeye.attack1 = 8;
					hawkeye.defense1 = 1;
					hawkeye.health1 = 16;
					hawkeye.calculateWinner();
				} else if (match == 5) {
					System.out.println("Yusef!");
					System.out.println("");
					hawkeye.attack1 = 13;
					hawkeye.defense1 = 2;
					hawkeye.health1 = 10;
					hawkeye.calculateWinner();
				}
				System.out.println("");
				System.out.println("Fight again?");
				System.out.println("1 for Yes");
				System.out.println("2 for No");
				restart = input.nextInt();
				if (restart == 1) {
					System.out.println("");
				} else if (restart == 2) {
					System.out.println("Thank you for playing!");
					break;
				}
			}
		}
		if (hero == 6) {
			System.out.println("You have chosen Yusef!");
			for (hero = 6; ; ) {
				System.out.println("Your battle is against....");
				System.out.println("");
				match = 1 + battle.nextInt(5);
				if (match == 1) {
					System.out.println("Lord Valon!");
					System.out.println("");
					yusef.attack1 = 6;
					yusef.defense1 = 0;
					yusef.health1 = 19;
					yusef.calculateWinner();
				} else if (match == 2) {
					System.out.println("Prince Zersious!");
					System.out.println("");
					yusef.attack1 = 5;
					yusef.defense1 = 2;
					yusef.health1 = 18;
					yusef.calculateWinner();
				} else if (match == 3) {
					System.out.println("Balrock!");
					System.out.println("");
					yusef.attack1 = 10;
					yusef.defense1 = 0;
					yusef.health1 = 15;
					yusef.calculateWinner();
				} else if (match == 4) {
					System.out.println("Rintar!");
					System.out.println("");
					yusef.attack1 = 8;
					yusef.defense1 = 1;
					yusef.health1 = 16;
					yusef.calculateWinner();
				} else if (match == 5) {
					System.out.println("Hawkeye!");
					System.out.println("");
					yusef.attack1 = 13;
					yusef.defense1 = 2;
					yusef.health1 = 10;
					yusef.calculateWinner();
				}
				System.out.println("");
				System.out.println("Fight again?");
				System.out.println("1 for Yes");
				System.out.println("2 for No");
				restart = input.nextInt();
				if (restart == 1) {
					System.out.println("");
				} else if (restart == 2) {
					System.out.println("Thank you for playing!");
					break;
				}
			}
		}
	}
}