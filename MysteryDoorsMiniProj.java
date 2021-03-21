/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodpracticepackage;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Happy to See Me
 */
public class MysteryDoorsMiniProj {

    public static void main(String[] args) {
        System.out.println("WELCOME TO THE SCARE HOUSE!");

        Scanner scan = new Scanner(System.in);
        boolean keepLooping = false;
        //use do/while for repeated interaction
        do {
            System.out.println("Door 1");
            System.out.println("Door 2");
            System.out.println("Door 3");
            System.out.println("Enter one of My Scary Doors if you ever so Dare, but if you do...Beware!");
            int selector = scan.nextInt();

            //switch statement for delegating work in specifically chosen "door"
            switch (selector) {
                case 1:
                    runFromTheDead();
                    break;
                case 2:
                    keepingVampiresAtBay();
                    break;
                case 3:
                    stompOnTheSpiders();
                    break;
                default:
                    System.out.println("You've Chosen Not to Enter My Scare House :( ");
                    break;
            }//close off switch 

        } while (keepLooping); //end of do/while

        System.out.println("Hope you have a Frightening Night!");
    } //close main

    /**
     * Makes your guess the correct number so you can escape from the Undead
     */
    public static void runFromTheDead() {
        System.out.println("You've ran into a horde of Zombies!");
        System.out.println("Guess the correct number to avoid being bitten!");
        Random rand = new Random();

        //choose a random int between 0 and 10
        int computerChosenInt = rand.nextInt(11);
        Scanner scan = new Scanner(System.in);

        int userGuess;
        boolean correctGuess = false;
        int guesses = 0;
        final int MAX_GUESSES = 3;
        do {
            userGuess = scan.nextInt();
            //keep looping if the user guesses incorrectly & hasn't run out of guesses
            if (userGuess != computerChosenInt) {
                System.out.println("Nope! Hurry, Guess again!");
            } else {
                System.out.println("Woo! You've escaped without a scratch on you.");
                //toggle correct guess
                correctGuess = true;
            }
            if (!correctGuess) {
                if (userGuess > computerChosenInt) {
                    System.out.println("Your guess was OVER the correct number");
                } else {
                    System.out.println("Your guess was LOWER than the correct number");
                }
            }
            guesses++;
            //keep looping if user enters the wrong guess or has guesses left
        } while (!correctGuess && guesses <= MAX_GUESSES);
    }//close raiseTheDead

    /**
     * Makes you answer the math question correctly in order to Kill the
     * Unwanted Spiders that have Covered you
     */
    public static void stompOnTheSpiders() {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.println("You've let loose hundreds of creepy, crawly spiders!");
        System.out.println("They're crawling all over you! They're trying to enter all of your orfices!");
        System.out.println("Enter the correct answer to the math equation to stomp on the spiders!");

        int mathNumber1 = 52;
        int mathNumber2 = 17;
        int answerWhenMultiplied = mathNumber1 * mathNumber2;

        int userGuess;
        boolean correctGuess = false;
        int guesses = 0;
        final int MAX_GUESSES = 2;

        System.out.println(mathNumber1 + " * " + mathNumber2 + " = ");

        do {
            userGuess = scan.nextInt();
            if (userGuess != answerWhenMultiplied) {
                System.out.println("Wrong! Yuck...THEY'RE EVERYWHERE!");
            } else {
                System.out.println("Correct! You've stomped on all the Spiders!");
                correctGuess = true;
            }
            guesses++;

        } while (!correctGuess && guesses <= MAX_GUESSES);
    }//close stompOnTheSpiders

    /**
     * Makes you choose a weapon in order to send the Vampire back to his Coffin
     */
    public static void keepingVampiresAtBay() {
        System.out.println("You've entered into the Vampire's Lair");
        System.out.println("Choose your weapon of choice to keep him from Sucking your Blood!");
        System.out.println("Choose wisely, though! Not all these weapons will keep him away..");

        int compatScore = 0;
        final int COMPAT_THRESHOLD = 5;
        int userResponce = 0;
        Scanner inputScanner;

        boolean passedThreshold = false;

        inputScanner = new Scanner(System.in);

        System.out.println("1.Garlic");
        System.out.println("2.Crucifix");
        System.out.println("3.Holy Water");
        System.out.println("4.Wooden Steak");
        System.out.println("5.Sunlight");

        userResponce = inputScanner.nextInt();
        switch (userResponce) {
            case 1 -> //
                compatScore = compatScore + 0;
            case 2 -> //
                compatScore = compatScore + 5;
            case 3 -> //
                compatScore = compatScore + 0;
            case 4 -> //
                compatScore = compatScore + 5;
            case 5 -> //
                compatScore = compatScore + 0;
        }//end switch
        if (compatScore >= COMPAT_THRESHOLD) {
            passedThreshold = true;
            System.out.println("You've chosen wisely, the Vampire has scurried away to his Coffin.");
        } else {
            System.out.println("Not a good enough weapon! The Vampire went right for the jugular!");
        }
    }//close keepingVampiresAtBay

}//close class 
