//javac -cp "junit-platform-console-standalone-1.11.0.jar:out" -d out SingleNumberTest.java SingleNumber.java
//java -cp "junit-platform-console-standalone-1.11.0.jar:out" org.junit.platform.console.ConsoleLauncher --scan-class-path

//every element appears twice except one 
// input nums = [2, 2, 1] output = 1
// input nums = [4, 1,2,1,2] output = 4

import java.util.Arrays;
public class SingleNumber{

    public static boolean isNotEmpty(int[] array){
        boolean lengthCheck = false;
        if(array.length > 0){
            lengthCheck = true;
        }
        else {
            lengthCheck = false;
        }
        return lengthCheck;
    }
    
    public static boolean isNotLessThanThreeElements(int[] array){
        boolean lengthCheck = false;
        if(array.length >= 3){
            lengthCheck = true;
        }
        else{
            lengthCheck = false;
        }
        return lengthCheck;
    }
    
    public static int getElementThatAppearsOnce(int[] array){
        
        int swap = 0;
        for(int index = 0; index < array.length; index++){
            for(int count = 0; count < array.length; count++){
                if(array[index] != array[count]){
                    swap = array[index];
                }
            }
        }
        return swap;
    }
}
