
/**
 * Write a description of class MyStack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyStack<X>
{
    private A1 array;
    
    public MyStack(){
        array = new A1();
    }
    
    public void push(X data){
      array.add(data);
    }
    
    public X pop(){
      X elem = (X) array.get(array.size()-1);
      array.delete(array.size()-1);
      return elem;
    }
    
    public X peek(){
      return(X) array.get(array.size()-1);
    }
    
    public int size(){
      return array.size();
    }
    
    public void clear(){
      array.clear();
    }
    
    public boolean is_empty(){
        if(array.size() == 0){
            return true;
        }else{
            return false;
        }
    }
}
