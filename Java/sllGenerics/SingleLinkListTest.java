import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class XArrayTest modified to test SingleLinkList.
 *
 * @author Barry Brown and Tim McGowen
 * @version 9/25/2015
 */
public class SingleLinkListTest
{ 
 @Test
 public void testCreateArray()
 {
 SingleLinkList b = new SingleLinkList();
 assertEquals(0, b.size());
 }
 
 @Test
 public void testAddToArray()
 {
 SingleLinkList b = new SingleLinkList();
 b.add("Hello");
 assertEquals(1, b.size());
 b.add("Bye");
 assertEquals(2, b.size());
 b.add("Adios");
 assertEquals(3, b.size());
 }
 
 @Test
 public void testAdd12()
 {
 SingleLinkList b = new SingleLinkList();
 b.add("str1");
 b.add("str2");
 b.add("str3");
 b.add("str4");
 b.add("str5");
 b.add("str6");
 b.add("str7");
 b.add("str8");
 b.add("str9");
 b.add("str10");
 b.add("str11");
 b.add("str12");
 assertEquals(12, b.size());
 }
 
 @Test
 public void testAdd100()
 {
 SingleLinkList b = new SingleLinkList();
 
 for (int i = 0; i < 50; i++)
 b.add("str" + i);
 assertEquals(50, b.size());
 
 for (int i = 0; i < 50; i++)
 b.add("morestr" + i);
 
 assertEquals(100, b.size());
 }
 

 @Test
 public void testGet()
 {
 SingleLinkList b = new SingleLinkList();
 b.add("Hello");
 b.add("Bye");
 assertEquals("Hello", b.get(0));
 assertEquals("Bye", b.get(1));
 }
 
 @Test (expected=java.lang.ArrayIndexOutOfBoundsException.class)
 public void testGetException()
 {
 SingleLinkList b = new SingleLinkList();
 b.add("Hello");
 b.get(1);
 // No more code after this, because the exception
 // will cause the method to exit.
 // Don't create more that one exception per test method.
 }
 
 @Test (expected=java.lang.ArrayIndexOutOfBoundsException.class)
 public void testGetNegativeException()
 {
 SingleLinkList b = new SingleLinkList();
 b.get(-1);
 }
 
 @Test
 public void testGet12()
 {
 SingleLinkList b = new SingleLinkList();
 b.add("str1");
 b.add("str2");
 b.add("str3");
 b.add("str4");
 b.add("str5");
 b.add("str6");
 b.add("str7");
 b.add("str8");
 b.add("str9");
 b.add("str10");
 b.add("str11");
 b.add("str12");
 assertEquals("str8", b.get(7));
 assertEquals("str12", b.get(11));
 assertEquals("str1", b.get(0));
}
 

 
 @Test
 public void testSet()
 {
 SingleLinkList b = new SingleLinkList();
 b.add("Hello");
 b.add("Bye");
 b.set("Bonjour", 0);
 assertEquals("Bonjour", b.get(0));
 assertEquals("Bye", b.get(1));
 b.set("Adios", 1);
 assertEquals("Bonjour", b.get(0));
 assertEquals("Adios", b.get(1));
 }
 
 @Test (expected=java.lang.ArrayIndexOutOfBoundsException.class)
 public void testSetException()
 {
 SingleLinkList b = new SingleLinkList();
 b.add("Hello");
 b.set("Bye", 1);
 // No more code after this, because the exception
 // will cause the method to exit.
 // Don't create more that one exception per test method.
 }
 
 @Test (expected=java.lang.ArrayIndexOutOfBoundsException.class)
 public void testSetEmptyException()
 {
 SingleLinkList b = new SingleLinkList();
 b.set("Hello", 0);
 }

 @Test (expected=java.lang.ArrayIndexOutOfBoundsException.class)
 public void testSetNegativeException()
 {
 SingleLinkList b = new SingleLinkList();
 b.set("Hello", -1);
 }

 @Test (expected=java.lang.ArrayIndexOutOfBoundsException.class)
 public void testSetFullException()
 {
 SingleLinkList b = new SingleLinkList();
 b.add("Hello");
 b.add("Bye");
 b.set("Bonjour", 2);
 }

 
 @Test
 public void testToString()
 {
 SingleLinkList b = new SingleLinkList();
 assertEquals("", b.toString());
 b.add("hello");
 assertEquals("0:hello", b.toString());
 b.add("bye");
 assertEquals("0:hello, 1:bye", b.toString());
 b.add("adios");
 assertEquals("0:hello, 1:bye, 2:adios", b.toString());
 }
 
 @Test
 public void testDelete()
 {
 SingleLinkList b = new SingleLinkList();
 b.add("hello");
 b.add("hola");
 b.delete(0);
 assertEquals(1, b.size());
 b.delete(0);
 assertEquals(0, b.size());
 }
 
