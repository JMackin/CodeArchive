/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12, Spring 2014
 *
 * Date:       10/07/14
 *
 * Filename:   RandomExamples.java
 *
 * Purpose:    Examples of using the Random class
 */

import java.util.Random;         // for random numbers
import java.util.Scanner;        // for cmd line inputs

public class RandomExamples {

    public static void main(String [] args) {
    
        // declarations
        Random rand = new Random();             // random number generator object
        Scanner scan = new Scanner(System.in);
        
        int dice1, dice2;              // two dice
        int minNum, maxNum, randNum;   // random numbers
        
        // random dice roll
        dice1 = rand.nextInt(6) + 1;
        dice2 = rand.nextInt(6) + 1;
        System.out.println("The dice show " + 
                           dice1 + " and " + dice2 + 
                           ", for a total of: " + (dice1 + dice2));
        
        // random number over a range
        System.out.println();
        System.out.print("Enter min number: ");
        minNum = scan.nextInt();
        System.out.print("Enter max number: ");
        maxNum = scan.nextInt();  
        
        randNum = rand.nextInt(maxNum - minNum + 1) + minNum;
        System.out.println("A random number over [" + 
                           minNum + "," + maxNum + "] is: " + randNum);    
                       
    }

}