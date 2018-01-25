/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       11/28/13
 *
 * Filename:   Array1DIntsClass.java
 *
 * Purpose:    Demonstrates creating a class 
 *             based upon am array of ints
 */
 
public class Array1DIntsClass {

    //---------------------------------------------
    // instance variables
    //---------------------------------------------
    
    // the primary data for this class is an ARRAY
    private int [] data;   // declaration only
    
    // this tells us how many are used, AND index of *next* one
    private int count;
            
    // constants
    private final int DEF_SIZE = 10;    // default size
    private final char DEF_SEP = '-';   // default separator char
    private final int DEF_OHANG = 10;   // default message overhang
    private final int MIN_RANDOM = 100; // min random number for array
    private final int MAX_RANDOM = 200; // max random number for array
    
    // error messages
    private final String ERROR_FULL  = "ERROR: no room to add to array";
    private final String ERROR_EMPTY = "ERROR: empty array, nothing to modify";
    private final String ERROR_INDEX = "ERROR: invalid index: ";
    private final String ERROR_VALUE = "ERROR: 0 returned for out-of-bounds index: ";
    
    //---------------------------------------------
    // constructors
    //---------------------------------------------
    
    // default constructor, fixed size, default values
    public Array1DIntsClass() {
    
        // declare and initialize to default size, gets default values
        data = new int [DEF_SIZE];
        count = 0;
    }
    
    // constructor, user-specified size, default values
    public Array1DIntsClass(int size) {
    
        // declare and initialize to specified size, gets default values
        data = new int [size];
        count = 0;
    }
    
    // constructor which initializes using provided array
    public Array1DIntsClass(int [] data) {
    
        // initialize to size of provided data
        this.data = new int [data.length];
        count = data.length;
        
        // transfer over all input data, int by int
        for (int i=0; i < data.length; i++) {
            this.data[i] = data[i];
        }
    }
    
    //---------------------------------------------
    // derived data accessors and utilities
    //---------------------------------------------
    
    // what is the maximum size?
    public int getMaxSize() {
        return data.length;
    }
    
    // what is the current size?
    public int getUsedSize() {
        return count;
    }
    
    // is there room to add more?
    public boolean isRoom() {
        if (getUsedSize() < getMaxSize()) {
            return true;
        }
        else {
            return false;
        }
    }
    
