import java.util.Arrays;
public class CommonOrDuplicateElementsInAnArray {

    public static void main(String[] args){
    
        int[] array = {45,60,3,0,67,2,45,3,22,0};
        System.out.println(Arrays.toString(getArrayOfDuplicateElements(array)));
        
    }

    private static int[] sortArrayOf(int[] array){
        
        int swap = 0;
        
        for(int count = 0; count < array.length; count++){
            for(int counter = 0; counter < array.length; counter++){
                if(array[count] > array[counter]){
                    swap = array[counter];
                    array[counter] = array[count];
                    array[count] = swap;
                }
            }
                
        }
        
    return array;
    }
    
   
   public static int countDuplicateElements(int[] array){

        int duplicateCounter = 0;
        int counter = 0;
        int swap = 0;
        int[] sortedArray = sortArrayOf(array);
       
        for(int index = 0; index < sortedArray.length; index++){
               counter = 0;
           for(int count = 0; count < sortedArray.length; count++){
               if(sortedArray[index] == sortedArray[count] && sortedArray[index] != swap){
                   counter++;
               }
           }
           if(counter > 1){
               duplicateCounter++;
               swap = sortedArray[index];
           }
               
        }

        return duplicateCounter;
   }

   public static int[] getArrayOfDuplicateElements(int[] array){
       
       int counter = 0;
       int swap = 0;
       int[] sortedArray = sortArrayOf(array);
       int[] duplicateArray = new int[countDuplicateElements(array)];
       int indexCounter = 0;
       
       for(int index = 0; index < sortedArray.length; index++){
               counter = 0;
           for(int count = 0; count < sortedArray.length; count++){
               if(sortedArray[index] == sortedArray[count] && sortedArray[index] != swap){
                   counter++;
               }
           }
           if(counter > 1){
               swap = sortedArray[index];
               duplicateArray[indexCounter] = sortedArray[index];
               indexCounter++;
           }
               
       }
       
   return duplicateArray;
   }

} 
