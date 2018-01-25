

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class A1Test.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class A1Test
{
    /**
     * Default constructor for test class A1Test
     */
    public A1Test()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void isZero()
    {
        A1 test = new A1();
        assertEquals(test.size(), 0);
    }
    
    @Test
    public void addOne()
    {
        A1 test = new A1();
        test.add("Here I go!");
        assertEquals(test.size(), 1);
    }
    @Test
    public void getElem()
    {
        A1 test = new A1();
        test.add("I'm a String!");
        assertEquals(test.get(0),"I'm a String!");
    }
    @Test
    public void setElem()
    {
        A1 test = new A1();
        test.add("Hello Worl!");
        test.set("Here I am!",0);
        assertEquals(test.get(0),"Here I am!");
    }
    @Test
    public void isClear()
    {
        A1 test = new A1();
        test.add("I am me!");
        test.clear();
        assertEquals(test.size(),0);
    }
    @Test
    public void elevenElems()
    {
        A1 test = new A1();
        for (int i = 0; i < 11; i++){
            test.add("This");
        }
        
        assertEquals(test.size(), 11);
    }
}

