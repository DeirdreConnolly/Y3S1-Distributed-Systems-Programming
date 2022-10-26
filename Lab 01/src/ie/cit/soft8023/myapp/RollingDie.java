package ie.cit.soft8023.myapp;

import java.util.Random;

public class RollingDie {

	private Random random;
	private int sidesCount;


	// Constructors
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


	// toString method
	@Override
	public String toString() {
		return ("Rolling die with " + sidesCount + " sides");	// Test
	}
}
