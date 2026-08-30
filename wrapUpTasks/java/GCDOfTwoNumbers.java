public class GCDOfTwoNumbers{

    public static void main(String[] args){
        int numberOne = 100;
        int numberTwo = 40;
        int resultGCD = findGCDOf(numberOne, numberTwo);
        System.out.println(resultGCD);
    }
    
    public static int findGCDOf(int numberOne, int numberTwo){
        
        int temp = 0;
        while(numberOne != 0){
            temp = numberOne;
            numberOne = numberTwo % numberOne;
            numberTwo = temp;
        }
        return temp;
    }
    
}

