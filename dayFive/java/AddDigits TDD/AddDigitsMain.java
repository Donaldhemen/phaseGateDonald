public class AddDigitsMain{
    
    public static int sumTheDigitsToOneDigit(int number){
        if(number < 0){
            number = 0 - number;
        }
        
        int singleDigit = 0;
        while(number > 9){
            singleDigit = (number / 10) + (number % 10);
            number = singleDigit;
        }
        return singleDigit;
    }
    public static void main(String[] args){
        int value = 38;
        System.out.println(sumTheDigitsToOneDigit(value));
    }
    
}
