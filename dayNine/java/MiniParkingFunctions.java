//javac -cp "junit-platform-console-standalone-1.11.0.jar:out" -d out MiniParkingFunctionsTest.java MiniParkingFunctions.java
//java -cp "junit-platform-console-standalone-1.11.0.jar:out" org.junit.platform.console.ConsoleLauncher --scan-class-path

public class MiniParkingFunctions {

    static int[] slots = new int[20];

    public static void resetParkingLot() {

        for (int index = 0; index < 20; index++) {
            slots[index] = 0;
        }
    }


    public static boolean isSlotEmpty(int slot) {

        int index = slot - 1;

        if (slot < 1 || slot > 20) {
            return false;
        }

        if (slots[index] == 0) {
            return true;
        }

        return false;
    }



    public static boolean chooseSlot(int slot) {

        int index = slot - 1;

        if (slot < 1 || slot > 20) {
            return false;
        }


        if (slots[index] == 0) {

            slots[index] = 1;

            return true;
        }

        return false;
    }



    public static int parkNext() {

        for (int index = 0; index < 20; index++) {

            if (slots[index] == 0) {

                slots[index] = 1;

                return index + 1;
            }
        }

        return -1;
    }


    public static boolean leaveSlot(int slot) {

        int index = slot - 1;


        if (slot < 1 || slot > 20) {
            return false;
        }

        if (slots[index] == 1) {

            slots[index] = 0;

            return true;
        }

        return false;
    }


    public static int availableSpaces() {

        int available = 0;

        for (int index = 0; index < 20; index++) {

            if (slots[index] == 0) {
                available++;
            }
        }

        return available;
    }


    public static int filledSpaces() {

        int filled = 0;

        for (int index = 0; index < 20; index++) {

            if (slots[index] == 1) {
                filled++;
            }
        }

        return filled;
    }


    public static void displayStatus() {

        System.out.println("\n===== PARKING STATUS =====");

        for (int index = 0; index < 20; index++) {

            System.out.println("Slot " + (index + 1) + ": " + slots[index]);
        }

        System.out.println("Available spaces: " + availableSpaces());

        System.out.println("Filled spaces: " + filledSpaces());

        System.out.println("==========================");
    }
}
