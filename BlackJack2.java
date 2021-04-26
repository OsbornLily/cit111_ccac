/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentalsproject;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Happy to See Me
 */
public class BlackJack2 {

    //Member Variables
    static int humanCardFaceDown;
    static int humanCard1;
    static int humanTotal;
    static int humanHitCard;

    static int computerCardUnknown;
    static int computerCard1;
    static int compTotal;
    static int compHitCard;

    public static void main(String[] args) {
        //delegate work to controlGamePlay
        controlGamePlay();

    }//close main

    /**
     * Simulate drawing of a card from a deck. The card value is represented as
     * an int between 2 through 11, with aces as 11 We'll let the compute point
     * total method deal with the situation of counting an ace as 1
     *
     * @return random card value
     */
    public static int generateRandomCard() {
        int cardValue;
        //make "random" generator
        Random random = new Random();
        //ask generator for value between 2 & 11
        //remember: the upper bound is exclusive, so
        //we want to get 11s drawn, so bound is 11+1 = 12
        do {
            cardValue = random.nextInt(11);
            //   System.out.println("Randomly Drew: " + cardValue);
        } while (cardValue == 0);

        return cardValue;

    }//close generateRandomCard

    public static void setupHands() {
        System.out.println("Setting up hands...");
        //generate cards for humanFaceDown & Card 1
        humanCardFaceDown = generateRandomCard();
        humanCard1 = generateRandomCard();
        //generate cards for computerUnknown & Card 1
        computerCardUnknown = generateRandomCard();
        computerCard1 = generateRandomCard();

    }//close setupHands

    public static void controlGamePlay() {
        //Step 1: Setup Hand

        setupHands();
        determineHumanCardPointTotal();
        determineComputerCardPointTotal();

        //give user a chance to hit/hold
        do {
            System.out.println("Do you want to Hit or Hold?");
            Scanner scan = new Scanner(System.in);
            String playChoice = scan.nextLine();
            if (playChoice.toLowerCase().equals("hit")) {
                humanPlayerHit();
                humanTotal = humanTotal + humanHitCard;
                System.out.println("You now have:" + humanTotal);

                if (humanTotal >= 22) {

                    System.out.println("Busted you Sucka! GIVE ME YOUR MONEY!!");
                    break;
                }

            } else {

                System.out.println("I'm sticking to my hand!");
                System.out.println("OK!!! Dealer flips: " + computerCardUnknown + ". Dealer has: " + compTotal);

                do {

                    compPlayerHit();
                    compTotal = compTotal + compHitCard;
                    System.out.println("Dealer has: " + compTotal);

                } while (compTotal < 17);

                determineWinner();
                break;

            }
        } while (humanTotal < 22);

    }//close controlGamePlay

    public static void humanPlayerHit() {

        Random random = new Random();
        do {

            humanHitCard = random.nextInt(11);

            if (humanHitCard != 0) {

                System.out.println("Randomly Drew: " + humanHitCard);

            }

        } while (humanHitCard == 0);

    }//close humanPlayerHit

    public static void compPlayerHit() {

        Random random = new Random();
        do {
            compHitCard = random.nextInt(11);

            if (compHitCard != 0) {

                System.out.println("Randomly Drew: " + compHitCard);

            }
        } while (compHitCard == 0);

    }//close compPlayerHit

    public static void determineHumanCardPointTotal() {

        System.out.println("*** Human Hand Status ***");
        System.out.println("Card 1: " + humanCardFaceDown);
        System.out.println("Card 2: " + humanCard1);

        if (humanCardFaceDown == 1) {

            do {

                humanCardFaceDown = 11;
                humanTotal = humanCardFaceDown + humanCard1;

            } while (humanTotal < 22);

        } else {

            humanTotal = humanCardFaceDown + humanCard1;

        }//close if/else

        if (humanCard1 == 1) {

            do {

                humanCard1 = 11;
                humanTotal = humanCardFaceDown + humanCard1;

            } while (humanTotal < 22);

        } else {

            humanTotal = humanCardFaceDown + humanCard1;

        }//close if/else
        System.out.println("Current Human Hand Amount: " + humanTotal);

    }//close determineHumanCardPointTotal

    public static void determineComputerCardPointTotal() {

        System.out.println("*** Computer Hand Status ***");

        if (computerCardUnknown == 1) {

            do {

                computerCardUnknown = 11;
                compTotal = computerCardUnknown + computerCard1;

            } while (compTotal < 22);

        } else {

            compTotal = computerCardUnknown + computerCard1;

        }//close if/else

        if (computerCard1 == 1) {

            do {

                computerCard1 = 11;
                compTotal = computerCardUnknown + computerCard1;

            } while (compTotal < 22);

        } else {

            compTotal = computerCardUnknown + computerCard1;

        }//close if/else 

        System.out.println("Dealer Showing: " + computerCard1);

    }//close determineComputerCardPointTotal

    public static void determineWinner() {

        if (humanTotal > compTotal) {

            System.out.println("You win money!");

        } else {

            if (compTotal >= 22) {

                System.out.println("Dealer busts, you lucky SOB");

            } else {

                System.out.println("GIVE ME YOUR MONEY!!!");

            }

        }

    }

}//close class

