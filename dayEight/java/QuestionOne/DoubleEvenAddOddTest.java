import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DoubleEvenAddOddTest{
    
    @Test
    public void testToCheckIfNumberIsEven(){
    
        int number = 2;
        boolean expected = DoubleEvenAddOdd.isEven(number);
        boolean actual = true;
        assertEquals(actual, expected);
    }
    
    @Test
    public void testToCheckIfNumberIsOdd(){
    
        int number = 3;
        boolean expected = DoubleEvenAddOdd.isOdd(number);
        boolean actual = true;
        assertEquals(actual, expected);
    }
    
     @Test
    public void testToCheckIfOddNumberInArrayIsAddedToOne(){
    
        int[] number = {1,3,5};
        int[] expected = DoubleEvenAddOdd.addOneToOddOrDoubleEven(number);
        int[] actual = {2,4,6};
        assertArrayEquals(actual, expected);
    }
    
    @Test
    public void testToCheckIfEvenNumberInArrayIsDoubled(){
    
        int[] number = {2,4,6};
        int[] expected = DoubleEvenAddOdd.addOneToOddOrDoubleEven(number);
        int[] actual = {4,8,12};
        assertArrayEquals(actual, expected);
    }
}
