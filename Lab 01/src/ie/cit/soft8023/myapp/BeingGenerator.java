//package ie.cit.soft8023.myapp;
//
///*
//Create 2 superBeing, 1 humanBeing
//One of the superBeings should transform to/from the humanBeing
// */
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class BeingGenerator {
//
//	public static void main(String[] args) {
//
//		List<BaseAttack> attacks = new ArrayList<BaseAttack>();
//
//		attacks.add(new Punch(3));
//		attacks.add(new LaserEye(1));
//		attacks.add(new FreezeRay(1));
//
//		Being megaMutant = new SuperBeing("Mega Mutant", new CoreAttributes(20, 15, 12, 24), attacks);      // Create superBeing #1
//
//		attacks = new ArrayList<BaseAttack>();
//		attacks.add(new Kick(1));
//		attacks.add(new Punch(1));
//
//		Being bruceBanner = new HumanBeing("Bruce Banner", new CoreAttributes(5, 3, 4, 7), attacks);        // Create humanBeing #1, transforms into superBeing
//
//		attacks = new ArrayList<BaseAttack>();
//		attacks.add(new Kick(4));
//		attacks.add(new Punch(5));
//
//		Being hulk = new SuperBeing("Hulk", new CoreAttributes(20, 15, 12, 24), attacks, bruceBanner);              // Create superBeing #1
//
//		megaMutant.whoAreYou();
//		megaMutant.whatAreYou();
//		megaMutant.whatAreYouCapableOf();
//
//		bruceBanner.whoAreYou();
//		bruceBanner.whatAreYou();
//		bruceBanner.whatAreYouCapableOf();
//
//		hulk.whoAreYou();
//		hulk.whatAreYou();
//		hulk.whatAreYouCapableOf();
//	}
//}
//
//
