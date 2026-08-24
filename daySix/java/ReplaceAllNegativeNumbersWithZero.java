public class ReplaceAllNegativeNumbersWithZero{

    public static void main(String[] args){
    
        int[] array = {5,-9,3,-6,2,-11};
        System.out.println(Arrays.toString(replaceNegativeElements(array)));
        
    }
    
    public static int[] replaceNegativeElements(int[] array){
        
        for(int index = 0; index < array.length; index++){
            int number = array[index];
            if(number < 0){
                array[index] = 0;
            }
        }
        
        return array;
    }
}
