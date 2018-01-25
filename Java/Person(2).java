/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12, Fall 2014
 *
 * Date:       11/10/14
 *
 * Filename:   Person.java
 *
 * Purpose:    Step-by-step creation of a Person class
 */

import java.text.DecimalFormat;

public class Person {

    // instance variables ------------
    private String firstName;      // person's first name
    private String lastName;       // person's last name
    private SimpleDate birthdate;  // date of birth
    private char gender;           // M or F
    private double height;         // height in [m]
    private double weight;         // weight in [kg]
    
    // constants ---------------------
    private final double TOL = 0.0001;   // equals FP tolerance]
    private final double MIN_HT = 0.0;   // min allowable height
    private final double MAX_HT = 3.0;   // min allowable height
    private final double MIN_WT = 0.0;   // min allowable weight
    private final double MAX_WT = 400.0; // max allowable weight
    
    // other class data --------------
    private DecimalFormat bodyFmt = new DecimalFormat("0.00");
    
    // data above here
    //===============================================
    // methods below here
    
    // constructors ------------------
    
    // default constructor
    public Person() {
        firstName = "unknown";
        lastName = "unknown";
        birthdate = new SimpleDate();
        gender = 'M';
        height = 0.0;
        weight = 0.0;
    }
    
    // full constructor
    public Person(String firstName, String lastName,
                  SimpleDate birthdate, char gender,
                  double height, double weight) {
                  
        // pulls in ALL defaults, must be first statement
        this();
        
        // now set all specified values
        setFirstName(firstName);
        setLastName(lastName);
        setBirthdate(birthdate);
        setGender(gender);
        setHeight(height);
        setWeight(weight);
    }
    
    // alternate constructor: names only
    public Person(String firstName, String lastName) {
    
        // pulls in ALL defaults, must be first statement
        this();
        
        // now overwrite only the ones with changes
        setFirstName(firstName);
        setLastName(lastName);
    }
    
    // display methods ---------------
    
    // string version of object data
    public String toString() {
        return firstName + ", " +
               lastName + ", " +
               birthdate + ", " +
               gender + ", " +
               bodyFmt.format(height) + ", " +
               bodyFmt.format(weight);
    }
    
    // formatted version of object data
    public void print() {
        System.out.println("firstName:\t" + firstName);
        System.out.println("lastName:\t" + lastName);
        System.out.println("birthdate:\t" + birthdate);
        System.out.println("gender:\t\t" + gender);
        System.out.println("height:\t\t" + bodyFmt.format(height));
        System.out.println("weight:\t\t" + bodyFmt.format(weight));
        System.out.println("age:\t\t" + getAge());
        System.out.println("IQ:\t\t" + getIQ());
        System.out.println("BMI:\t\t" + bodyFmt.format(getBMI()));
    }
    
    // overloaded version of print, accepts a label string
    public void print(String message) {
        System.out.println("======================");
        System.out.println(message);
        System.out.println("======================");
        print();
    }
    
    // accessors, mutators -----------
   
    // first name accessor
    public String getFirstName() {
        return firstName;
    }
    
    // first name mutator
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    // overloaded mutator version, prompts for data
    public void setFirstName(boolean inputMode) {
        String data = UtilsRL.readString("Enter first name > ", inputMode);
        setFirstName(data);
    }
    
    // last name accessor
    public String getLastName() {
        return lastName;
    }
    
    // last name mutator
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    // overloaded mutator version, prompts for data
    public void setLastName(boolean inputMode) {
        String data = UtilsRL.readString("Enter last name > ", inputMode);
        setLastName(data);
    }
    
    // birthdate accessor
    public SimpleDate getBirthdate() {
        // don't simply do this: don't return a reference to the internal data
        //return birthdate;
        
        // instead, make a local "scratch" copy and return the reference to that
        SimpleDate temp = new SimpleDate();
        temp.setMonth(this.birthdate.getMonth());
        temp.setDay(this.birthdate.getDay());
        temp.setYear(this.birthdate.getYear());
        return temp;
    }
    
