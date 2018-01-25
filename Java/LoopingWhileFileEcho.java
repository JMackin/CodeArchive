/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       11/04/14
 *
 * Filename:   LoopingWhileFileEcho.java
 *
 * Purpose:    Example of echoing the contents of a text file.
 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class LoopingWhileFileEcho {

    public static void main(String [] args) throws IOException {
    
        // declarations
        String filename, text;
        int numLines = 0;
        
        // set up a Scanner to read an input filename
        Scanner cmdInput = new Scanner(System.in);
        System.out.print("Enter text file name: ");
        filename = cmdInput.nextLine();
        
        // set up a second Scanner to read from that file
        File infile = new File(filename);
        Scanner fileInput = new Scanner(infile);
        
        // read and echo each line of the file
        System.out.println("Reading from local file: " + filename + "\n");
        while (fileInput.hasNext()) {
            text = fileInput.nextLine();
            numLines++;
            System.out.println(text);
        }
        System.out.println("\nFinished, read in " + numLines + " lines");
        
    } // end main

} // end class

