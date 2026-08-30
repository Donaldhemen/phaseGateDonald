//The LCM (Least Common Multiple) of two numbers is the smallest positive integer 
//that is perfectly divisible by both numbers.

public class LCMOfTwoNumbers{
    
    public static void main(String[] args){
        int numberOne = 8;
        int numberTwo = 6;
        
        System.out.println(findLCMOf(numberOne, numberTwo));
       
    }
    
    public static int findLCMOf(int numberOne, int numberTwo){
    
        if(numberOne == 0 || numberTwo == 0){
            return 0;
        }
        
        int product = Math.abs(numberOne * numberTwo);
        int divisor = findGCDOf(numberOne, numberTwo);
        return product / divisor;
    }
    
    public static int findGCDOf(int numberOne, int numberTwo){
        
        int temp = 0;
        while(numberOne != 0){
            temp = numberOne;
            numberOne = numberTwo % numberOne;
            numberTwo = temp;
        }
        return temp;
    }
}
