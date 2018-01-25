package simplestatistics;

import java.util.*;

public class SimpleStatistics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        double[] y = getUserInput();
       
    }

    public static double[] getUserInput() {
        double[] x;
        int size = 0;
        
        Scanner read = new Scanner(System.in);
    
        System.out.println("How many numbers will you enter?: ");
        size = read.nextInt();
        x = new double[size];
        System.out.println("Please enter integers: ");
        for (int i = 0; i < x.length; i++) {

            x[i] = read.nextDouble();
           
            
        }

        return (x);
    }
    public static double arithmeticMean(double[] nums){
        
        nums = getUserInput();
        double numsFinal = 0;
        for(int i = 0; i < nums.length; i++) {
           numsFinal += nums[i];
        }
        return numsFinal / nums.length;
    }
    public static double geometricMean(double[] nums){
        nums = getUserInput();
        double numsFinal = 1.0;
        for (int i = 0; i < nums.length; i++){
            numsFinal *= nums[i];
        }
        numsFinal = Math.pow(numsFinal, 1.0/ (double) nums.length);
        return numsFinal;
    }
    
    public static double[] minAndMax(double[] nums){
        nums = getUserInput();
        double numsMin = nums[0];
        double numsMax = nums[0];
        double[] minAndMax;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > numsMax)
                numsMax = nums[i];
            else if (nums[i] < numsMin)
                numsMin = nums[i];
        }
        minAndMax[0] = numsMin;
        minAndMax[1] = numsMax;
        return minAndMax;
    }
    public static double[] scaleUp(double[] nums, double factor){
        nums = getUserInput();
        double numsFinal[] = new double[nums.length];
        
        Scanner read = new Scanner(System.in);
        System.out.println("Please enter an integer to factor user input by: ");
        factor = read.nextDouble();
        
        if (factor < 1.0){
        return;
    }
        else{
        
        for(int i = 0; i < nums.length; i++){
            
        numsFinal[i] = factor * nums[i];
        }
            
        }
            return numsFinal;
    }
    /*public static double scaleDown(double[] nums, double factor){
        nums = getUserInput();
        double numsFinal[] = new double[nums.length];
        
        
        Scanner read = new Scanner(System.in);
        System.out.println("Please enter an integer to factor user input by: ");
        factor = read.nextDouble();
        
        if (factor < 1.0){
        return (0);
        }
        else{
        
        for(int i = 0; i < nums.length; i++){
            
       
        }
                    
            return numsFinal = factor / nums;
        } */
}
