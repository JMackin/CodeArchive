/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Write a description of class A1 here.
 * 
 * Tim McGowen 
 * 8/30/2015
 */
public class A1<X>
{
    private X array256[];
    private int count;

    public A1()
    {
        this.newArray256();
    }

    // Class methods implementing the features discussed follow.
    /***
     * add - add element to array
     */
    public void add(X value)
    {
      if (count == array256.length) // Is array256 full? Then expand
      {
        this.expand();
      }
    
      array256[count] = value;
      count++;
    }
 
    /***
     * print - display contents of the array
     */
    public void print()
    {
      System.out.println("\ncount = " + count + " length = " + array256.length + "\nvalues:");
      for (int i = 0; i < count; i++)
        System.out.println(array256[i]);
    }
    
    /***
     * get - get an element from the array
     */
    public X get(int index)
    {
        if ( index < count )
          return array256[index];
        else
        {
          throw new java.lang.ArrayIndexOutOfBoundsException("Cannot get beyond the end of the array");
        }
    }
    
    /***
     * set - assign an element to the array
     */
    public void set(X value, int index)
    {
        if ( index < count )
          array256[index] = value;
        else
          throw new java.lang.ArrayIndexOutOfBoundsException("Cannot get beyond the end of the array");
    }
    
    /***
     * size - get the number of elements in the array
     */
    public int size()
    {
        return count;
    }
    
    /***
     * clear - remove all elements from the array
     */
    public void clear()
    {
        this.newArray256();
    }
    
    /***
     * insert - insert an element in the middle of the array
     */
    public void insert(X string, int index)
    {
        //Do we have room to insert?
        if ( count == array256.length )
        {
            this.expand();
        }
        
        if ( index < count ) // Inserting element in the middle
        {
            //Shift elemets over
            for ( int i = count; i > index; i-- )
                array256[i] = array256[i-1];
            //Insert item
            array256[index] = string;
            count++; 
        }
        else if ( index == count) //Insert at the end of the array
        {
            array256[index] = string;
            count++; 
        }
        else //Insert beyound the end of the array
            throw new java.lang.ArrayIndexOutOfBoundsException("Cannot get beyond the end of the array");
    }
    
    /***
     * delete - delete an element in the middle of the array
     */
    public void delete(int index)
    {
        if ( index < count )
        {
            if (index == count - 1)
            {
              // deleting the last element in the array
              array256[index] = null;
            }
            else
            {
               // deleting an element that is not the last so we need to move elements down
                for ( int i = index; i < count - 1; i++ )
                  array256[i] = array256[i+1];
                array256[count - 1] = null;
            }
            count--;
        }
        else
        {
            throw new java.lang.ArrayIndexOutOfBoundsException("Cannot get beyond the end of the array");
        }
    }
    
    /***
     * expand - expand array by 20 percent
     */
    private void expand()
    {
        X[] arr2 = (X[]) new Object[(int)(array256.length * 1.2)];
            // Copy elements from array256 to arr
            for (int i = 0; i < array256.length; i++)
              arr2[i] = array256[i];
            // Have array256 point to new array
            array256 = arr2;
            // Old array256 will be cleaned up by garbage collection
    }
    
    /***
     * newArray256 - Create the array and set the count to zero
     */
    private void newArray256()
    {
        array256 = (X[]) new Object[10];
        count = 0;
    }
    
    public String toString()
    {   String outString = "";
        for (int i = 0; i < count; i++){
          outString += i + ":" + array256[i];
          if( i + 1 != count){
            outString += ", ";
          }
        }
        return outString;
    }
}