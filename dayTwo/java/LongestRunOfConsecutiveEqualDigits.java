//input 1122333145 longest run ="333" length = 3

public class LongestRunOfConsecutiveEqualDigits{
    public static void main(String[] args){
        int number = 1122333145;
        int lastDigit = 0;
        
        while(number > 0){
            lastDigit = number %;
            number /= number;
            
        }
    }
}
