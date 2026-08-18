//mean of x, y and z
// median from sorting and picking the value in between 

public class MeanAndMedianOfThreeValues{
    public static void main(String[] args){
        double median = 0;
        double firstValue = 5;
        double secondValue = 4;
        double thirdValue = 6;
        
        double average = (firstValue + secondValue + thirdValue) / 3;
        
        if (firstValue > secondValue && firstValue > thirdValue){
            if(secondValue > thirdValue){
            
                median = secondValue;
            }
            else if(secondValue < thirdValue) {
                median = thirdValue;
            }
        }
        
        if (secondValue > firstValue && secondValue > thirdValue){
            if(firstValue > thirdValue){
            
                median = firstValue;
            }
            else if(firstValue < thirdValue){
            
               median = thirdValue;
            }
        }
        
        if (thirdValue > firstValue && thirdValue > secondValue){
            if(firstValue > secondValue){
            
                median = firstValue;
            }
            else if(firstValue > secondValue){
                median = secondValue;
            }
        }
        
        System.out.printf("The mean of the three values is %f and the median is %f%n", average, median);
    }
}
