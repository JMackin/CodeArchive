/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       09/20/14
 *
 * Filename:   OperatorsCasting.java
 *
 * Purpose:    Examples of casting (implicit and explicit)
 */
 
public class OperatorsCasting {

    public static void main(String [] args) {
   
        // data declarations
        float fltTaxRate = 0.05f;
        double dblSalesTax;
        
        double dblTaxRate = 0.05;
        float fltSalesTax;
        
        int sumScores, countScores;
        double avgScore;
        
        // initialization
        dblSalesTax = fltTaxRate;     // OK: lower precision into higher
        //fltSalesTax = dblTaxRate;     // not OK: higher precision into lower
        
        sumScores = 926;
        countScores = 10;
            
        // computations, outputs
        
        // incorrect: RHS is performed as integer division
        avgScore = sumScores / countScores;
        System.out.println("incorrect: avgScore = " + avgScore);
              
        // incorrect: RHS is already int result, too late to cast
        avgScore = (double) (sumScores / countScores);
        System.out.println("incorrect: avgScore = " + avgScore);
                    
        // correct: one RHS double term forces floating-point evaluation
        avgScore = (double) sumScores / countScores;
        System.out.println("correct: avgScore = " + avgScore);
        
        avgScore = sumScores / (double) countScores;
        System.out.println("correct: avgScore = " + avgScore);
        
    } // end main

} // end class

