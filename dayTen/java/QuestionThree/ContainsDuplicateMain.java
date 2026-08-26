import java.util.Arrays;
public class ContainsDuplicateMain{

    public static void main(String[] args){
    
        int[] digits = {1,2,3,1};
        System.out.println(checkForDuplicatesIn(digits));
    }

    public static boolean checkForDuplicatesIn(int[] numbers){
        
        for(int index = 0; index < numbers.length; index++){
  
            for(int count = index + 1; count < numbers.length; count++){
                if(numbers[index] == numbers[count]){
                    return true;
                }            
            }
        }

        return false;
    }
}
