/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * Write a description of class A1Test here.
 * 
 * Tim McGowen 
 * 8/30/2015
 */
public class A1Test
{
    /***
       * Tests to validate the A1 class works correctly.
       */
    public void test()
    {/*
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
        a1.set("New First Element", 0);
        a1.print();
        System.out.println("\nTest 6-display size of array");
        System.out.println(a1.size());
        System.out.println("\nTest 7-clear the array");
        a1.clear();
        a1.print();
        System.out.println("\nTest 8-Add three items");
        a1.add("First Element");
        a1.add("Second Element");
        a1.add("Third Element");
        a1.print();
        System.out.println("\nTest 9-Insert at the beginning of the array");
        a1.insert("New First Element", 0);
        a1.print();
        System.out.println("\nTest 10-Insert at the end of the array");
        a1.insert("Fifth Element", a1.size());
        a1.print();
        System.out.println("\nTest 11-Insert in the middle of the array");
        a1.insert("New Third Element", 2);
        a1.print();
        System.out.println("\nTest 12-Add four more items to fill the array");
        a1.add("Seventh Element");
        a1.add("Eight Element");
        a1.add("Nineth Element");
        a1.add("Tenth Element");
        a1.print();
        System.out.println("\nTest 13-Add one more item to cause the array to expand");
        a1.add("Eleventh Element");
        a1.print();
        System.out.println("\nTest 14-Add one more item to fill the array");
        a1.add("Twelve Element");
        a1.print();
        System.out.println("\nTest 15-Insert one more item in the middle to cause the array to expand");
        a1.insert("New Eleventh Element", 10);
        a1.print();
        System.out.println("\nTest 16-Add one more item to fill the array");
        a1.add("Fourteenth Element");
        a1.print();
        System.out.println("\nTest 17-Insert one more item at the end to cause the array to expand");
        a1.insert("Fifteenth Element", a1.size());
        a1.print();
        System.out.println("\nTest 18-Insert one more item beyond end to cause an error");
        a1.insert("Mystery Element", a1.size() + 1);
        a1.print();
        System.out.println("\nTest 19-Clear array and add one element");
        a1.clear();
        a1.add("First element");
        a1.print();
        System.out.println("\nTest 20-Delete only element in array");
        a1.delete(0);
        a1.print();
        System.out.println("\nTest 21-Add three elements and delete the middle element in array");
        a1.add("First element");
        a1.add("Second element");
        a1.add("Third element");
        a1.delete(1);
        a1.print();
        System.out.println("\nTest 22-Delete the last element in array");
        a1.delete(1);
        a1.print();
        System.out.println("\nTest 23-Set outside of array bounds");
        a1.set("Test", a1.size());
        System.out.println("\nTest 24-Get outside of array bounds");
        System.out.println("returned value >" + a1.get(a1.size()) + "<");
        System.out.println("\nTest 25-Insert outside of array bounds");
        a1.insert("Test", a1.size() + 1);
        System.out.println("\nTest 26-Delete outside of array bounds");
        a1.delete(a1.size());
        System.out.println("\nTest 27-Delete outside of array bounds when array is empty");
        a1.clear();
        a1.delete(1);
            */
        A1<String> a1 = new A1<String>();
        a1.add("1");
        a1.add("5");
        a1.print();
        
    }

    public static void main(String[] args)
    {
        A1Test go = new A1Test();
        go.test();
    }
}
