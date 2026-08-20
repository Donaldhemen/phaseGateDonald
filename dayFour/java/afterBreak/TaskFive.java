import java.util.Scanner;

public class TaskFive{

    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        
        for(int count = 1; count <= 10; count++){
        
            System.out.println("Enter a score: ");
            double number = input.nextInt();
            if(number % 2 == 0){
                total += number;
            }
        }
        
        System.out.println("The sum of the even scores is "+total);
    }
}
