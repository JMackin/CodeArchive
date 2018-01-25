import java.io.*;
import java.util.*;

public class SimpleStatsWFiles{

  public static void main(String[] args){
    try{
    String inputFile ="";
    String outPutFile ="";    
    inputFile = args[0];
    outPutFile = args[1];
    double factor = 5;
    
    double[] list = getInput(inputFile);    
    double[] results = scaleUp(list, factor);
    
    writeOutPut(outPutFile,results);
   
    for (int i = 0; i < results.length; i++){ System.out.print(results[i] + " "); }
    System.out.println("");
    }
    catch(ArrayIndexOutOfBoundsException e) {
             System.out.println("Please provide input & output filepath parameters...\n"
                               +"---------------------------------\n"
                               +"Java SimpleStatsWFiles [input path] [output path]");
    }
    catch(NoSuchElementException e) {
      System.out.println("Error: non-number character in input file:\n" 
                        +"Please check for whitespace and other incompatible input");
    }
    } //end main
    
   public static double[] scaleUp(double[] nums, double factor){
      double[] numsScaled = new double[nums.length];
    
      for (int i = 0; i < nums.length; i++){
      numsScaled[i] = (nums[i] * factor);  
    }
    return numsScaled;
    }//end scaleUp

    public static double[] getInput(String inputFile){
      try{  
         ArrayList<Double> al = new ArrayList<Double>(1);
         File file = new File(inputFile);
         Scanner scanner = new Scanner(file);
         
         while (scanner.hasNextLine()){
           al.add(scanner.nextDouble());
         }        
         Object ia[] = al.toArray();       
         double[] dat = new double[ia.length];
         
         for(int i=0; i<ia.length; i++) {        
           dat[i] += ((Double) ia[i]).doubleValue();          
         }
         return dat;
        }
       catch (FileNotFoundException e){
          System.out.println("Error: No output file Specified");
       }
       catch (InputMismatchException e){
          System.out.println("Error: Incompatible character in provided list");
       }
         double[] daf = new double[0];
         return daf;
     }//end getInput
     
     public static void writeOutPut(String outPutFile, double[] numsScaledUp){
       try{
       
       FileWriter fstream = new FileWriter(outPutFile);
       BufferedWriter out = new BufferedWriter(fstream);
       String x = Arrays.toString(numsScaledUp);
       out.write(x);
       out.close();
       }catch (Exception e){//Catch exception if any
       System.err.println("Error: " + e.getMessage());
       }
     
     } //end writeOutPut
     
     
}//end class