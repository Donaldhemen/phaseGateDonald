
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParkingLotTest {

    // Test that a car can park
    @Test
    public void testParkNext() {

        ParkingLot parkingLot = new ParkingLot();

        assertTrue(parkingLot.parkNext());

        assertEquals(1, parkingLot.getFilledSpaces());

        assertEquals(19, parkingLot.getAvailableSpaces());
    }


    // Test that cars are parked from left to right
    @Test
    public void testParkFromLeftToRight() {

        ParkingLot parkingLot = new ParkingLot();

        parkingLot.parkNext();
        parkingLot.parkNext();
        parkingLot.parkNext();

        int[] slots = parkingLot.getSlots();

        assertEquals(1, slots[0]);
        assertEquals(1, slots[1]);
        assertEquals(1, slots[2]);

        assertEquals(0, slots[3]);
    }


    // Test parking in a specific slot
    @Test
    public void testParkAt() {

        ParkingLot parkingLot = new ParkingLot();

        assertTrue(parkingLot.parkAt(10));

        int[] slots = parkingLot.getSlots();

        assertEquals(1, slots[9]);

        assertEquals(1, parkingLot.getFilledSpaces());
    }


    // Test that an occupied slot cannot be used again
    @Test
    public void testCannotParkInOccupiedSlot() {

        ParkingLot parkingLot = new ParkingLot();

        assertTrue(parkingLot.parkAt(5));

        assertFalse(parkingLot.parkAt(5));

        assertEquals(1, parkingLot.getFilledSpaces());
    }


    // Test removing a car
    @Test
    public void testLeave() {

        ParkingLot parkingLot = new ParkingLot();

        parkingLot.parkAt(5);

        assertTrue(parkingLot.leave(5));

        assertEquals(0, parkingLot.getFilledSpaces());

        assertEquals(20, parkingLot.getAvailableSpaces());
    }


    // Test that an empty slot cannot be removed
    @Test
    public void testLeaveEmptySlot() {

        ParkingLot parkingLot = new ParkingLot();

        assertFalse(parkingLot.leave(5));
    }


    // Test invalid slot number
    @Test
    public void testInvalidSlot() {

        ParkingLot parkingLot = new ParkingLot();

        assertFalse(parkingLot.parkAt(0));

        assertFalse(parkingLot.parkAt(21));

        assertFalse(parkingLot.leave(0));

        assertFalse(parkingLot.leave(21));
    }


    // Test that the parking lot can become full
    @Test
    public void testParkingLotFull() {

        ParkingLot parkingLot = new ParkingLot();

        // Park 20 cars
        for (int index = 0; index < 20; index++) {
            assertTrue(parkingLot.parkNext());
        }

        assertEquals(20, parkingLot.getFilledSpaces());

        assertEquals(0, parkingLot.getAvailableSpaces());

        // The 21st car cannot park
        assertFalse(parkingLot.parkNext());
    }
}