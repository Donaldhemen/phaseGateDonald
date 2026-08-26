import java.util.Arrays;

public class MainAddToLastDigit{
    
    public static void main(String[] args){
        
        int[] digits = {1,2,3,9};
        System.out.println(Arrays.toString(addOneToLastElement(digits)));
    }

    public static int[] addOneToLastElement(int[] numbers){
        if(numbers[numbers.length - 1] == 9){
            int[] extend = new int[numbers.length+1];

            extend[numbers.length] = 0;
            extend[numbers.length-1] = 1;

            for(int index = 0; index < numbers.length-1; index++){
                extend[index] = numbers[index];
                
            }
            return extend;
        }
        else {
            numbers[numbers.length - 1] = numbers[numbers.length - 1] + 1;
       
            return numbers;
        }
    }
}
