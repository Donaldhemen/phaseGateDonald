//javac -cp "junit-platform-console-standalone-1.11.0.jar:out" -d out AddToLastDigitTest.java AddToLastDigit.java
//java -cp "junit-platform-console-standalone-1.11.0.jar:out" org.junit.platform.console.ConsoleLauncher --scan-class-path

import java.util.Arrays;
public class AddToLastDigit{

    public static int[] addOneToLastElement(int[] numbers){
        
        numbers[numbers.length - 1] = numbers[numbers.length - 1] + 1;
       
        return numbers;
    }
    public static int[] addOneToNineAsLastElement(int[] numbers){
        int[] extend = new int[numbers.length+1];
        if(numbers[numbers.length - 1] == 9){
            extend[numbers.length] = 0;
            extend[numbers.length-1] = 1;
        }
        
        for(int index = 0; index < numbers.length-1; index++){
            extend[index] = numbers[index];
        }    
        
        return extend;
    }
}
