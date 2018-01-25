/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       11/25/14
 *
 * Filename:   SplitPersonFileRead.java
 *
 * Purpose:    This example demonstrates reading from a text file,
 *              and parsing up the input lines using split()
 *             Based upon the earlier example LoopingWhileFileEcho.java,
 *              except extended by showing parsing.
 */

import java.util.Scanner;  // to set up a file read
import java.io.File;
import java.io.IOException;

public class SplitPersonFileRead {

    public static void main(String [] args) throws IOException {
    
        // declarations
        String filename, text;
        Person p;
        int numLines = 0;
        
        // first read an input filename using utils
        filename = UtilsRL.readString("Enter text file name: ", false);
        
        // set up a second Scanner to read from that file
        File infile = new File(filename);
        Scanner fileInput = new Scanner(infile);
        
        // read and echo each line of the file
        System.out.println("Reading from local file: " + filename + "\n");
        while (fileInput.hasNext()) {
            text = fileInput.nextLine();
            p = SplitPerson.createPerson(text);
            p.print("new Person:");
            numLines++;
        }
        System.out.println("\nFinished, created " + numLines + " Persons");
        
    } // end main

} // end class

