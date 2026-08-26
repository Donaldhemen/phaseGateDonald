import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AddToLastDigitTest{

    @Test
    public void testToAddOneToTheLastElementInTheArray(){
        
        int[] digits = {1,2,3};
        
        int[] expected = AddToLastDigit.addOneToLastElement(digits);
        int[] actual = {1,2,4};
        
        assertArrayEquals(actual, expected);
    }
    
    @Test
    public void testToShowThatIfAddedDigitIsMoreThanNineThenItAddsOneAndZero(){
    
        int[] digits = {9};
        int[] expected = AddToLastDigit.addOneToNineAsLastElement(digits);
        int[] actual = {1,0};
        assertArrayEquals(actual, expected);
        
    }
    
}

