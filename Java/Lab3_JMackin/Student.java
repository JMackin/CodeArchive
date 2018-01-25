
/**
 * Students have a name and major
 * 
 * Tim McGowen
 * 9/8/2015
 */
public class Student
{
    private String name;
    private String major;

    /**
     * Constructor for objects of class Student
     */
    public Student(String sname)
    {
        // initialise instance variables
        name = sname;
        major = "undeclared";
    }

    /**
     * setMajor - Set the value of major
     */
    public void setMajor(String smajor)
    {
        major = smajor;
    }
    
    /**
     * getMajor - Get the major for a student
     */
    public String getMajor()
    {
        return major;
    }
    
    /***
     * toString - Return a string with students name and major
     */
    public String toString()
    {
        return name + " has the major of " + major;
    }
}
