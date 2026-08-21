import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SingleNumberTest{

    @Test
    public void testToCheckThatArrayOfIntegersIsNotEmpty(){
        int[] numbers = {2, 2, 1};
        boolean expected = SingleNumber.isNotEmpty(numbers);
        boolean actual = true;
        assertEquals(actual, expected);
    }
    
    @Test
    public void testToCheckThatArrayOfIntegersIsNotlessThanThree(){
        int[] numbers = {2, 2, 1};
        boolean expected = SingleNumber.isNotLessThanThreeElements(numbers);
        boolean actual = true;
        assertEquals(actual, expected);
    }
    
    @Test
    public void testToCollectElementThatAppearsLessThanTwice(){
        int[] numbers = {2,2,1};
        int expectedResult = SingleNumber.getElementThatAppearsOnce(numbers);
        int actualResult = 1;
        assertEquals(actualResult, expectedResult);
    }
}
