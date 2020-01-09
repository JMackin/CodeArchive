
public class GameDie
{
    // data fields
    private int numRolls;
    private int numSides;
    private int top;
    /**
     construct a new die with the user-specified number of sides,
     which has not yet been rolled and which starts with a top value
     of 1
     @param desiredNumSides number of sides for this die
     */
    public GameDie(int desiredNumSides) {
        numRolls = 0;
        numSides = desiredNumSides;
        top = 1;
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
     return the die's current top value (the value of
     its most recent roll, or 1 if the die has never
     been rolled)
     @return the die's current top value
     */
    public int getTop() {
        return top;
    }
    /**
     roll this game die instance
     @return the value of this roll of this game die
     */
    public int roll() {
        numRolls++;
        top =  (int) ( (Math.random() * numSides) + 1.0 );
        return top;
    }
}