import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContainsDuplicatesTest{

    @Test
    public void testToCheckIfAGivenArrayHasDuplicates(){
        
        int[] digits = {1,2,3,1};
        
        boolean expected = ContainsDuplicates.checkForDuplicatesIn(digits);
        boolean actual = true;
        assertEquals(actual, expected);

    }
    
    @Test
    public void testToCheckIfAGivenArrayDoesNotHaveDuplicates(){
        
        int[] digits = {1,2,3,4};
        
        boolean expected = ContainsDuplicates.checkForDuplicatesIn(digits);
        boolean actual = false;
        assertEquals(actual, expected);

    }
}
