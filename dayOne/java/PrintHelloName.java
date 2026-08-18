//Write a program that asks user of name and prints "Hello 'Name'" 


import java.util.Scanner;

public class PrintHelloName{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        
        System.out.println("Hello, "+ name);
    }
}
