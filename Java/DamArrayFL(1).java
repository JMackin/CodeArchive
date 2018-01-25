/*
 * Name:
 *
 * Course:     CS-12, Spring 2015
 *
 * Date:
 *
 * Filename:   DamArrayFL.java
 *
 * Purpose:
 */
 
 // DIRECTIONS: Do a global substitute of DamRL and UtilsRL for your initials.
 // Replace DamArrayFL with your initials also.
 // Make sure this file compiles and runs with your Dam and Utils before proceeding.
 // Then delete these directions!!

import java.util.Scanner;  // to set up a file read
import java.io.File;
import java.io.IOException;

public class DamArrayFL {

    //---------------------------------------------
    // instance variables
    //---------------------------------------------
    
    // this is the array of Dams
    private DamRL [] dams;  
    
    // this tells us how many are used, AND index of *next* one
    private int count;
    
    // other internal variables  --------------------------------------
    
    // constants
    private final int MAX_SIZE = 10;
    
    // for internal overloaded separator() only
    private final char DEF_SEP = '-';
    private final int DEF_WIDTH = 40;
    private final int DEF_OHANG = 10;  // separator overhang past message
    
    // some status or error messages
    private final String ERROR_FULL    = "ERROR: Unable to add more dams, array is full";
    private final String ERROR_INVALID = "ERROR: Invalid index ";
    private final String ERROR_EMPTY   = "ERROR: No Dams currently exist";
    
    //---------------------------------------------
    // constructors
    //---------------------------------------------
    
    // default constructor: default array size, default values
    public DamArrayFL() {
        dams = new DamRL[MAX_SIZE];
        count = 0;
    }
    
    // overloaded constructor: specified array size, default values
    public DamArrayFL(int num) {
        dams = new DamRL[num];
        count = 0;
    }
    
    //---------------------------------------------
    // derived data accessors and utilities
    //---------------------------------------------
    
    // what is the maximum size of the array?
    public int getMaxSize() {
        return dams.length;
    }
    
    // what is the current used size of the array?
    public int getUsedSize() {
        return count;
    }
    
    // is there room to add more Dams?
    private boolean isRoom() {
        if (getUsedSize() < getMaxSize()) {
            return true;
        }
        else {
            return false;
        }
    }
    
    // tells whether an index is valid
    private boolean isValidIndex(int index) {
        // we can do this as 1-based or 0-based
        boolean status;
        
        if (index < 0) {
            // input can't be < 0
            status = false;
        }
        else if (count == 0) {
            // there are no valid elements
            status = false;
        }
        else if (index < count) {
            // any index less than size is OK
            status = true;
        }
        else {
            // index is past last element
            status = false;
        }
        return status;
    }
    
    // common across multiple operations:
    // obtain a desired (valid) index from user,
    // note that if empty array, there IS no valid index
    private int promptValidIndex() {
        int index;
        String prompt = "Enter dam number > ";
        
        // no valid index to be had
        if (getUsedSize() == 0) {
            index = -1;  // gotta return SOMETHING
        }
        
        // some valid index exists
        else {
            // prompt user for element index
            System.out.println("Which dam?");
            
            // print some sort of menu
            for (int i=0; i<getUsedSize() ; i++) {
                System.out.println("[" + i + "]: " + getDam(i).toString());
            }
            
            index = UtilsRL.readInt(prompt, false);
            while (!isValidIndex(index)) {
                // keep reprompting for a valid index
                index = UtilsRL.readInt(prompt, false);
            }
            return index;
        }
        return index;
    }
    
    //---------------------------------------------
    // display methods
    //---------------------------------------------
    
    // prints overall status of the array
    public String toString() {
        return getUsedSize() + " of " + 
               getMaxSize() + " dams used";
    }
    
    // nicely formatted fields as a brief list
    public void print() {
        for (int i=0; i<count; i++) {
            System.out.println(i + ") " + dams[i].toString());
        }
    }
    
    // nicely formatted fields + label
    public void print(String message) {
        separator(DEF_SEP, message.length() + DEF_OHANG);
        System.out.println(message);
        separator(DEF_SEP, message.length() + DEF_OHANG);
        print();
        blank();
    }
    
    //-----------------------
    // some display utilities
    //-----------------------
    
    // print a separator with specified width/character
    private void separator(char sep, int num) {
        for (int i=0; i<num; i++) {
            System.out.print(sep);
        }
        System.out.println();
    }
    
    // print a default separator
    private void separator() {
        separator(DEF_SEP, DEF_WIDTH);
    }
    
    // prints a blank line
    private void blank() {
        // either of these will work just fine
        //System.out.println();
        separator(' ', 10);
    }
    
    //---------------------------------------------
    // mutators
    //---------------------------------------------
    
    // mutator for one element
    // assume new elements are added to first open space
    public void addDam(DamRL dam) {
        // TODO: implement this method per program spec and pseudocode
        // remember to safely transfer all data to a COPY, and then add the copy
        System.out.println("call addDam()...");
    }
    
    //---------------------------------------------
    // accessors
    //---------------------------------------------
    
    // accessor for one element
    public DamRL getDam(int index) {
        // TODO: implement this method per program spec and pseudocode
        // remember to safely transfer all data to a COPY, and then return that copy
        System.out.println("call getDam()...");
        
        return new DamRL();   // stub value
    }
    
    //---------------------------------------------
    // equality
    //---------------------------------------------
    
    public boolean equals(Object obj) {
        // we are not going to worry about this for this program
        return false;
    }
    
