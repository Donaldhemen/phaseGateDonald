import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AddDigitsTest{

//    @Test
//    public void testToShowThatInputIsAnInteger(){
//        
//        int number = 11;
//        boolean expected = AddDigits.isInteger(number);
//        boolean actual = true;
//        
//        assertEquals(actual, expected);
//    }
    
    @Test
    public void testToAddAllDigitsTillTheResultHasOnlyOneDigit(){
        int number = 38;
        int expectedResult = AddDigits.sumTheDigitsToOneDigit(number);
        int actualResult = 2;
        
        assertEquals(actualResult, expectedResult);
    }
    
    @Test
    public void testToShowThatNegativeIntegersShouldAlsoAddUpToSameValue(){
        int number = -38;
        int expectedResult = AddDigits.sumTheDigitsToOneDigit(number);
        int actualResult = 2;
        
        assertEquals(actualResult, expectedResult);
    }
}
