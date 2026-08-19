public class ReverseAnInteger{
    public static void main(String[] args){
        int value = 12345;
        System.out.println(getTheReverseOfInteger(value));
    }
    
    public static int getTheReverseOfInteger(int number){
    
        int reverse = 0;
        
        while(number > 0){
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
        }
        return reverse;
    }
}
