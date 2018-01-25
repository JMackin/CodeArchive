
/**
 * Write a description of class SingleLinkList here.
 * 
 * Your Name
 * 9/20/2015
 */
public class SingleLinkList
{
    // The engine to our train of boxcars
    private Boxcar head;
    private int size;

    /**
     * Constructor for objects of class SingleLinkList
     */
    public SingleLinkList()
    {
        // initialise instance variables
        head = new Boxcar(null);
        size = 0;
    }
    
    /**
     * Display linked list
     */
    public String toString()
    {
        String s = "engine";
        if (head.data() != null)
        {
            Boxcar boxcar = head;
            do{
              s = s + "->" + boxcar.data();
              boxcar = boxcar.next();
            }while (boxcar != null);
        }
        return s;
    }
    
     /**
     * Return size of linked list
     */
    public int size()
    {
        return size;
    }
    
    /**
     * Add boxcar to end
     */
    public void addBoxcarToEnd(Boxcar b)
    {
       Boxcar current = head;
       if(current.data() == null){
         current.setData(b.data());
         size++;
       }
       else{
       while (current.next() != null){
         current = current.next();
       }
       current.setNext(b);
       size++;
       }
    }
    
    /**
     * Add boxcar to front
     */
    public void addBoxcarToFront(Boxcar b)
    {
        Boxcar current = head;
        if(current.data() == null){
          current.setData(b.data());
          size++;
        }
        else{
          head = b;
          b.setNext(current);
          size++;
        }
    }
    
    /**
     * Remove boxcar from front
     */
    public void removeBoxcarFromFront()
    {   if (head.next() == null){
          head.setData(null);
        }
        else{
        Boxcar current = head.next();
        head = current;
        }
        size--;
    }
    
    /**
     * Remove boxcar from end
     */
    public void removeBoxcarFromEnd()
    {
     Boxcar prev = head;
     Boxcar current = head;
     if(current.next() == null){
        head.setData(null);
        size = 0;
     }else{        
        while (current.next() != null) {
         prev = current;
         current = current.next();
        }
        prev.setNext(null);
        size--;
     }
    }
}
