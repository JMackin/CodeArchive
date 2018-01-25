/**
 * Created by melanos on 11/19/15.
 */
import java.util.Scanner;

public class Test {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        for ( int num = 0; num <= 100; num++) {
            if (num % 3 == 0 && num % 5 ==0) {
                System.out.println("fizzbuzz");

            } else if (num % 5 == 0) {
                System.out.println("Buzz");

            } else if (num % 3 == 0) {
                System.out.println("fizz");

            } else {
                System.out.println(num);
            }
        }

    }//END MAIN
}//END CLASS
