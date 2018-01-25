import java.util.Scanner;

public class StringBackwards {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        String x = in.nextLine();
        
        for (int i = x.length(); i > 0; i--){
            
            System.out.print(x.charAt(i-1));
            
        }
        
    }
    
}
