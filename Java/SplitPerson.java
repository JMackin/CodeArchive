/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       11/25/14
 *
 * Filename:   SplitPerson.java
 *
 * Purpose:    Demonstrate usage of String class split()
 *             to assemble a new object
 */
 
public class SplitPerson {

    public static void main(String[] args) {
    
        // original line of text (user input? file read input?)
        String input = "Doe, John, 7/4/1976, M, 1.90, 80.0";
        
        Person p = createPerson(input);
        p.print("Person created from parsed input line");
        
    } // end main
    
    // operations to turn an input string into a Person object
    public static Person createPerson(String input) {
    
        // declarations for the eventual data
        String first, last;
        SimpleDate bd;
        char gender;
        double ht, wt;
        
        // split the original line
        String [] tokens1 = input.split(",");
        for (int i=0; i < tokens1.length; i++) {
            // clean up any leading/trailing whitespace
            tokens1[i] = tokens1[i].trim();
        }
        
        // do a secondary split on the date token
        String [] tokens2 = tokens1[2].split("/");
        for (int i=0; i < tokens2.length; i++) {
            // clean up any leading/trailing whitespace
            tokens2[i] = tokens2[i].trim();
        }
        
        // extract scalar values and assemble object
        first = tokens1[1];
        last = tokens1[0];
        gender = tokens1[3].charAt(0);
        ht = Double.parseDouble(tokens1[4]);
        wt = Double.parseDouble(tokens1[5]);
        
        bd = new SimpleDate(Integer.parseInt(tokens2[0]),
                            Integer.parseInt(tokens2[1]),
                            Integer.parseInt(tokens2[2]));
                            
        // use all data to create a new Person object
        return new Person(first, last, bd, gender, ht, wt);
    }
    
} // end class