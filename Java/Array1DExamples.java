/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       11/20/14
 *
 * Filename:   Array1DExamples.java
 *
 * Purpose:    Examples of all aspects of 1-D array,
 *             provides examples for lecture slides.
 */
 
import java.text.DecimalFormat;
import java.util.Random;

public class Array1DExamples {

    public static void main(String [] args) {
    
        final int SIZE = 5;   // let this be the default size
        int num1 = 10;
        int num2 = 20;
                
        // declaring arrays (only)
        int [] testScores;
        double [] dailyTemps;
        int [] ages, itemCounts;   // multiple on one line
        
        // instantiating arrays
        testScores = new int [SIZE];
        dailyTemps = new double [10]; 
        ages = new int [num1];  // perhaps from a method arg?
        itemCounts = new int [num2*10]; 
        
        // declaring + instantiating arrays
        int [] someData = new int [SIZE];  
        double [] measData = new double [SIZE]; 
        
        // initializing an array: for loop
        for (int i=0; i<SIZE; i++) {
            testScores[i] = 50;
        } 
        
        // initializing an array: individual values
        // writing to individual elements by index
        someData[0] = 12;  
        someData[1] = 52;
        someData[2] = 27;
        someData[3] = 31;
        someData[4] = 8;  
        
        // initializing an array: initialization list
        double [] newData = {12.0, 56.4, 72.1, -13.0 , 28.4};  
        
        // reading from first/last elements
        System.out.println("first element: " + newData[0]);
        System.out.println(" last element: " + newData[newData.length-1]);
        System.out.println();
        
        // writing to array elements
        newData[0] = 14.0;
        newData[1] += 20.0;
        newData[2] = 0.0;
        newData[3] = newData[2];              // read/write in one statement
        newData[4] = Math.sqrt(Math.PI);      // method assignment
        
        // reinitialize array to have ascending values 10-50
        for (int i=0; i < someData.length; i++) {
            someData[i] = (i+1) * 10;
        }
        
        // printing the elements of an array
        for (int i=0; i < someData.length; i++) {
            System.out.println("someData[" + i + "] = " + someData[i]);
        }
        System.out.println();
        
        // common array operations -----------------------------
        
        //int [] arrayName = new int[5];
        double [] arrayName = new double[5];
        System.out.println();
        
        // printing all elements on separate lines
        for (int i=0; i < arrayName.length; i++) {
            System.out.println(arrayName[i]);
        }
        System.out.println();    // visual spacer

        // printing all elements on the same line
        for (int i=0; i < arrayName.length; i++) {
            System.out.print(arrayName[i] + " ");
        }
        System.out.println();    // move to next line
        System.out.println();
            
        // initializing an array to constant values
        for (int i=0; i < arrayName.length; i++) {
            arrayName[i] = 100.0;
            System.out.println(i + ":\t" + arrayName[i]);
        }      
        System.out.println();
        
        // initializing an array to calculated values
        for (int i=0; i < arrayName.length; i++) {
            arrayName[i] = 10.0 + (i * 0.2);
            System.out.println(i + ":\t" + arrayName[i]);
        } 
        System.out.println();
        
        // in case we want to bypass the cmd line data read
        /*
        arrayName[0] = 34.5;
        arrayName[1] = 56.7;
        arrayName[2] = 29.3;
        arrayName[3] = 42.1;
        arrayName[4] = 56.8;
        */
        
        // reading data into an array from command line
        for (int i=0; i < arrayName.length; i++) {
            arrayName[i] = UtilsRL.readDouble("data value? > ", false);
            System.out.println(i + ":\t" + arrayName[i]);
        }
        System.out.println();
        
        // summing an array
        double sum = 0.0;     // this must be OUTSIDE the loop
                              // must be same datatype as array
                              
        for (int i=0; i < arrayName.length; i++) {
            sum += arrayName[i];
        }
        
        // formatting applied here only to truncate numerics
        // may not be required in other situations
        DecimalFormat sumFormat = new DecimalFormat("#####.0");
        System.out.println("The array total is: " + 
                           sum + "\t" + sumFormat.format(sum));
        System.out.println();
            
        // averaging an array
        // identical to summing, except divide by # of elements
        double total = 0.0;   // this must be OUTSIDE the loop
                              // must be same datatype as array
                              
        for (int i=0; i < arrayName.length; i++) {
            total += arrayName[i];
        }
        double avg = total/arrayName.length;
        
        // formatting applied here only to truncate numerics
        // may not be required in other situations
        DecimalFormat avgFormat = new DecimalFormat("#####.0");
        System.out.println("The array total is: " + 
                           avg + "\t" + avgFormat.format(avg));
        System.out.println();
        
        // finding the min/max values and indices of an array
        // assume that element [0] is current min/max, so start at [1]
        int minIndex = 0;
        int maxIndex = 0;
        
        for (int i=1; i < arrayName.length; i++) {
            if (arrayName[i] < arrayName[minIndex]) {
                minIndex = i;
            }
            if (arrayName[i] > arrayName[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println("minimum: arrayName[" + minIndex +
                           "] = " + arrayName[minIndex] );
        System.out.println("maximum: arrayName[" + maxIndex +
                           "] = " + arrayName[maxIndex] );
        System.out.println();
        
        // end 1st array lecture
        //--------------------------------------------------
        // begin 2nd array lecture
        
        // copying an array
        // incorrect way: simply copy array references
        // (both array refs point to the SAME data,
        //  and auto-initialized new array get "orphaned")
        double [] arrayCopy1 = new double [arrayName.length];
        arrayCopy1 = arrayName;
        
        // copying an array
        // correct way: transfer data element by element
        // (results in two distinct sets of identical data)
        double [] arrayCopy2 = new double [arrayName.length];
        for (int i=0; i < arrayCopy2.length; i++) {
            arrayCopy2[i] = arrayName[i];
        }
        
        // resizing an array
        // 1) create a new (presumably larger) temp array
        // 2) transfer all elements, original[i] --> temp[i]
        // 3) swap array references
        // 4) eliminate old temp array reference
        
        // resize the new array to something larger
        int oldSize = arrayName.length;
        int newSize = 4 * oldSize;
        
        // declare and instantiate the new array
        double [] temp = new double [newSize];
        
        // copy all the old elements to their new array
        for (int i=0; i < oldSize; i++) {
            temp[i] = arrayName[i];
        }
        
        // swap array references, and eliminate the temp one
        arrayName = temp;
        temp = null; 
        
        // set up a second array for the next example
        double [] arrayName2 = new double [arrayName.length];
        for (int i=0; i < arrayName2.length; i++) {
            arrayName2[i] = arrayName[i];
        }
        //arrayName2[0]++;  // if we want the arrays to differ
        
        // equality of arrays
        // 1) check array sizes first
        // 2) if sizes are equal, check element by element
        //    a) for integer types, check using ==
        //    b) for floating point types, check using tolerance
        //    c) for objects, check using object's equals() method
        
        boolean isEqual = true;   // assume equality until a check fails
        
        if (arrayName.length != arrayName2.length) {
            isEqual = false;   // size differ, check no further
        }
        else {
            for (int i=0; (i < arrayName.length) && isEqual; i++) {
                // double arrays: use tolerance
                // we are looking for any one failure
                if (Math.abs(arrayName[i] - arrayName2[i]) > 0.001) {
                    isEqual = false;
                }
            } // end for
        } // end else-if
        System.out.println("arrayName equal to arrayName2? " + isEqual);
        System.out.println();
        
        // arrays as counters: version 1
        int dieMax = 6;
        int numRolls = 500;
        itemCounts = new int[dieMax];   // 6 possible outcomes from one die
        Random rand = new Random();
        int roll;
        
        // explicitly initialize each count to 0 (same as default)
        for (int i=0; i < dieMax; i++) {
            itemCounts[i] = 0;
        }
        
        // roll the die and increment its histogram count
        for (int i=0; i < numRolls; i++) {
            roll = rand.nextInt(dieMax) + 1;   // random number 1-6
            itemCounts[roll - 1]++;
        }
        
        // display the resulting histogram
        for (int i=0; i < dieMax; i++) {
            System.out.println((i+1) + ":\t" + itemCounts[i] + " times");
        }
        System.out.println();
        
        // arrays as counters: version 2
        itemCounts = new int[dieMax + 1];  // 6 possible outcomes from one die, plus 0
        
        // explicitly initialize each count to 0 (same as default)
        for (int i=0; i <= dieMax; i++) {
            itemCounts[i] = 0;
        }
        
        // roll the die and increment its histogram count
        for (int i=0; i < numRolls; i++) {
            roll = rand.nextInt(dieMax) + 1;   // random number 1-6
            itemCounts[roll]++;
        }
        
        // display the resulting histogram
        for (int i=1; i <= dieMax; i++) {
            System.out.println(i + ":\t" + itemCounts[i] + " times");
        }
        System.out.println();
        
        // object arrays ---------------------------------------
        
        // declare and instantiate object array
        SimpleDate [] dates = new SimpleDate [5];
        
        // initialize the object array
        for (int i=0; i < dates.length; i++) {
            dates[i] = new SimpleDate(12, 25, 2014);
        }
        
        // tweak the object array elements with dot notation
        dates[1].setDate(7, 4, 1776);
        dates[2].setMonth(5);
        dates[3].nextDay();
        dates[4] = dates[2];
        SimpleDate independenceDay = dates[1];
        
        // print the entire object array
        for (int i=0; i < dates.length; i++) {
            System.out.println(i + ":\t" + dates[i].toString());
        }
        System.out.println();
        
        // set up an object array of Strings
        String [] strs = new String [50];
        int count = 0;   // doubles as next available element
        
        // populate part of the object array,
        // increment as we go
        strs[count] = "Marley";
        count++;
        strs[count] = "was";
        count++;
        strs[count] = "dead";
        count++;
        
        // how much is being used?
        //for (int i=0; i < strs.length; i++) {   // don't do this!
        for (int i=0; i < count; i++) {           // do this instead
            System.out.println(i + ": " + strs[i].toString());
        }
        System.out.println("using " + count + 
                           " of " + strs.length + " words");
        
    } // end main

} // end class