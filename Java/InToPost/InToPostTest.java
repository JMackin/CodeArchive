

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class InToPostTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class InToPostTest
{
    /**
     * Default constructor for test class InToPostTest
     */
    public InToPostTest()
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
        InToPost test = new InToPost();
        assertEquals("1 2 +", test.toPostfix("1 + 2"));
        assertEquals("2 1 -", test.toPostfix("2 - 1"));
    }
    
    @Test
    public void testMultDiv()
    {
        InToPost test = new InToPost();
        assertEquals("2 4 *", test.toPostfix("2 * 4"));
        assertEquals("4 2 /", test.toPostfix("4 / 2"));
    }
    
    @Test
    public void testMultAdd()
    {
        InToPost test = new InToPost();
        assertEquals("A B * C +", test.toPostfix("A * B + C"));
        assertEquals("A B C * +", test.toPostfix("A + B * C"));
        assertEquals("A B C * D / + E 2 * -", test.toPostfix("A + B * C / D - E * 2"));
    }
    
    @Test
    public void testAssociation()
    {
        InToPost test = new InToPost();
        assertEquals("A B - C +", test.toPostfix("A - B + C"));
        assertEquals("A B * C / D * E *", test.toPostfix("A * B / C * D * E"));
    }
}