//javac -cp "junit-platform-console-standalone-1.11.0.jar:out" -d out ContainsDuplicatesTest.java ContainsDuplicates.java
//java -cp "junit-platform-console-standalone-1.11.0.jar:out" org.junit.platform.console.ConsoleLauncher --scan-class-path

import java.util.Arrays;
public class ContainsDuplicates{

    public static boolean checkForDuplicatesIn(int[] numbers){
        
        for(int index = 0; index < numbers.length; index++){
  
            for(int count = index + 1; count < numbers.length; count++){
                if(numbers[index] == numbers[count]){
                    return true;
                }            
            }
        }

        return false;
    }
}
