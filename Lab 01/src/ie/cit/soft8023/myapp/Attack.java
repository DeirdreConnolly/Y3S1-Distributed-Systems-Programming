package ie.cit.soft8023.myapp;

/*
Should return an object containing adjustments to the core attributes of health, stamina, power and speed
*/

public interface Attack {

    // HumanBeing only
    void kick();
    void punch();


    // SuperBeing
    void freezeRay();
    void laserEye();



    }


//    // attack method
//    public default void attack(Being enemy) {        // Takes enemy as parameter
//
//        int hit = (damage + die.roll());       // Inflict random damage
//
//        setMessage(name + " attacks with a hit worth " + hit + " HP");
//
//        enemy.defend(hit);
//    }
//
//
//    // defend method
//    public void defend(int hit) {
//
//        int injury = (hit - (defence + die.roll()));    // Subtract random damage
//
//        if (injury > 0) {
//            health -= injury;
//            message = (name + " defended against the attack but still lost " + injury + " HP\n");
//
//            if (health <= 0) {
//                health = 0;
//                message += ("\n>>> FATAL ATTACK <<<\n" + name + " has fallen\n");		// Warrior dies
//            }
//
//        } else
//            message = (name + " blocked the hit");
//
//        setMessage(message);
//    }
