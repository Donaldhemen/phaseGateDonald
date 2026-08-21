public class Functions{

    public static int addTwoNumbers(int numberOne, int numberTwo){
        return numberOne + numberTwo;
    }
    
    public static boolean checkEvenNumber(int number){
        if(number % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static int squareTheNumber(int number){
        return number * number;
    }
    
    public static double convertCelsiusToFahrenheit(double celsius){
        double fahrenheit = (celsius * 9 / 5) + 32;
        return fahrenheit;
    }
    
    public static boolean isPrime(int number){
        boolean primeChecker = false;
        for(int count = 2; count < number; count++){
            if(number % count == 0){
                primeChecker = false;
            }
            else{
                primeChecker = true;
            }
        }
        return primeChecker;
    }
    
    public static int findLargestOfThree(int numberOne, int numberTwo, int numberThree){
        int largest = 0;
        if(numberOne > numberTwo && numberOne > numberThree){
            largest = numberOne;
        }
        else if(numberTwo > numberOne && numberTwo > numberThree){
            largest = numberTwo;
        }
        else {
            largest = numberThree;
        }
        return largest;
    }
    
    public static double calculateSimpleInterest(double numberOne, double numberTwo, double numberThree){
        double simpleInterest = (numberOne * numberTwo * numberThree) / 100;
        return simpleInterest;
    }
    
    public static int calculateAreaOfRectangle(int numberOne, int numberTwo){
        return numberOne * numberTwo;
    }
    
    public static int reverseANumber(int number){
        int reversed = 0;
        while(number > 0){
            int lastDigit = number % 10;
            reversed = (reversed * 10) + lastDigit;
            number /= 10;
        }
        return reversed;
    }
    
//    public static int countOccurencesInAString(String word, char letter){
//        int counter = 0;
//        for(int count = 0; count < word.length; count++){
//            if(charAt(word) == letter){
//                counter++;
//            }
//        }
//        return counter;
//    }
    
    public static void main(String[] args){
        int additionResult = addTwoNumbers(4, 5);
        
        
        System.out.println(additionResult);
    }
}
