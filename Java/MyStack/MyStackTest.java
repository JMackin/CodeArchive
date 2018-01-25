

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MyStackTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MyStackTest
{
    /**
     * Default constructor for test class MyStackTest
     */
    public MyStackTest()
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
    public void testSize(){
        MyStack stack = new MyStack();
        assertEquals(stack.size(),0);
        stack.push("one");
        assertEquals(stack.size(),1);
        stack.push("two");
        int size = stack.size();
        assertEquals(size,2);
    }
     
    @Test
    public void testPush(){
        MyStack stack = new MyStack();
        String data = "one";
        stack.push(data);
        stack.push("two");
        assertEquals(stack.size(),2);
    }
    
    @Test
    public void testPeek(){
        MyStack stack = new MyStack();
        stack.push("one");
        Object elem = stack.peek();
        assertEquals("one",elem);
        stack.push("two");
        assertEquals("two",stack.peek());
    }
    
     @Test
    public void testPop(){
        MyStack stack = new MyStack();
        stack.push("one");
        Object elem = stack.pop();
        assertEquals("one",elem);
        assertEquals(stack.size(),0);
    }
    
     @Test
    public void testClear(){
        MyStack stack = new MyStack();
        stack.push("one");
        stack.push("two");
        stack.clear();
        assertEquals(stack.size(),0);
    }
    
    @Test
    public void testIs_Empty(){
        MyStack stack = new MyStack();
        assertEquals(true, stack.is_empty());
        stack.push("one");
        assertEquals(false, stack.is_empty());
    }
}
