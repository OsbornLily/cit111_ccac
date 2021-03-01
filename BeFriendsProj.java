/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chunk1friendsproject;

import java.util.Scanner;

/**
 *
 * @author Happy to See Me
 */
public class BeFriendsProj {

    public static void main(String[] args) {
        //create storage variables
        int compatScore = 0;
        final int COMPAT_THRESHOLD = 70;
        int userResponce = 0;
        Scanner inputScanner;

         boolean passedThreshold = false;
         
        //fixed point system
        final int Q1_ANSWER_YES = 25;
        final int Q1_ANSWER_NO = 0;

        inputScanner = new Scanner(System.in);
        System.out.println("Hi Everyone! Welcome to my ~Might Be Friends~ Questionaire.");
        System.out.println("Here are a few simple questions: ");

        //QUESTION 1
        System.out.println("I like to drink alot of tea! Are you down for some wild tea parties?");
        System.out.println("Enter 1 for Yes, other for No.");

        //use scanner for userResponce
        userResponce = inputScanner.nextInt();

        if (userResponce == 1) {
            compatScore = compatScore + Q1_ANSWER_YES;
            System.out.println("Hells yeah, let's keep that kettle whistling till dawn!");
            System.out.println("You've got " + Q1_ANSWER_YES + " points so far.");

            //QUESTION 2
            System.out.println("I'd like to call myself a movie buff, Choose one of these spicy classic flicks: ");

            System.out.println("1. Sharknado");
            System.out.println("2. Bee Movie");
            System.out.println("3. Twilight");
            System.out.println("4. Diner, Drive-ins, and Dives.");
            System.out.println("5. The Blob.");

            userResponce = inputScanner.nextInt();
            if (userResponce == 1) {
                //Sharknado
                compatScore = compatScore + 25;
            } else if (userResponce == 2) {
                //Bee Movie
                compatScore = compatScore + 20;
            } else if (userResponce == 3) {
                //Twilight
                compatScore = compatScore + 15;
            } else if (userResponce == 4) {
                //DDD
                compatScore = compatScore + 10;
            } else if (userResponce == 5) {
                //Blob
                compatScore = compatScore + 5;
            }  //end chain for Q2 

            System.out.println("Thanks for choosing one of these profound films!");
            System.out.println("To keep you updated, you have " + compatScore + " points now.");

            //QUESTION 3
            System.out.println("Now let's pick out some Fancy Snacks for our party!");
            System.out.println("I'm a Bruschetta gal, but you get some points for all answers!");

            System.out.println("1.Gryere and Crab Palmiers");
            System.out.println("2.Mini Cheese Balls");
            System.out.println("3.Avocada Bruschetta");
            System.out.println("4.Brie Mushroom Pastries");
            System.out.println("5.Honey-Mint Lamb Skewers");

            userResponce = inputScanner.nextInt();
            if (userResponce == 1) {
                //Gryere/Crab Palmiers
                compatScore = compatScore + 20;
            } else if (userResponce == 2) {
                //Mini Cheese Balls
                compatScore = compatScore + 10;
            } else if (userResponce == 3) {
                //Avocado Bruschetta
                compatScore = compatScore + 25;
            } else if (userResponce == 4) {
                //Brie Mushroom Pastries
                compatScore = compatScore + 15;
            } else if (userResponce == 5) {
                //Honey-Mint Lamb Skewers
                compatScore = compatScore + 5;
            }  //end chained ifs for Q3
            
             System.out.println("Great! You've got to have some Lavish Hors d'oeuvres for a Wild Tea Party, " + compatScore + " points!");

        System.out.println("Did you enjoy yourself during my party? Enter 1 if you did, and anything else if not.");

        //use scanner for userResponce
        userResponce = inputScanner.nextInt();

        if (userResponce == 1) {
            compatScore = compatScore + Q1_ANSWER_YES;
            System.out.println("Fantastic! Let's do it again soon! You had " + compatScore + " points.");

        } else { // this block runs if user didn't like my party
            compatScore = compatScore + Q1_ANSWER_NO;
            System.out.println("Ope. Not very nice of you, man.");
        }
        } else {
            System.out.println("Boo, you're a bit too uncultured for me.");
        }
        
        if(compatScore >= COMPAT_THRESHOLD){
            passedThreshold = true;
            System.out.println("We'd be vibin' though, for sure! High Friend Compatability!");
        } else {
            System.out.println("We have Low Friend Compatability, Sorry.");
        } //close if/else for overall compat checking
     
    }//close main

}//close class
