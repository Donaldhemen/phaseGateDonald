import java.util.Scanner;

public class MainParkingLot{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ParkingLot parkingLot = new ParkingLot();

        int choice;

        do {

            System.out.println("\n===== DONALD'S PARKING LOT =====");
            System.out.println("1. Park car in first available slot");
            System.out.println("2. Park car in specific slot");
            System.out.println("3. Remove car");
            System.out.println("4. Display parking status");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:

                    if (parkingLot.parkNext()) {
                        System.out.println(
                            "Car parked successfully."
                        );
                    } else {
                        System.out.println(
                            "Parking lot is full."
                        );
                    }

                    parkingLot.displayStatus();

                    break;

                case 2:

                    System.out.print(
                        "Enter slot number (1-20): "
                    );

                    int slot = input.nextInt();

                    if (parkingLot.parkAt(slot)) {
                        System.out.println(
                            "Car parked successfully in slot "
                            + slot
                        );
                    } else {
                        System.out.println(
                            "Unable to park in slot " + slot
                        );
                    }

                    parkingLot.displayStatus();

                    break;

                case 3:

                    System.out.print(
                        "Enter slot number to leave: "
                    );

                    int leaveSlot = input.nextInt();

                    if (parkingLot.leave(leaveSlot)) {
                        System.out.println(
                            "Car removed successfully."
                        );
                    } else {
                        System.out.println(
                            "Unable to remove car."
                        );
                    }

                    parkingLot.displayStatus();

                    break;

                case 4:

                    parkingLot.displayStatus();

                    break;

                case 5:

                    System.out.println(
                        "Program ended."
                    );

                    break;

                default:

                    System.out.println(
                        "Invalid choice."
                    );
            }

        } while (choice != 5);
        
    }
}
