// print 1-100 and "skip"

public class PrintNumbersFromOneToHundred{
    public static void main(String[] args){
        String multipleOfThree = "Skip";
        
        for(int count = 1; count <= 100; count++){
            if(count % 3 == 0){
                System.out.print(multipleOfThree+" ");
            }
            else {
                System.out.print(count+" ");
            }
        }
        System.out.println();
    }
}
