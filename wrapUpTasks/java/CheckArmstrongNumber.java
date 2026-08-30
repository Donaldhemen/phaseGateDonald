public class CheckArmstrongNumber {

    public static void main(String[] args){
        int number = 153;
        boolean checkResult = isArmstrongNumber(number);
        System.out.println(checkResult);
    }
    
    public static boolean isArmstrongNumber(int number){
    
        int original = number;
        int digitCount = 0;
        int sum = 0;
        int temp = original;
        
        while(temp > 0){
        
            temp /=  10;
            digitCount++;
        }
        
        while(number > 0){
        
            int remainder = number % 10;
            sum += Math.pow(remainder, digitCount);
            number /= 10;
        }
        return sum == original;
            
    }
}
