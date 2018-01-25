

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class InfixToPostfixTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class InfixToPostfixTest
{
    /**
     * Default constructor for test class InfixToPostfixTest
     */
    public InfixToPostfixTest()
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
    public void testAddSub()
    {
        InfixToPostfix test = new InfixToPostfix();
        assertEquals("12+", test.toPostfix("1+2"));
        assertEquals("21-", test.toPostfix("2-1"));
    }
    
    @Test
    public void testMultDiv()
    {
        InfixToPostfix test = new InfixToPostfix();
        assertEquals("24*", test.toPostfix("2*4"));
        assertEquals("42/", test.toPostfix("4/2"));
    }
    
    @Test
    public void testMultAdd()
    {
        InfixToPostfix test = new InfixToPostfix();
        assertEquals("AB*C+", test.toPostfix("A*B+C"));
        assertEquals("ABC*+", test.toPostfix("A+B*C"));
        assertEquals("ABC*D/+E2*-", test.toPostfix("A+B*C/D-E*2"));
    }
    
    @Test
    public void testAssociation()
    {
        InfixToPostfix test = new InfixToPostfix();
        assertEquals("AB-C+", test.toPostfix("A-B+C"));
        assertEquals("AB*C/D*E*", test.toPostfix("A*B/C*D*E"));
    }
}
