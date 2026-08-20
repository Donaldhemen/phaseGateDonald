import java.util.Scanner;

public class TaskNine{

    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        
        for(int count = 1; count <= 10; count++){
        
            System.out.println("Enter a score between 1-100: ");
            double number = input.nextInt();
            if(number > 0 && number < 100){
                total += number;
                
            }
            
        }
        
        System.out.println("The sum of the valid scores is "+total);
    }
}
