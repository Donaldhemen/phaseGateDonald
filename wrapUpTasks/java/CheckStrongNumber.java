//A strong number (also known as a Krishnamurthy number or factorion) is a positive integer 
//that is equal to the sum of the factorials of its individual digits.
// e.g 145 = 1! + 4! + 5!= 1 + 24 + 120
public class CheckStrongNumber{
    
    public static void main(String[] args){
    
        int number = 145;
        System.out.println(isStrongNumber(number));
        
    }
    
    public static boolean isStrongNumber(int number){
        
        int original = number;
        int sum = 0;
        
        while(number > 0){
            int digit = number % 10;
            sum += factorialOf(digit);
            number /= 10;
        }
        return sum == original;
    }
    
    public static int factorialOf(int digit){
    
        int product = 1;
        for(int count = digit; count >= 1; count--){
            product *= count;
        }
        return product;
    }
}
