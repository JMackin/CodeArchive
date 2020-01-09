//CS 235 Fall 2019 Assignment #2
// GameDie.java file

/**
 *  A GameDie object represents a single game die.
 *
 *  It has a set number of sides, each numbered from
 *  1 to the number of sides, and it can be rolled, 
 *  which results in a number between 1 and the number of
 *  sides.

 *  adapted from C++ class Dice from Astrachan's
 *  "A Computer Science Tapestry", 2nd edition,
 *  pp. 214, 217
 *
 *  @author Owen Astrachan
 *  @author Adapted by Sharon Tuttle
 *  @author Further adapted by David C. Tuttle
 *  @version 2019-10-22
*/

public class GameDie {
    // data fields

    private int numRolls;
    private int numSides;
    
    /**
        construct a new die with the user-specified
        number of sides

        @param desiredNumSides number of sides for this die
    */

    public GameDie(int desiredNumSides) {
        numRolls = 0;
        numSides = desiredNumSides;
    }

    /**
       return the die's number of sides

       @return number of sides of calling die
    */

    public int getNumSides() {
        return numSides;
    }

    /**
       return the die's number of times rolled

       @return number of times calling die has been rolled
    */

    public int getNumRolls() {
        return numRolls;
    }

    /**
        roll this game die instance

        @return the value of this roll of this game die
    */

    public int roll() {
        numRolls++;
    
        return (int) ( (Math.random() * numSides) + 1.0 );
    }
    
    /**
     * make a prettier String depiction of a GameDie
     * 
     * @return a String depiction including number of
     *         rolls and number of sides
     */
    
    public String toString() {
        return "GameDie[" + numSides + " sides, rolled "
               + numRolls + " times]";
    }
}
