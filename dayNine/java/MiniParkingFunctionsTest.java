import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiniParkingFunctionsTest {


//    @BeforeEach
//    public void setUp() {
//
//        
//        MiniParkingFunctions.resetParkingLot();
//    }


    @Test
    public void TestThatWhenICheckASlotItReturnsTrueIfEmpty() {

        //Given
        int slot = 1;

        //When
        boolean actualAnswer = MiniParkingFunctions.isSlotEmpty(slot);

        boolean expectedAnswer = true;

        //Check
        assertEquals(expectedAnswer, actualAnswer);
    }


    @Test
    public void TestThatWhenICheckASlotItReturnsFalseIfItsFilledUp() {

        //Given
        int slot = 1;

        MiniParkingFunctions.chooseSlot(slot);

        //When
        boolean actualAnswer = MiniParkingFunctions.isSlotEmpty(slot);

        boolean expectedAnswer = false;

        //Check
        assertEquals(expectedAnswer, actualAnswer);
    }


    @Test
    public void TestThatWhenIChooseAnEmptySlotTheCarIsParked() {

        //Given
        int slot = 5;

        //When
        boolean actualAnswer = MiniParkingFunctions.chooseSlot(slot);

        boolean expectedAnswer = true;

        //Check
        assertEquals(expectedAnswer, actualAnswer);
    }


    @Test
    public void TestThatWhenIChooseAFilledSlotItReturnsFalse() {

        //Given
        int slot = 5;

        MiniParkingFunctions.chooseSlot(slot);

        //When
        boolean actualAnswer = MiniParkingFunctions.chooseSlot(slot);

        boolean expectedAnswer = false;

        //Check
        assertEquals(expectedAnswer, actualAnswer);
    }


    @Test
    public void TestThatWhenICarLeavesASlotItBecomesEmpty() {

        //Given
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
    public void TestThatWhenICarLeavesAnEmptySlotItReturnsFalse() {

        //Given
        int slot = 3;

        //When
        boolean actualAnswer = MiniParkingFunctions.leaveSlot(slot);

        boolean expectedAnswer = false;

        //Check
        assertEquals(expectedAnswer, actualAnswer);
    }


    @Test
    public void TestThatParkNextUsesTheFirstAvailableSlot() {

        //Given
        MiniParkingFunctions.chooseSlot(1);
        MiniParkingFunctions.chooseSlot(2);

        //When
        int actualAnswer = MiniParkingFunctions.parkNext();

        int expectedAnswer = 3;

        //Check
        assertEquals(expectedAnswer, actualAnswer);
    }


    @Test
    public void TestThatParkNextUsesTheFirstEmptySlotAfterACarLeaves() {

        //Given
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
    public void TestThatThereAre20AvailableSpacesWhenParkingLotIsEmpty() {

        //Given
        // Parking lot starts empty

        //When
        int actualAnswer = MiniParkingFunctions.availableSpaces();

        int expectedAnswer = 20;

        //Check
        assertEquals(expectedAnswer, actualAnswer);
    }


    @Test
    public void TestThatThereIsOneFilledSpaceAfterParkingOneCar() {

        //Given
        MiniParkingFunctions.chooseSlot(1);

        //When
        int actualAnswer = MiniParkingFunctions.filledSpaces();

        int expectedAnswer = 1;

        //Check
        assertEquals(expectedAnswer, actualAnswer);
    }


    @Test
    public void TestThatThereAre19AvailableSpacesAfterParkingOneCar() {

        //Given
        MiniParkingFunctions.chooseSlot(1);

        //When
        int actualAnswer = MiniParkingFunctions.availableSpaces();

        int expectedAnswer = 19;

        //Check
        assertEquals(expectedAnswer, actualAnswer);
    }


    @Test
    public void TestThatThereAre20FilledSpacesWhenParkingLotIsFull() {

        //Given
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
    public void TestThatParkNextReturnsMinusOneWhenParkingLotIsFull() {

        //Given
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
    public void TestThatSlotZeroIsInvalid() {

        //Given
        int slot = 0;

        //When
        boolean actualAnswer = MiniParkingFunctions.chooseSlot(slot);

        boolean expectedAnswer = false;

        //Check
        assertEquals(expectedAnswer, actualAnswer);
    }


    @Test
    public void TestThatSlot21IsInvalid() {

        //Given
        int slot = 21;

        //When
        boolean actualAnswer = MiniParkingFunctions.chooseSlot(slot);

        boolean expectedAnswer = false;

        //Check
        assertEquals(expectedAnswer, actualAnswer);
    }
}
