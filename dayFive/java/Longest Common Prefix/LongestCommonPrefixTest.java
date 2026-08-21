import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LongestCommonPrefixTest{
    
    @Test
    public void testToReturnAnEmptyStringForEmptyArray(){
        
        String[] array = {};
        String expected = LongestCommonPrefix.returnAnEmptyString(array);
        String actual = "";
        
        assertEquals(actual, expected);
        
    }
}
