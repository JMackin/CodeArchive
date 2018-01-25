/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       03/06/14
 *
 * Filename:   ScannerUsage.java
 *
 * Purpose:    Demo examples for using Scanner class 
 */
 
import java.util.Scanner;

public class ScannerUsage {

    public static void main(String [] args) {
    
        Scanner scan = new Scanner(System.in);
        String firstName, fullName, tempStr;
        int age;
        char inputKey;
        
        // prompt for and read first name
        System.out.print("Enter your first name > ");
        firstName = scan.next();    // reads next String token
        System.out.println("Hello, " + firstName);
        
        // prompt for and read age
        System.out.print("\nEnter your age [in yrs], " + firstName + " > ");
        age = scan.nextInt();   // reads next integer
        System.out.println("I see you are " + age + " years old");
        
        // sometimes needed to "consume" any residual 
        // input buffer characters: NN + <cr>
        // if you get exception or missing text errors, this is often why
        // try this example with and without the following line
        scan.nextLine();  // reads input buffer, dumps it on the ground
        
        // prompt for enemy annihilation go-ahead
        System.out.print("\nTerminate all enemy intruders? [y/n] > ");
        
        // reading one character in two individual steps
        tempStr = scan.nextLine();
        inputKey = tempStr.charAt(0);
        
        // reading one character in one combined step
        //inputKey = scan.nextLine().charAt(0);
        
        System.out.println(firstName + ", your order is: " + inputKey);
                      
    } // end main

} // end class