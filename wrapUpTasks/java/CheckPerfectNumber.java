public class CheckPerfectNumber{

    public static void main(String[] args){
        int number = 6;
        System.out.println(isPerfectNumber(number));
    }
    
    public static boolean isPerfectNumber(int number){
        if(number <= 0){
            return false;
        }
        int original = number;
        int sum = 0;
        for(int count = 1; count < number; count++){
            if(number % count == 0){
                sum += count;
            }
        }
        return sum == original;
    }
}
