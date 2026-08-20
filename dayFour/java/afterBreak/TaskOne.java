import java.util.Scanner;

public class TaskOne{

    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
        int total = 0;
        
        for(int count = 1; count <= 10; count++){
            System.out.println("Enter a score: ");
            int number = input.nextInt();
            total += number;
        }
        System.out.println("The sum of the ten scores is "+total);
    }
}