    //---------------------------------------------
    // utility methods: "do something"
    // to one specific array element
    // note these next methods are all "self-contained"
    // they take action w/o any input or return values
    //---------------------------------------------
    
    // add Dams --------------------------
    
    // add Dam from command line
    public void addDamFromUser() {
        // TODO: implement this method per program spec and pseudocode
        System.out.println("call addDamFromUser()...");
    }
    
    // add a random Dam
    public void addDamRandom() {
        // TODO: implement this method per program spec and pseudocode
        System.out.println("call addDamRandom()...");
    }
    
    // add Dams from file
    public void addDamFromFile() throws IOException {
    
        // declarations
        String filename, text;
        DamRL temp;
        
        if (isRoom()) {
        
            // first read an input filename using utils
            filename = UtilsRL.readString("Enter text file name: ", false);
        
            // set up a second Scanner to read from that file
            File infile = new File(filename);
            Scanner fileInput = new Scanner(infile);
        
            // read and echo each line of the file
            while (fileInput.hasNext()) {
                text = fileInput.nextLine();
                temp = createDam(text);
                
                // add to the array, if room
                if (isRoom()) {
                    addDam(temp);
                }
                else {
                    System.out.println(ERROR_FULL);
                }
            }
        }
        else {
            System.out.println(ERROR_FULL);
        }
    }
    
    // turn a string of dam data into a Dam object, for the above method
    // assumed string format is: name, year, storage, capacity, inflow, outflow, date
    private DamRL createDam(String input) {

        // declarations for the eventual data
        String name;
        int year;
        double storage, capacity, inflow, outflow;
        SimpleDate date;
    
        // split the original line
        String [] tokens1 = input.split(",");
        for (int i=0; i < tokens1.length; i++) {
            // clean up any leading/trailing whitespace
            tokens1[i] = tokens1[i].trim();
        }
        
        // do a secondary split on the date token
        String [] tokens2 = tokens1[6].split("/");
        for (int i=0; i < tokens2.length; i++) {
            // clean up any leading/trailing whitespace
            tokens2[i] = tokens2[i].trim();
        }
        
        // extract scalar values and assemble object
        name = tokens1[0];
        year = Integer.parseInt(tokens1[1]);
        storage = Double.parseDouble(tokens1[2]);
        capacity = Double.parseDouble(tokens1[3]);
        inflow = Double.parseDouble(tokens1[4]);
        outflow = Double.parseDouble(tokens1[5]);
        
        date = new SimpleDate(Integer.parseInt(tokens2[0]),
                              Integer.parseInt(tokens2[1]),
                              Integer.parseInt(tokens2[2]));
                            
        // use all data to create a new Dam object
        return new DamRL(name, year, storage, capacity, inflow, outflow, date);
    }
           
    // update Dams -----------------------
    
    // update a specific Dam
    public void updateDam() {
        // TODO: implement this method per program spec and pseudocode
        System.out.println("call updateDam()...");
    }
    
    // clear all Dams --------------------
    
    // clear out all Dams from array
    public void clearDams() {
        // TODO: implement this method per program spec and pseudocode
        System.out.println("call clearDams()...");
     }
    
    // reporting -------------------------
    
    // print overall Dam usage in array
    public void printDamsUsage(){
        // TODO: implement this method per program spec and pseudocode
        System.out.println("call printDamsUsage()...");
    }
    
    // print 1-line summary of all Dams
    public void printDamsSummary() {
        // TODO: implement this method per program spec and pseudocode
        System.out.println("call printDamsSummary()...");
    }
    
    // print details for one Dam
    public void printDamDetails() {
        // TODO: implement this method per program spec and pseudocode
        System.out.println("call printDamDetails()...");
    }
    
    // print overall system stats (water "health")
    public void printDamsWaterHealth() {
        // TODO: implement this method per program spec and pseudocode
        System.out.println("call printDamesWaterHealth()...");
    }
    
    // manage water ----------------------
    
    // release water from a specific Dam
    public void releaseWater() {
        // TODO: implement this method per program spec and pseudocode
        System.out.println("call releaseWater()...");
    }
    
    // import water to a specific Dam
    public void importWater() {
        // TODO: implement this method per program spec and pseudocode
        System.out.println("call importWater()...");
    }
    
    // more outflow from a specific Dam
    public void increaseOutflow() {
        // TODO: implement this method per program spec and pseudocode
        System.out.println("call increaseOutflow()...");
    }
    
    // less outflow from a specific Dam
    public void reduceOutflow() {
        // TODO: implement this method per program spec and pseudocode
        System.out.println("call reduceOutflow()...");
    }
    
    //---------------------------------------------
    // unit test code
    //---------------------------------------------

    public static void main(String [] args) throws IOException {
    
        DamArrayFL dams = new DamArrayFL(10);
       
        //utility outputs
        System.out.println("getMaxSize():\t\t"     + dams.getMaxSize());
        System.out.println("getUsedSize():\t\t"    + dams.getUsedSize());
        System.out.println("isRoom():\t\t"         + dams.isRoom());
        System.out.println("isValidIndex(0):\t"    + dams.isValidIndex(0));
        System.out.println("promptValidIndex():\t" + dams.promptValidIndex());
        
        // state of dam array
        System.out.println("\n" + dams.toString());
        dams.print("Current Dams in array:"); 
        
        // add dams from file DamData042815.txt
        // if file is invalid, will throw an exception
        dams.addDamFromFile();

        // state of dam array
        System.out.println("\n" + dams.toString());
        dams.print("Current Dams in array:"); 
                
    }

} // end class