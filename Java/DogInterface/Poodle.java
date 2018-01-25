/*
 * A class for a poodle implementing the dog interface
 */
public class Poodle implements Dog
{  
  String nameis;
  
  // Constructor
  public Poodle(String name){
         this.nameis = name;
    }
  
  public String bark(){
    return "Woofy dee woof";
    }
  
  public int getSize(){
    return 15;
    }
 
  public String getColor(){
    return "Pink";    
    }
  
  public String getName(){
    return nameis;
    }
  
  public boolean isTailCurled(){
    return false;
    }
    
    public void is_a()
   {
   Class subclass = this.getClass();
   Class superclass = subclass.getSuperclass();
 
   System.out.println("this is object of type = " + subclass.getName());
   if (Poodle.class.isInterface()) //Replace Xxx with the class name for your dog
   {
   System.out.println(" " + subclass.getName() + " is an interface.");
   }else{
   System.out.println(" " + subclass.getName() + " is a class.");
   }
   while (superclass != null) {
   String className = superclass.getName();
   System.out.println(className);
   subclass = superclass;
   superclass = subclass.getSuperclass();
   }
 }
}