    // does a given index contain valid data?
    public boolean isValidIndex(int index) {
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
    public int promptValidIndex() {
        int index;
        
        if (getUsedSize() == 0) {
            index = -1;  // gotta return SOMETHING
        }
        
        else {
            // prompt user for element index
            System.out.println("Which element?");
            
            // print some sort of menu
            for (int i=0; i<getUsedSize() ; i++) {
                System.out.println("[" + i + "]: " + getData(i));
            }
            
            index = UtilsRL.readInt("Enter array index > ", false);
            while (!isValidIndex(index)) {
                index = UtilsRL.readInt("Enter array index > ", false);
            }
            return index;
        }
        return index;
    }
    
    //---------------------------------------------
    // display methods
    //---------------------------------------------
    
    // prints the entire array as comma-separated data
    public String toString() {
    
        // the initial empty string keeps compiler happy
        String temp = "" + data[0];
        
        // append all other data, comma-separated
        for (int i=1; i<data.length; i++) {
            temp += (", " + data[i]);
        }
        return temp;
    }
    
    // prints the entire array in a more labeled way
    public void print() {
    
        System.out.println("max size:\t" + getMaxSize());
        System.out.println("used size:\t" + getUsedSize());
        System.out.println("room to add:\t" + isRoom());
        
        // labeled data
        for (int i=0; i<data.length; i++) {
            System.out.println("data[" + i + "] =\t" + data[i]);
        }
    }
    
    // overloaded print, with a text label
    public void print(String message) {
        separator(DEF_SEP, message.length() + DEF_OHANG);
        System.out.println(message);
        separator(DEF_SEP, message.length() + DEF_OHANG);
        print();
    }
    
    // PRIVATE display utility to print a separator line
    private void separator(char sep, int num) {
        for (int i=0; i<num; i++) {
            System.out.print(sep);
        }
        System.out.println();
    }
    
    //---------------------------------------------
    // mutators
    //---------------------------------------------
    
    // mutator for one element
    // assume new elements are added to first open space
    public void setData(int value) {
    
        if (isRoom()) {
            data[count] = value;
            count++;
        }
        else {
            System.out.println(ERROR_FULL);
        }
        
    }
    
    // mutator for entire array
    public void setData(int [] values) {
    
        // resize the array
        data = new int [values.length];
        count = data.length;
        
        // copy over all data
        for (int i=0; i<data.length; i++) {
            data[i] = values[i];
        }
    }
    
    //---------------------------------------------
    // accessors
    //---------------------------------------------
    
    // accessor for one element
    public int getData(int index) {
    
        // check for valid index first
        if (isValidIndex(index)) {
            return data[index];
        }
        else {
            // no action taken, but we gotta return something
            System.out.println(ERROR_INDEX + index);
            return 0;
        }
    }
    
    // accessor for entire array
    public int [] getData() {
    
        // set up a bogus return array
        int [] temp = new int [data.length];
        
        // transfer over data and return bogus copy
        for (int i=0; i<data.length; i++) {
            temp[i] = data[i];
        }
        return temp;
    }
    
    //---------------------------------------------
    // equality
    //---------------------------------------------
    
    // equals check
    public boolean equals(Object obj) {
        boolean result = true;
        
        if (obj instanceof Array1DIntsClass) {
            // apples and apples, keep checking
            Array1DIntsClass a = (Array1DIntsClass) obj;
            
            // checks sizes next
            if (this.data.length == a.getMaxSize()) {
            
                // finally, check element by element
                for (int i=0; i<this.data.length; i++) {
                
                    // if ANY one element is not identical, not equal
                    if (this.data[i] != a.getData(i)) {
                        result = false;
                    }
                }
            }
            else {
                result = false;
            }
        }
        else {
            // apples and bananas
            result = false;
        }
        
        return result;
    }
    
    //---------------------------------------------
    // utility methods: "do something" to one specific element
    // note these next methods are all "self-contained"
    // they take action w/o any input or return values
    //---------------------------------------------
    
    // add element from the command line
    public void setDataFromUser() {
        int value = UtilsRL.readInt("Enter new int data > ", false);
        // next method checks for space
        setData(value);
    }
    
    // add element using a random element
    public void setDataRandom() {
        int value = UtilsRL.randomInt(MIN_RANDOM, MAX_RANDOM);
        // next method checks for space
        setData(value);
    }
    
    // add elements from a file
    public void setDataFromFile() {
        // STUDENT TO ADD IN LAST PROGRAM... SEE PRIOR LECTURE EXAMPLE
        // open file connection
        // read all lines in as Strings
        // parse Strings into scalars
        // next method checks for space
        //setData(value);
    }
    
    // update one specific element of the array
    public void updateElement() {
    
        int index, value;
        
        // determine which element to update
        index = promptValidIndex();
        
        if (index != -1) {
            // prompt for update value
            value = UtilsRL.readInt("Updated value? > ", false);
        
            // perform the array element update
            data[index] = value;
        }
        else {
            System.out.println(ERROR_EMPTY);
        }
    }
    
    // increment one specific element of the array
    public void incrementElement() {
    
        int index, value;
        
        // determine which element to update
        index = promptValidIndex();
        
        if (index != -1) {
            // prompt for update value
            value = UtilsRL.readInt("Increment value? > ", false);
        
            // perform the array element update
            data[index] += value;
        }
        else {
            System.out.println(ERROR_EMPTY);
        }
    }
    
    //---------------------------------------------
    // unit test code
    //---------------------------------------------
    
    // standalone test code for this class
    public static void main(String [] args) {
    
        // throwaway variables
        int tempInt;
        int index;
        int [] tempArray1 = {10, 20, 30, 40, 50};
        int [] tempArray2 = {100, 200};
        
        // test all constructor forms
        Array1DIntsClass a1 = new Array1DIntsClass();
        Array1DIntsClass a2 = new Array1DIntsClass(2);
        Array1DIntsClass a3 = new Array1DIntsClass(tempArray1);
        
        // test size and index utilities
        System.out.println("a1.getMaxSize(): " + a1.getMaxSize());
        System.out.println("a1.getUsedSize(): " + a1.getUsedSize());
        System.out.println("a1.isRoom(): " + a1.isRoom());
        
        // a1 has no data yet
        System.out.println("a1.isValidIndex(2): " + a1.isValidIndex(2)); 
        index = a1.promptValidIndex();  
        System.out.println("for a1 you got: " + index); 
        
        // a3 has data
        System.out.println("a3.isValidIndex(2): " + a3.isValidIndex(2)); 
        index = a3.promptValidIndex();  
        System.out.println("for a1 you entered: " + index); 
        
        // test toString
        System.out.println("test toString()...");
        System.out.println("a1:\t" + a1);
        System.out.println("a2:\t" + a2);
        System.out.println("a3:\t" + a3);
        System.out.println();
        
        // test print AND overloaded print
        // also tests utility accessors
        System.out.println("test print() and utility accessors...");
        a1.print("a1");
        a2.print("a2");
        a3.print("a3");
        System.out.println();
        
        // test mutators
        System.out.println("test nominal mutators...");       
        a2.setData(10);
        a2.print("a2 added data to open space:");
        a3.setData(tempArray2);
        a3.print("a3 after mutating with array:");
        System.out.println();
        
        // test mutators with invalid index
        System.out.println("test mutators with bad indices...");
        a2.setData(99);
        a2.print("a2 is now:");
        a2.setData(99);
        System.out.println();
        
        // test accessors
        System.out.println("test nominal accessors...");
        System.out.println("a2[1] = " + a2.getData(1));
        System.out.println();
        
        // test accessors with invalid index
        System.out.println("test accessors with bad indices...");
        System.out.println("a2[2] = " + a2.getData(2));
        System.out.println();
        
        // test equality
        System.out.println("test equals()...");
        System.out.println("a2 equals a1?\t" + a2.equals(a1));
        System.out.println("a2 equals a2?\t" + a2.equals(a2));
        System.out.println();
        
        // test self-contained utility methods
        a2.print("a2 is now:");
        System.out.println();
        a2.updateElement();
        System.out.println();
        
        a2.print("a2 is now:");
        System.out.println();
        a2.incrementElement();
        System.out.println();
    
        a2.print("a2 is now:");
        
    } // end main

} // end class