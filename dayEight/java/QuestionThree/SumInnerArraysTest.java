import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SumInnerArraysTest{

    @Test
    public void testToAddTheElementsInAnArray(){
        int[] array = {3,5,7};
        int expected = SumInnerArrays.addElementsIn(array);
        int actual = 15;
        assertEquals(actual, expected);
        
    }
    
    @Test
    public void testToAddTheElementsInAllTheInnerArrays(){
    
        int[][] array = {{3,5,7}, {2,2,2}, {4,1,9}};
        int[] expected = SumInnerArrays.addElementsInInnerArrays(array);
        int[] actual = {15,6,14};
        assertArrayEquals(actual, expected);
    }
}
