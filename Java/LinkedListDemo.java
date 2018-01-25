import java.util.ArrayList;

public class LinkedListDemo{

  public static void main(String args[]){
  ArrayList al = new ArrayList();
   al.add(12);
   al.add(15);
   al.add(17);
   al.toArray();
   Object ia[] = al.toArray();
   
   for (int i = 0; i < ia.length; i++) { System.out.print(ia[i] + " ");}
   
   Object ia[] = al.toArray();
  int sum = 0;
  // sum the array
  for(int i=0; i<ia.length; i++)
  sum += ((Integer) ia[i]).intValue();
  System.out.println("Sum is: " + sum);
}
} 



