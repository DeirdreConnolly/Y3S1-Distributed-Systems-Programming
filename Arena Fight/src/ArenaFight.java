public class ArenaFight {

	public static void main(String[] args) {

		// Creating objects
		RollingDie die = new RollingDie(10);

		Warrior zalgoren = new Warrior("Zalgoren", 100, 20, 10, die);
//		Warrior shadow = new Warrior("Shadow", 60, 18, 15, die);
		Warrior gandalf = new Mage("Gandalf", 60, 15, 12, die, 30, 45);

		// Players in the arena
		Arena arena = new Arena(zalgoren, gandalf, die);

		// Fight
		arena.fight();
	}
}
