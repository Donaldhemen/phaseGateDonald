//javac -cp "junit-platform-console-standalone-1.11.0.jar:out" -d out DoubleEvenAddOddTest.java DoubleEvenAddOdd.java
//java -cp "junit-platform-console-standalone-1.11.0.jar:out" org.junit.platform.console.ConsoleLauncher --scan-class-path

import java.util.Arrays;
public class DoubleEvenAddOdd{
    
    public static boolean isEven(int number){
        boolean evenCheck = false;
        if(number % 2 == 0){
            evenCheck = true;
        } 
        return evenCheck;
    }
    
    public static boolean isOdd(int number){
        boolean oddCheck = false;
        if(number % 2 == 1){
            oddCheck = true;
        } 
        return oddCheck;
    }
    
    public static int[] addOneToOddOrDoubleEven(int[] numbers){
        
        for(int count = 0; count < numbers.length; count++){
            int number = numbers[count];
            if(isEven(number)){
                numbers[count] = numbers[count] * 2;
            }
            else {
                numbers[count] = numbers[count] + 1;
            }
        }
        return numbers;
    }
}
