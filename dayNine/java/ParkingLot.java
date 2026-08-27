//javac -cp "junit-platform-console-standalone-1.11.0.jar:out" -d out ParkingLotTest.java ParkingLot.java
//java -cp "junit-platform-console-standalone-1.11.0.jar:out" org.junit.platform.console.ConsoleLauncher --scan-class-path
public class ParkingLot {


    private static final int SIZE = 20;


    private int[] slots;


    public ParkingLot() {
        slots = new int[SIZE];
    }


    public boolean parkNext() {

        for (int index = 0; index < SIZE; index++) {

            if (slots[index] == 0) {
                slots[index] = 1;
                return true;
            }
        }

        return false;
    }


    public boolean parkAt(int slotNumber) {


        int index = slotNumber - 1;

    
        if (index < 0 || index >= SIZE) {
            return false;
        }


        if (slots[index] == 1) {
            return false;
        }


        slots[index] = 1;

        return true;
    }


    public boolean leave(int slotNumber) {

        int index = slotNumber - 1;


        if (index < 0 || index >= SIZE) {
            return false;
        }


        if (slots[index] == 0) {
            return false;
        }

      
        slots[index] = 0;

        return true;
    }


    public int getAvailableSpaces() {

        int count = 0;

        for (int slot : slots) {
            if (slot == 0) {
                count++;
            }
        }

        return count;
    }

 
    public int getFilledSpaces() {

        int count = 0;

        for (int slot : slots) {
            if (slot == 1) {
                count++;
            }
        }

        return count;
    }

 
    public int[] getSlots() {
        return slots.clone();
    }

 
    public void displayStatus() {

        System.out.println("\n----- PARKING STATUS -----");

        for (int index = 0; index < SIZE; index++) {

            System.out.println(
                "Slot " + (index + 1) + ": " + slots[index]
            );
        }

        System.out.println(
            "Available spaces: " + getAvailableSpaces()
        );

        System.out.println(
            "Filled spaces: " + getFilledSpaces()
        );

        System.out.println("--------------------------");
    }
}