 @Test
 public void testDelete10()
 {
 SingleLinkList b = new SingleLinkList();
 for (int i = 0; i < 10; i++)
 b.add("str" + i);
 assertEquals(10, b.size());
 b.delete(0);
 assertEquals(9, b.size());
 b.delete(0);
 b.delete(0);
 b.delete(0);
 b.delete(0);
 b.delete(0);
 b.delete(0);
 b.delete(0);
 b.delete(0);
 b.delete(0);
 assertEquals(0, b.size());
 }
 
 @Test (expected=java.lang.ArrayIndexOutOfBoundsException.class)
 public void testDeleteException()
 {
 SingleLinkList b = new SingleLinkList();
 b.add("hello");
 b.delete(0);
 b.delete(0);
 }
 
 
 @Test
 public void testInsert()
 {
 SingleLinkList b = new SingleLinkList();
 b.add("hello");
 b.add("bye");
 b.insert("adios", 1);
 assertEquals("hello", b.get(0));
 assertEquals("adios", b.get(1));
 assertEquals("bye", b.get(2));
 assertEquals(3, b.size());
 
 b.insert("buenos dias",1);
 assertEquals(4, b.size());
 assertEquals("hello", b.get(0));
 assertEquals("buenos dias", b.get(1));
 assertEquals("adios", b.get(2));
 
 b.insert("hi", 0);
 assertEquals(5, b.size());
 assertEquals("hi", b.get(0));
 assertEquals("hello", b.get(1));
 
 b.insert("see ya", 4);
 assertEquals(6, b.size());
 assertEquals("see ya", b.get(4));
 assertEquals("bye", b.get(5));
 
 }
 
 @Test
 public void testInsert11()
 {
 SingleLinkList b = new SingleLinkList();
 b.add("one");
 b.insert("two", 0);
 b.insert("three", 0);
 b.insert("four", 0);
 b.insert("five", 0);
 b.insert("six", 0);
 b.insert("seven", 0);
 b.insert("eight", 0);
 b.insert("nine", 0);
 b.insert("ten", 0);
 b.insert("eleven", 0);
 assertEquals(11, b.size());
 assertEquals("eleven", b.get(0));
 assertEquals("ten", b.get(1));
 assertEquals("two", b.get(9));
 assertEquals("one", b.get(10));
 }
 
 @Test
 public void testInsertAt0()
 {
 SingleLinkList b = new SingleLinkList();
 b.insert("one", 0);
 b.insert("two", 0);
 b.insert("three", 0);
 assertEquals(3, b.size());
 assertEquals("three", b.get(0));
 assertEquals("two", b.get(1));
 assertEquals("one", b.get(2));
 }
 
 @Test
 public void testInsertAtEnd()
 {
 SingleLinkList b = new SingleLinkList();
 b.add("hello");
 b.insert("bye", 1);
 }
 
 @Test (expected=java.lang.ArrayIndexOutOfBoundsException.class)
 public void testInsertException()
 {
 SingleLinkList b = new SingleLinkList();
 b.add("hello");
 b.insert("bye", 2);
 }
 
 @Test (expected=java.lang.ArrayIndexOutOfBoundsException.class)
 public void testInsertNegative()
 {
 SingleLinkList b = new SingleLinkList();
 b.insert("hello", -1);
 }
 
 
 @Test
 public void testDelete1()
 {
 SingleLinkList b = new SingleLinkList();
 b.add("hello");
 b.delete(0);
 assertEquals(0, b.size());
 }
 
 @Test
 public void testDeleteSeveral()
 {
 SingleLinkList b = new SingleLinkList();
 b.add("hello");
 b.add("bye");
 b.add("adios");
 b.add("ciao");
 b.add("see ya");
 b.delete(0);
 assertEquals(4, b.size());
 assertEquals("bye", b.get(0));
 assertEquals("adios", b.get(1));
 assertEquals("ciao", b.get(2));
 assertEquals("see ya", b.get(3));
 
 b.delete(3);
 assertEquals(3, b.size());
 assertEquals("bye", b.get(0));
 assertEquals("adios", b.get(1));
 assertEquals("ciao", b.get(2));
 
 b.delete(0);
 b.delete(0);
 b.delete(0);
 assertEquals(0, b.size());
 }
 
 @Test (expected=java.lang.ArrayIndexOutOfBoundsException.class)
 public void testDeleteException2()
 {
 SingleLinkList b = new SingleLinkList();
 b.add("hello");
 b.delete(1);
 }
 
 @Test (expected=java.lang.ArrayIndexOutOfBoundsException.class)
 public void testDeleteNegative()
 {
 SingleLinkList b = new SingleLinkList();
 b.delete(-1);
 }
 
 @Test (expected=java.lang.ArrayIndexOutOfBoundsException.class)
 public void testDeleteEmpty()
 {
 SingleLinkList b = new SingleLinkList();
 b.add("hello");
 b.delete(0);
 b.delete(0);
 }
 
 @Test
 public void testJFrame()
 {
 SingleLinkList b = new SingleLinkList();
 javax.swing.JFrame j1 = new javax.swing.JFrame();
 javax.swing.JFrame j2 = new javax.swing.JFrame();
 b.add(j2);
 b.add(j1);
 assertEquals(j2, b.get(0));
 assertEquals(j1, b.get(1));
 }
 
}