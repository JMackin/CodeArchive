public class TwoDArray{

  public static void main(String[] args){
   
   int[][] ma = new int[5][10];
   
   System.out.println(ma.length);
   System.out.println(ma[0].length);
   
   
   for(int i =0; i < ma.length;i++){
     for(int j =0; j < ma[i].length; j++){
     
       System.out.print(ma[i][j]);
     }
   System.out.println();
    
  }
  
 }
}