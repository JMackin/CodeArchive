
/**
 * Write a description of class A1Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class A1Test
{
    /***
       * Tests to validate the A1 class works correctly.
       */
    public void test()
    {
        //Include your tests of the A1 class below.
        
        System.out.println("\nTest 1-create A1");
       A1 a1 = new A1();
       System.out.println("\nTest 2-print empty array");
       a1.print();
       System.out.println("\nTest 3-add element to array");
       a1.add("First Element");
       a1.print();
       System.out.println("\nTest 4-get the first element");
       System.out.println(a1.get(0));
       System.out.println("\nTest 5-set the first element");
       a1.set("New First Element",0);
       a1.print();
       System.out.println("\nTest 6-display size of array");
       System.out.println(a1.size());
       System.out.println("\nTest 7-clear the array");
       a1.clear();
       a1.print();
       System.out.println("\nAdd more tests!!!");
       
       
       a1.add("an element");
       a1.add("another element");
       a1.add("yet another element");
       a1.print();
       
       a1.set("I changed this element @ index 1",1);
       a1.print();
       
       System.out.println("-----------\n");
       System.out.println("Element @ index 3: ");
       a1.add("something is here");
       System.out.println(a1.get(3));
       
       System.out.println("-----------\n");
       
       System.out.println("size of the array:" + a1.size());
       a1.print();
       
       System.out.println("-----------\n");
       
       a1.clear();
       System.out.println("I cleared the array");
       
       a1.print();
       System.out.println("-----------\n");
       System.out.println("inserting element @ index 3:");
       a1.set("New element", 3);
       a1.print();
       a1.add("a");
       a1.add("b");
       a1.add("c");
       a1.print();
       a1.set("d",2);
       a1.print();
       
       a1.set("e",8);
       
       System.out.println("# of non-null elements: " + a1.size());
       
    }

    public static void main(String[] args)
    {
        System.out.println("See README for project details...\n");
        A1Test go = new A1Test();
        go.test();
    }
}
