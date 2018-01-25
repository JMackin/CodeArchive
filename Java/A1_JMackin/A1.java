
/**
 * Write a description of class A1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class A1
{
   private String array256[];
   private int count;

   public A1()
   {
        array256 = new String[10];
        count = 0;
    }
    
    // Class methods implementing the features discussed follow.
    /***
    * add - add element to array
    */
   public void add(String value)
   {
       if (count == array256.length) // Is array256 full? Then expand by 20%
       {
         String[] arr2 = new String[(int)(array256.length * 1.2)];
           // Copy elements from array256 to arr
         for (int i = 0; i < array256.length; i++)
             arr2[i] = array256[i];
         // Have array256 point to new array
         array256 = arr2;
         // Old array256 will be cleaned up by garbage collection
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
       for (int i = 0; i < count; i++){
          System.out.println(array256[i]);
        }
        
    }
    
   /***
   * get - return a string element given an index
   */
    public String get(int index)
   {
      String indexElement = array256[index];
      return indexElement; 
    }
   
   /***
   * set - insert a given string element at a given index
   */
   public void set(String insert, int index)
   { 
      if (array256[index] == null){
          System.out.println("\nError: Array must be sequential for functionality.");
          System.out.println("You may not set null values\n");
        }
      else{
          array256[index] = insert;
        }
   }
   
   /***
   * clear - sets all array elements to null
   */
   public void clear()
   {
       for (int i = 0; i < array256.length; i++){
           array256[i] = null;
        }
       count = 0;
    }
    
    /***
   * size - returns an integer that is the count of non-null elements in array
   */
   public int size()
   {
       int nonNull = 0;
       for (int i = 0; i < array256.length; i++){
           if (array256[i] != null){
               nonNull++;
            }
       }
       return nonNull;
    }
}
