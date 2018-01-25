
/**
 * Write a description of class SingleLinkList here.
 * 
 * Your Name
 * 9/20/2015
 */
public class SingleLinkList<X>
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
    {   int i = 0;
        String s = "";
        if (head.data() != null)
        {
            Boxcar boxcar = head;
            do{
              s += i + ":" + boxcar.data();
              boxcar = boxcar.next();
              if (boxcar != null){
                  s += ", ";
               }
               i++;
   
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
    
    public void add(X data){
      Boxcar b = new Boxcar(data);
      addBoxcarToEnd(b);
    }
    
  public X get(int index){
    Boxcar current = head;
    if (index < 0 || index >= size){
     throw new ArrayIndexOutOfBoundsException("java.lang.ArrayIndexOutOfBoundsException");
    }
    for (int i = 0; i < index; i++){
         current = current.next();    
        }
    X data = (X) current.data();
    return data;
  }
    
  public void set(X data, int index){
    Boxcar current = head;
    if (index < 0 || index > size || size <= 0){
      throw new ArrayIndexOutOfBoundsException("java.lang.ArrayIndexOutOfBoundsException");
    }
    else{
     for (int i = 0; i < index; i++){
         if (current.next() == null){
          throw new ArrayIndexOutOfBoundsException("java.lang.ArrayIndexOutOfBoundsException");
        }
        else{
         current = current.next();
     }
    }
     current.setData(data);
   }
  }
  
  public void delete(int index){
      Boxcar current = head;
      Boxcar next = head;
     if (index > size - 1 || index < 0 ){
       throw new java.lang.ArrayIndexOutOfBoundsException("java.lang.ArrayIndexOutOfBoundsException");
      }else if ( size <= 0){
       throw new java.lang.ArrayIndexOutOfBoundsException("java.lang.ArrayIndexOutOfBoundsException");
      }else{
      for (int i = 0; i < index; i++){
              current = current.next();
      }
      while(current.next() != null){
       next = current.next();
       current.setData(next.data());
       current = current.next();
      }
      size--;
    }
  }
  
  public void insert(X data, int index){
      Boxcar current = head;
      Boxcar prev = head;
      Boxcar next = head;
      Boxcar newcar = new Boxcar(data);
      if (index > size || index < 0){
        throw new java.lang.ArrayIndexOutOfBoundsException("java.lang.ArrayIndexOutOfBoundsException");
        }else{
      {
      if (index == 0){
            head = newcar;
            newcar.setNext(current);
        }else{
      for (int i = 0; i < index; i++){
         prev = current;
         current = current.next();
        }
      prev.setNext(newcar);
      newcar.setNext(current);
      }
      size++;
    }
  }
}
}