import java.util.Scanner;

public class MainParkingSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int mainMenuChoice = 0;

        while (mainMenuChoice != 5) {
            String mainMenu = """

===== MINI PARKING LOT =====
1. Park car in next available slot
2. Park car in a specific slot
3. Remove car from a slot
4. Display parking status
5. Exit
            """;
            
            System.out.println(mainMenu);
            System.out.println("Enter your choice: ");
            mainMenuChoice = input.nextInt();


            switch(mainMenuChoice) {
                case 1 :
                    int nextSlot = MiniParkingFunctions.parkNext();
                    
                    if (nextSlot != -1) {
                    System.out.println("Car parked in slot "+nextSlot);
                    } 
                    else {
                        System.out.println("Parking lot is full.");
                    }
                    MiniParkingFunctions.displayStatus();
                    break;
 
                case 2 :
                    System.out.print("Enter slot number (1-20): ");
                    int slot = input.nextInt();

                    if (MiniParkingFunctions.chooseSlot(slot)) {
                        System.out.println("Car parked in slot " + slot);
                    } 
                    else {
                        System.out.println("Car could not be parked in slot "+ slot);
                    }

                    MiniParkingFunctions.displayStatus();
                    break;

                case 3 :
                    System.out.print("Enter slot number to leave (1-20): ");                   
                    int leaveSlot = input.nextInt();

                    if(MiniParkingFunctions.leaveSlot(leaveSlot)) {
                        System.out.println("Car removed from successfully");
                    } 
                    else {
                        System.out.println("Car could not be removed from slot");
                    }

                    MiniParkingFunctions.displayStatus();
                    break;

                case 4 :
                    MiniParkingFunctions.displayStatus();
                    break;

                case 5 :
                    System.out.println("Thank you. Goodbye.");
                    break;

                default : 
                    System.out.println("Invalid choice. Please choose 1-5.");
                    break;
            }
        }
    }
}

