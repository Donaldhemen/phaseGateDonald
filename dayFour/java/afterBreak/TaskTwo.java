import java.util.Scanner;

public class TaskTwo{

    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
        int total = 0;
        
        for(int count = 1; count <= 10; count++){
            System.out.println("Enter a score: ");
            int number = input.nextInt();
            total += number;
        }
        int average = total / 10;
        System.out.println("The average of the ten scores is "+average);
    }
}
