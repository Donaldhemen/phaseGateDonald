public class Factorial{

    public static void main(String[] args){
    
        int number = 5;
        System.out.println(factorialOf(number));
    }
    
    public static int factorialOf(int digit){
    
        int product = 1;
        for(int count = digit; count >= 1; count--){
            product *= count;
        }
        return product;
    }
}
