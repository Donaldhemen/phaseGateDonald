public class DivisorsOfAGivenNumber{
    public static void main(String[] args){
        int number = 20;
        getDivisorsOfANumber(number);
    }
    
    public static void getDivisorsOfANumber(int number){
        for(int count = 1; count <= number; count++){
            if(number % count == 0){
               System.out.print(count+" "); 
            }
        }
        System.out.println();
    }
}
//no 9 is the count of divisors

