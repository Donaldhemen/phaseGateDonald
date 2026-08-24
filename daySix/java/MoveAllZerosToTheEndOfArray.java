import java.util.Arrays;
public class MoveAllZerosToTheEndOfArray {
    
    public static void main(String[] args){
    
        int[] array = {5,0,3,0,2,0};
        System.out.println(Arrays.toString(moveZeroElementToEndOfArray(array)));
        
    }

    public static int[] moveZeroElementToEndOfArray(int[] array){
        int swap = 0;
        
        for(int index = 0; index < array.length; index++){
            for(int count = 0; count < array.length; count++){
                if(array[index] > array[count]){
                    swap = array[index];
                    array[index] = array[count];
                    array[count] = swap;
                }
            }
        }
        
        return array;
    }
}
