//javac -cp "junit-platform-console-standalone-1.11.0.jar:out" -d out SumInnerArraysTest.java SumInnerArrays.java
//java -cp "junit-platform-console-standalone-1.11.0.jar:out" org.junit.platform.console.ConsoleLauncher --scan-class-path

public class SumInnerArrays{
    
    public static int addElementsIn(int[] array){
        int total = 0;
        for(int index = 0; index < array.length; index++){
            total += array[index];
        }
        return total;
    }
    
    public static int[] addElementsInInnerArrays(int[][] array){
        
        int[] sumArray = new int[array.length];
        
       
        for (int column = 0; column < array.length; column++){
            int count = 0;
            for (int row = 0; row < array.length; row++){
                sumArray[count] += array[row][column];
                count++;
            }
        }
        return sumArray;
    }
}


