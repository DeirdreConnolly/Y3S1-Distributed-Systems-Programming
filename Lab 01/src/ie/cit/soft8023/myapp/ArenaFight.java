package ie.cit.soft8023.myapp;

import java.util.ArrayList;
import java.util.List;

import static ie.cit.soft8023.myapp.NameGenerator.generateName;

public class ArenaFight {

	//	public static void main(String[] args, int attacks) {
	public static void main(String[] args) {

		List<BaseAttack> attacks = new ArrayList<BaseAttack>();

		// Creating objects
		RollingDie die = new RollingDie(10);

		Being aragon = new HumanBeing("Aragon", 100, 20, 10, die);
		Being wraith = new HumanBeing("Wraith", 60, 18, 15, die);
		Being gandalf = new SuperBeing("Gandalf", 60, 15, 12, die, 30, 45);


//		Being megaMutant = new SuperBeing("Mega Mutant", new CoreAttributes(20, 15, 12, 24), attacks);        // Create superBeing #1
//		Being bruceBanner = new HumanBeing("Bruce Banner", new CoreAttributes(5, 3, 4, 7), attacks);        // Create humanBeing #1, transforms into superBeing
//		Being hulk = new SuperBeing("Hulk", new CoreAttributes(20, 15, 12, 24), attacks, bruceBanner);            // Create superBeing #1


		// Players in the arena
//		Arena arena = new Arena(hulk, megaMutant, die);
		Arena arena = new Arena(wraith, gandalf, die);
//		Arena arena = new Arena(generateName(), generateName(), die);


		// Fight
		arena.fight();
	}
}
