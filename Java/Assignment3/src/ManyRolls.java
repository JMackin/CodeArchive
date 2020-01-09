/**
 * Created by Melanos on 11/12/2019.
 */

import java.util.*;


public class ManyRolls {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);


        try
        {
            System.out.println("Yo yo, Dicey-G, what's up my programma? How many dice sides you want fam? > ");
            int numDiceSides = Integer.parseInt(in.nextLine());
            System.out.println("\nHow many times you want to roll it? > ");
            int numDiceRolls = Integer.parseInt(in.nextLine());

            if(numDiceSides < 1 || numDiceRolls < 1)
            {
                throw new Exception();
            }

            GameDie diceyBoi = new GameDie(numDiceSides);

            System.out.println("Rolling a " + numDiceSides + "-sided die " + numDiceRolls + " times...");
            for (int i = 1; i < numDiceRolls + 1; i++)
            {
                System.out.println("Roll " + i + ": " + diceyBoi.roll());
            }

        }
        catch(Exception e)
        {
            System.out.println("Yeah that's not valid..");
        }






    }

}
