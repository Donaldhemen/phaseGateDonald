import java.util.Scanner;

public class TaskSeven{

    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        int evenCount = 0;
        
        for(int count = 1; count <= 10; count++){
        
            System.out.println("Enter a score: ");
            double number = input.nextInt();
            if(number % 2 == 0){
                total += number;
                evenCount++;
            }
        }
        double average = total / evenCount;
        System.out.println("Thesum of the even scores is "+total+" and their average is "+average);
    }
}
