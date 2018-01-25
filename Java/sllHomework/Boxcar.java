
/**
 * Write a description of class Node here.
 * 
 * Tim McGowen
 * 9/20/2015
 */
public class Boxcar
{
    // instance variables - replace the example below with your own
    private String data;
    private Boxcar next;

    /**
     * Constructor for objects of class Boxcar
     */
    public Boxcar(String s)
    {
        // initialise instance variables
        data = s;
        next = null;
    }

    /**
     * Set link to next boxcar
     */
    public void setNext(Boxcar n)
    {
        next = n;
    }
    
    /**
     * Get link to next boxcar
     */
    public Boxcar next()
    {
        return next;
    }
    
    /**
     * Set data in boxcar
     */
    public void setData(String s)
    {
        data = s;
    }
    
    /**
     * Get data from boxcar
     */
    public String data()
    {
        return data;
    }
}
