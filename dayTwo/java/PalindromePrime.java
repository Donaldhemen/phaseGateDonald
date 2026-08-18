public class PalindromePrime{
    public static void main(String[] args){
        
    }
    public static boolean isPalindrome(int number){
        if(number == null || number < 0){
            return false;
        }
        original = number;
        reversed = 0;
        lastDigit = 0;
        while(original > 0){
            lastDigit = original % 10;
            reversed = (reversed * 10) + lastDigit;
            original /= original;
        }
        if(number == reversed){
        return true;
        }
        public static boolean isPrime(int number){
            
            for(int index = 2; index * index < number; index++){
                int checker = 0;
                
                    if(number % count == 0){
                        checker += 1;
                    }
                
            }
            if(checker == 1){
                return true;
            }
        }
        public static boolean isPalindromeAndPrime(int number){
            
        }
    }
}
