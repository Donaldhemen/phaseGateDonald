//javac -cp "junit-platform-console-standalone-1.11.0.jar:out" -d out AddDigitsTest.java AddDigits.java
//java -cp "junit-platform-console-standalone-1.11.0.jar:out" org.junit.platform.console.ConsoleLauncher --scan-class-path


public class AddDigits{
//
//    public static boolean isInteger(int number){
//        boolean result = isDigit(number);
//        return result;
//    }
    
    public static int sumTheDigitsToOneDigit(int number){
        if(number < 0){
            number = 0 - number;
        }
        
        int singleDigit = 0;
        while(number >= 10){
            singleDigit = (number / 10) + (number % 10);
            number = singleDigit;
        }
        return singleDigit;
    }
    
}