    // birthdate mutator
    public void setBirthdate(SimpleDate birthdate) {
        // don't simply do this: outside changes affect internal data
        //this.birthdate = birthdate;
        
        // instead, transfer data over field by field
        // now internal birthdate is truly isolated from outside
        (this.birthdate).setMonth(birthdate.getMonth());
        (this.birthdate).setDay(birthdate.getDay());
        (this.birthdate).setYear(birthdate.getYear());
    }
    
    // overloaded mutator version, prompts for data
    public void setBirthdate(boolean inputMode) {
        birthdate.setMonth(UtilsRL.readInt("Enter birthdate month > ", inputMode));
        birthdate.setDay(UtilsRL.readInt("Enter birthdate day > ", inputMode));
        birthdate.setYear(UtilsRL.readInt("Enter birthdate year > ", inputMode));
    }
    
    // gender accessor
    public char getGender() {
        return gender;
    }
    
    // gender mutator with data checking
    public void setGender(char gender) {
        // convert inputs to all CAPS exclusively
        char genderUpper = Character.toUpperCase(gender);
        
        if ((genderUpper == 'M') || (genderUpper == 'F')) {
            this.gender = genderUpper;
        }
        else {
            System.out.println("ERROR: unrecognized value for gender, unchanged");
        }
    }

    // overloaded mutator version, prompts for data
    public void setGender(boolean inputMode) {
        char data = UtilsRL.readChar("Enter gender [M/F] > ", inputMode);
        setGender(data);
    }
    
    // height accessor
    public double getHeight() {
        return height;
    }
    
    // height mutator with data checking
    public void setHeight(double height) {
        if ((height >= MIN_HT) && (height <= MAX_HT)) {
            this.height = height;
        }
        else {
            System.out.println("ERROR: invalid height value, unchanged");
        }
    }
    
    // overloaded mutator version, prompts for data
    public void setHeight(boolean inputMode) {
        double data = UtilsRL.readDouble("Enter height [m] > ", inputMode);
        setHeight(data);
    }
    
     // weight accessor
    public double getWeight() {
        return weight;
    }
    
    // weight mutator
    public void setWeight(double weight) {
        if ((weight >= MIN_WT) && (weight <= MAX_WT)) {
            this.weight = weight;
        }
        else {
            System.out.println("ERROR: invalid weight value, unchanged");
        }
    }
    
    // overloaded mutator version, prompts for data
    public void setWeight(boolean inputMode) {
        double data = UtilsRL.readDouble("Enter weight [kg] > ", inputMode);
        setWeight(data);
    }
    
   // equivalance -------------------
    
   // this is the standard interface for equals()
    public boolean equals(Object obj) {
    
        // first, check whether objects of same type
        if (!(obj instanceof Person)) {
            // stop, we aren't comparing apples to apples
            return false;
        }
        
        else {
            // typecast into the intended object types
            Person p = (Person) obj;
            
            // check field-by-field on ALL fields
            if ( (p.getFirstName().equals(this.firstName)) &&
                 (p.getLastName().equals(this.lastName)) &&
                 (p.getBirthdate().equals(this.birthdate)) &&
                 (p.getGender() == this.gender) &&
                 (Math.abs(p.getHeight()-this.height) <= TOL) &&
                 (Math.abs(p.getWeight()-this.weight) <= TOL) ) {
                return true;
            }
            else {
                return false;
            }
        } 
        
    } // end equals
    
    // derived data accessors --------
    
    // compute age
    public int getAge() {
        return UtilsRL.getAge(birthdate);
    }
    
    // compute IQ
    public int getIQ() {
        final int BASE_IQ = 100;
        return BASE_IQ + getAge();
    }
    
