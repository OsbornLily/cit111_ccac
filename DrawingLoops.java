/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chunk1mod5;

import java.util.Scanner;

/**
 *
 * @author Happy to See Me
 */
public class DrawingLoops {

    public static void main(String[] args) {
        int age;
        //make Scanner object and store in variable 
        Scanner inputScanner = new Scanner(System.in);

        while (true) {
            //prompt for user's age
            System.out.println("Enter your age to see if you can retire: ");
            //read age 
            age = inputScanner.nextInt();
            //implement basic if() logic--if they're over 65.5
            if (age > 65.5) {
                //if true
                System.out.println("Yay! Grab a newspaper and a brewski!");
                //here's the check for "stop signal" of an age less than zero
            } else if (age < 0) {
                //BREAK: if this statment is hit, jump after while()
                break;
                //if they can't retire and they have a real age, they're too young
            } else {
                System.out.println("Get back to work!");

            }//close if/else block

        }//close while loop

    }//close main

}//close class
