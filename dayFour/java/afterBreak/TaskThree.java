import java.util.Scanner;

public class TaskThree{

    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
        int total = 0;
        
        for(int count = 1; count <= 10; count++){
            System.out.println("Enter a score: ");
            int number = input.nextInt();
            total += number;
        }
        int average = total / 10;
        System.out.println("The sum of the ten scores is "+total+ " and the average is "+average);
    }
}
