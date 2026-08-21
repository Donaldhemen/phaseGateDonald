import java.util.Arrays;
public class SingleNumberMain{

    public static void main(String[] args){
        
       int[] numbers = {2, 2, 1};
       System.out.println(getElementThatAppearsOnce(numbers));
    }
    
    public static int getElementThatAppearsOnce(int[] array){
        boolean check = isNotEmpty(array);
        boolean lengthCheck = isNotLessThanThreeElements(array);
        if(check == true && lengthCheck == true);
        
        int swap = 0;
        for(int index = 0; index < array.length; index++){
            for(int count = 0; count < array.length; count++){
                if(array[index] != array[count]){
                    swap = array[index];
                }
            }
        }
        return swap;
        
        
    }
    public static boolean isNotEmpty(int[] array){
        boolean lengthCheck = false;
        if(array.length > 0){
            lengthCheck = true;
        }
        else {
            lengthCheck = false;
        }
        return lengthCheck;
    }
    
    public static boolean isNotLessThanThreeElements(int[] array){
        boolean lengthCheck = false;
        if(array.length >= 3){
            lengthCheck = true;
        }
        else{
            lengthCheck = false;
        }
        return lengthCheck;
    }
}
