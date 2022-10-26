//package ie.cit.soft8023.myapp;
//
//import java.util.Random;
//
//public class Battle {
//
//    Random battle = new Random();
//
//    int newHealth, newHealth1;
//    int outcome, outcome1, outcome2, outcome3;
//    int attack, attack1;
//    int defence, defence1;
//    int health, health1;
//
//    void calculateWinner() {
//        do {
//            outcome = attack - defence1;
//            newHealth1 = health1 - outcome;
//            System.out.println("Your attack does " + outcome + " damage!");
//            System.out.println("Enemy Health");
//            System.out.println(newHealth1);
//            outcome2 = attack1 - defence;
//            newHealth = health - outcome2;
//            System.out.println("Enemies attack does " + outcome2 + " damage!");
//            System.out.println("Your Health");
//            System.out.println(newHealth);
//            if (newHealth1 > 0 && newHealth > 0) {
//                outcome = attack - defence1;
//                outcome1 = 2 * outcome;
//                newHealth1 = health1 - outcome1;
//                System.out.println("Your attack does " + outcome + " damage!");
//                System.out.println("Enemy Health");
//                System.out.println(newHealth1);
//                outcome = attack1 - defence;
//                outcome1 = 2 * outcome;
//                newHealth = health - outcome1;
//                System.out.println("Enemies attack does " + outcome2 + " damage!");
//                System.out.println("Your Health");
//                System.out.println(newHealth);
//
//                if (newHealth1 > 0 && newHealth > 0) {
//                    outcome = attack - defence1;
//                    outcome1 = 3 * outcome;
//                    newHealth1 = health1 - outcome1;
//                    System.out.println("Your attack does " + outcome + " damage!");
//                    System.out.println("Enemy Health");
//                    System.out.println(newHealth1);
//                    outcome = attack1 - defence;
//                    outcome1 = 3 * outcome;
//                    newHealth = health - outcome1;
//                    System.out.println("Enemies attack does " + outcome2 + " damage!");
//                    System.out.println("Your Health");
//                    System.out.println(newHealth);
//
//                    if (newHealth1 > 0 && newHealth > 0) {
//                        outcome = attack - defence1;
//                        outcome1 = 4 * outcome;
//                        newHealth1 = health1 - outcome1;
//                        System.out.println("Your attack does " + outcome + " damage!");
//                        System.out.println("Enemy Health");
//                        System.out.println(newHealth1);
//                        outcome = attack1 - defence;
//                        outcome1 = 4 * outcome;
//                        newHealth = health - outcome1;
//                        System.out.println("Enemies attack does " + outcome2 + " damage!");
//                        System.out.println("Your Health");
//                        System.out.println(newHealth);
//
//                        if (newHealth1 > 0 && newHealth > 0) {
//                            outcome = attack - defence1;
//                            outcome1 = 5 * outcome;
//                            newHealth1 = health1 - outcome1;
//                            System.out.println("Your attack does " + outcome + " damage!");
//                            System.out.println("Enemy Health");
//                            System.out.println(newHealth1);
//                            outcome = attack1 - defence;
//                            outcome1 = 5 * outcome;
//                            newHealth = health - outcome1;
//                            System.out.println("Enemies attack does " + outcome2 + " damage!");
//                            System.out.println("Your Health");
//                            System.out.println(newHealth);
//                        }
//                    }
//                }
//            }
//        } while (newHealth1 > 0 && newHealth > 0);
//        if (newHealth1 <= 0 && newHealth > 0) {
//            System.out.println("You win!");
//        }
//        if (newHealth <= 0 && newHealth1 > 0) {
//            System.out.println("You lose!");
//        }
//        if (newHealth <= 0 && newHealth1 <= 0) {
//            System.out.println("Draw!");
//        }
//    }
//}
//
