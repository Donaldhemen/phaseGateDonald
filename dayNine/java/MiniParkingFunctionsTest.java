import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiniParkingFunctionsTest {


    @Test
    public void testThatWhenICheckASlotItReturnsTrueIfEmpty() {

        //Given
        MiniParkingFunctions.resetParkingLot();
        
        int slot = 1;

        //When
        boolean actualAnswer = MiniParkingFunctions.isSlotEmpty(slot);

        boolean expectedAnswer = true;

        //Check
        assertEquals(expectedAnswer, actualAnswer);
    }


    @Test
    public void testThatWhenICheckASlotItReturnsFalseIfItsFilledUp() {

        //Given
        MiniParkingFunctions.resetParkingLot();
        
        int slot = 1;

        MiniParkingFunctions.chooseSlot(slot);

        //When
        boolean actualAnswer = MiniParkingFunctions.isSlotEmpty(slot);

        boolean expectedAnswer = false;

        //Check
        assertEquals(expectedAnswer, actualAnswer);
    }


    @Test
    public void testThatWhenIChooseAnEmptySlotTheCarIsParked() {

        //Given
        MiniParkingFunctions.resetParkingLot();
        
        int slot = 5;

        //When
        boolean actualAnswer = MiniParkingFunctions.chooseSlot(slot);

        boolean expectedAnswer = true;

        //Check
        assertEquals(expectedAnswer, actualAnswer);
    }


    @Test
    public void testThatWhenIChooseAFilledSlotItReturnsFalse() {

        //Given
        MiniParkingFunctions.resetParkingLot();
        
        int slot = 5;

        MiniParkingFunctions.chooseSlot(slot);

        //When
        boolean actualAnswer = MiniParkingFunctions.chooseSlot(slot);

        boolean expectedAnswer = false;

        //Check
        assertEquals(expectedAnswer, actualAnswer);
    }


    @Test
    public void testThatWhenACarLeavesASlotItBecomesEmpty() {

        //Given
        MiniParkingFunctions.resetParkingLot();
        
        int slot = 3;

        MiniParkingFunctions.chooseSlot(slot);

        //When
        MiniParkingFunctions.leaveSlot(slot);

        boolean actualAnswer = MiniParkingFunctions.isSlotEmpty(slot);

        boolean expectedAnswer = true;

        //Check
        assertEquals(expectedAnswer, actualAnswer);
    }


    @Test
    public void testThatWhenICarLeavesAnEmptySlotItReturnsFalse() {

        //Given
        MiniParkingFunctions.resetParkingLot();
        
        int slot = 3;

        //When
        boolean actualAnswer = MiniParkingFunctions.leaveSlot(slot);

        boolean expectedAnswer = false;

        //Check
        assertEquals(expectedAnswer, actualAnswer);
    }


    @Test
    public void testThatParkNextUsesTheFirstAvailableSlot() {

        //Given
        MiniParkingFunctions.resetParkingLot();
        
        MiniParkingFunctions.chooseSlot(1);
        MiniParkingFunctions.chooseSlot(2);

        //When
        int actualAnswer = MiniParkingFunctions.parkNext();

        int expectedAnswer = 3;

        //Check
        assertEquals(expectedAnswer, actualAnswer);
    }


    @Test
    public void testThatParkNextUsesTheFirstEmptySlotAfterACarLeaves() {

        //Given
        MiniParkingFunctions.resetParkingLot();
        
        MiniParkingFunctions.chooseSlot(1);
        MiniParkingFunctions.chooseSlot(2);
        MiniParkingFunctions.chooseSlot(3);

        MiniParkingFunctions.leaveSlot(2);

        //When
        int actualAnswer = MiniParkingFunctions.parkNext();

        int expectedAnswer = 2;

        //Check
        assertEquals(expectedAnswer, actualAnswer);
    }


    @Test
    public void testThatThereAre20AvailableSpacesWhenParkingLotIsEmpty() {

        //Given
        MiniParkingFunctions.resetParkingLot();

        //When
        int actualAnswer = MiniParkingFunctions.availableSpaces();

        int expectedAnswer = 20;

        //Check
        assertEquals(expectedAnswer, actualAnswer);
    }


    @Test
    public void testThatThereIsOneFilledSpaceAfterParkingOneCar() {

        //Given
        MiniParkingFunctions.resetParkingLot();
        
        MiniParkingFunctions.chooseSlot(1);

        //When
        int actualAnswer = MiniParkingFunctions.filledSpaces();

        int expectedAnswer = 1;

        //Check
        assertEquals(expectedAnswer, actualAnswer);
    }


    @Test
    public void testThatThereAre19AvailableSpacesAfterParkingOneCar() {

        //Given
        MiniParkingFunctions.resetParkingLot();
        
        MiniParkingFunctions.chooseSlot(1);

        //When
        int actualAnswer = MiniParkingFunctions.availableSpaces();

        int expectedAnswer = 19;

        //Check
        assertEquals(expectedAnswer, actualAnswer);
    }


    @Test
    public void testThatThereAre20FilledSpacesWhenParkingLotIsFull() {

        //Given
        MiniParkingFunctions.resetParkingLot();
        
        for (int index = 1; index <= 20; index++) {
            MiniParkingFunctions.chooseSlot(index);
        }

        //When
        int actualAnswer = MiniParkingFunctions.filledSpaces();

        int expectedAnswer = 20;

        //Check
        assertEquals(expectedAnswer, actualAnswer);
    }


    @Test
    public void testThatParkNextReturnsMinusOneWhenParkingLotIsFull() {

        //Given
        MiniParkingFunctions.resetParkingLot();
        
        for (int index = 1; index <= 20; index++) {
            MiniParkingFunctions.chooseSlot(index);
        }

        //When
        int actualAnswer = MiniParkingFunctions.parkNext();

        int expectedAnswer = -1;

        //Check
        assertEquals(expectedAnswer, actualAnswer);
    }


    @Test
    public void testThatSlotZeroIsInvalid() {

        //Given
        MiniParkingFunctions.resetParkingLot();
        
        int slot = 0;

        //When
        boolean actualAnswer = MiniParkingFunctions.chooseSlot(slot);

        boolean expectedAnswer = false;

        //Check
        assertEquals(expectedAnswer, actualAnswer);
    }


    @Test
    public void testThatSlot21IsInvalid() {

        //Given
        MiniParkingFunctions.resetParkingLot();
        
        int slot = 21;

        //When
        boolean actualAnswer = MiniParkingFunctions.chooseSlot(slot);

        boolean expectedAnswer = false;

        //Check
        assertEquals(expectedAnswer, actualAnswer);
    }
}
