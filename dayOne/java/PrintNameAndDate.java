import java.util.Scanner;

public class PrintNameAndDate{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.println("\"My name is \""+ name +"\"\"");
        System.out.println("\"Today is 17/08/2026\"");
    }
}
