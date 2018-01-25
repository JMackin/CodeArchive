import java.util.Scanner;

public class SimpleStatistics2{
  
  public static void main(String [] args){
  
    Scanner input = new Scanner(System.in);
    String menu = "[1] - Arithmetic Mean\n" +
                  "[2] - Geometric Mean \n" +
                  "[3] - minAndMax\n"       +
                  "[4] - scaleUp\n"           +
                  "[5] - scaleDown\n"         +
                  "[6] - Exit\n";
    boolean quit = false;
    double factor = 1.0;
    double[] nums = new double[0];
    double[] result = new double[0];
  
    while(quit == false){
  
      System.out.println(menu);
      int cmd = input.nextInt();
    
      switch (cmd){
        case 1:
          System.out.println("\n"+ arithmeticMean(getUserInput())+"\n");
          break;
        
        case 2:
          System.out.println("\n"+ geometricMean(getUserInput())+"\n");
          break;
        
        case 3:
          System.out.println("\n"+ minAndMax(getUserInput())+"\n");
          break;
        
        case 4:
          System.out.println("Enter scale factor: ");
          factor = input.nextDouble();
          if (factor <= 0) {
            System.out.println("\nFactor Must be at least 1...\n");
            break;
            }
          nums = getUserInput();
          result = scaleUp(nums,factor);        
          for (int i = 0; i < nums.length; i++){System.out.print(result[i] + " ");}
         System.out.println("\n");
          break;
        
        case 5:
          System.out.println("Enter scale factor: ");
          factor = input.nextDouble();
          if (factor <= 0) {
            System.out.println("\nFactor Must be at least 1...\n");
            break;
            }
          nums = getUserInput();
          result = scaleDown(nums,factor);
          for (int i = 0; i < nums.length; i++){System.out.print(result[i] + " ");}
          System.out.println("\n");
          break;
        
        case 6:
          quit = true;
          break;
        
        default:
          System.out.println("Please enter a valid option...");
          break;
        
      }//end switch
    }//end while
    
    
  }//end main
  
  public static double[] getUserInput(){
    
    System.out.println("How many numbers will you enter?");
    Scanner input = new Scanner(System.in);
    int size = input.nextInt();
    double[] nums = new double[size];
    
    System.out.println("Enter Integers: ");
    for (int i = 0; i < nums.length; i++){
      nums[i] = input.nextDouble();
    }
    
    return nums;
        
  }//end getUserInput
  
  public static double arithmeticMean(double[] nums){
    
    double numSum = 0;
    double numAMean = 0;
    
    for(int i = 0; i < nums.length; i++){
      numSum += nums[i];
    }
    numAMean = numSum / nums.length;
    return numAMean;
  
  }//end get arithmetic mean
  
  public static double geometricMean(double[] nums){
  
    double numPrdct = 0;
    double numGMean = 0;
    
    for (int i = 0; i < nums.length; i++){
      numPrdct *= nums[i];
    }
    numGMean = Math.pow(numPrdct, (1.0 / (double) nums.length));
    return numGMean; 
  
  }//end geometric mean
  
  public static double[] minAndMax(double[] nums){
    double numsMin = nums[0];
    double numsMax = nums[0];
    
    for(int i = 0; i < nums.length; i++){
      if(nums[i] > numsMax){
        numsMax = nums[i];
      }
      else if (nums[i] < numsMin){
        numsMin = nums[i];
      }
    }
    double[] minAndMax = {numsMin,numsMax};
    return minAndMax;
    
  }//end minAndMax
  
  public static double[] scaleUp(double[] nums, double factor){
    double[] numsScaled = new double[nums.length];
    
    for (int i = 0; i < nums.length; i++){
      numsScaled[i] = (nums[i] * factor);  
    }
    return numsScaled;
    
  }//end scale up
  
  public static double[] scaleDown(double[] nums, double factor){
    double[] numsScaled = new double[nums.length];
    
    for (int i = 0; i < nums.length; i++){
      numsScaled[i] = (nums[i] / factor);  
    }
    return numsScaled;
    
  }//end scale down
  
}//end class