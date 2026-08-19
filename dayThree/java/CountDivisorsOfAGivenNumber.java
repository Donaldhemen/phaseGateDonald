public class CountDivisorsOfAGivenNumber{
    public static void main(String[] args){
        int number = 20;
        System.out.print(countDivisorsOfANumber(number));
    }
    
    public static int countDivisorsOfANumber(int number){
        int counter = 0;
        for(int count = 1; count <= number; count++){
            if(number % count == 0){
               counter++; 
            }
        }
        return counter;
    }
}