    // compute Body Mass Index (BMI)
    public double getBMI() {
        if (height > 0.0) {
            return weight / (height * height);
        }
        else {
            return 0.0;
        }
    }
    
    // utility methods ---------------
    
    // eating food increases the weight (assume 0.1 lb/1000 food cals)
    public void eat(double kcal) {
        if (kcal < 0.0) {
            System.out.println("ERROR: food kcal must be >= 0.0, no change");
        }
        else {
            weight += ((kcal/1000.0) * 0.1);
        }
    }
    
    // exercising decreases the weight (assume 0.1 lb/hr)
    public void exercise(double hrs) {
        if (hrs < 0.0) {
            System.out.println("ERROR: exercise hrs must be >= 0.0, no change");
        }
        else {
            weight -= (hrs * 0.1);
        }
    }
    
    // update the entire object from user prompts
    public void update(boolean inputMode) {
        setFirstName(inputMode);
        setLastName(inputMode);
        setBirthdate(inputMode);
        setGender(inputMode);
        setHeight(inputMode);
        setWeight(inputMode);
    }
    
    // unit test code ----------------
    
    // test driver for this class
    public static void main(String [] args) {
    
        Person p1 = new Person();
        Person p2 = new Person("Fred", "Smith",
                               new SimpleDate(1, 1, 1990), 'M',
                               1.90, 80.0);
        Person p3 = new Person("Joe", "Jones");
        
        System.out.println(p1);  // implicit toString()
        p1.print();
        p1.print("Default constructor Person is:");
        System.out.println();
        
        System.out.println(p2);  // implicit toString()
        p2.print();
        p2.print("Full constructor Person is:");
        System.out.println();
        
        System.out.println(p3);  // implicit toString()
        p3.print();
        p3.print("Alternate constructor Person is:");
        System.out.println();
        
        // test accessor(s)
        System.out.println("p2 firstName = " + p2.getFirstName());
        System.out.println("p2 lastName = "  + p2.getLastName());
        System.out.println("p2 birthdate = " + p2.getBirthdate());
        System.out.println("p2 gender = "    + p2.getGender());
        System.out.println("p2 height = "    + p2.getHeight());
        System.out.println("p2 weight = "    + p2.getWeight());
        System.out.println();
        
        // test mutator(s)
        p2.setFirstName("Dawn");
        p2.setLastName("Davis");
        p2.setBirthdate(new SimpleDate(7, 4, 2000));
        p2.setGender('F');
        p2.setHeight(1.5);
        p2.setWeight(60.0);
        p2.print("p2 after mutators");
        System.out.println();
        
        // test prompted mutators
        p2.setFirstName(false);
        p2.setLastName(false);
        p2.setBirthdate(false);
        p2.setGender(false);
        p2.setHeight(false);
        p2.setWeight(false);
        p2.print("p2 after mutator prompts");
        System.out.println();
        
        // test mutator data checks
        p2.setGender('X');
        p2.setHeight(5.0);
        p2.setWeight(1000.0);
        Person p4 = new Person("John", "Jones", 
                               new SimpleDate(1, 1, 2001), 'X',
                               5.0, 1000.0);
        p4.print("Checking results of bad constructor data");
        System.out.println();
        
        // test equality
        
        // two different objects should differ
        System.out.println("p1 equals p2? " + p1.equals(p2));
        
        // same object is equal to itself
        System.out.println("p2 equals p2? " + p2.equals(p2));
        
        // a Person can't equal another object
        String temp = new String("junk");
        System.out.println("p2 equals temp? " + p2.equals(temp));
        
        // test utility methods
        p2.print("p2 before eating");
        p2.eat(1000);
        p2.print("p2 after eating, needs exercise");
        p2.exercise(2.0);
        p2.print("p2 after exercising");
        
        // new object creation and update
        Person p5 = new Person();
        p5.update(false);
        p5.print("new p5 object");
        
    } // end main
        
} // end class