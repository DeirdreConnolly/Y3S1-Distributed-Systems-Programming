import java.util.Random;

public class RollingDie {

	private Random random;
	private int sidesCount;


	// Overloaded constructor
	public RollingDie() {
		sidesCount = 6;
		random = new Random();
	}


	public RollingDie(int sidesCount) {
		this.sidesCount = sidesCount;
		random = new Random();
	}


	public int getSidesCount() {
		return sidesCount;
	}


	public int roll() {
		return random.nextInt(sidesCount) + 1;
	}


	// toString Method
	@Override
	public String toString() {
		return ("Rolling die with " + sidesCount + " sides");    // Test
	}
}
