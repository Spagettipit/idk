import java.util.Scanner;

public class Foyer extends Room {
    private static final int CORRECT_CODE = 7589; // Correct code to open the door

    public Foyer(String roomId) {
        super(roomId);
    }

    public void onEnter() {
        Game.print("You are in the Foyer. There's a locked door with a numeric keypad.");

        // Ask the player to input the code
        int enteredCode = askForCode();

        // Check if the entered code is correct
        if (enteredCode == CORRECT_CODE) {
            Game.print("The door unlocks. You can proceed.");
            // Additional actions to progress in the game
        } else {
            Game.print("The door remains locked. Try again or search for clues.");
        }
    }

    private int askForCode() {
        Scanner scanner = new Scanner(System.in);
        int code;

        do {
            Game.print("Enter the 4-digit code:");
            while (!scanner.hasNextInt()) {
                Game.print("Invalid input. Please enter a 4-digit number:");
                scanner.next();
            }
            code = scanner.nextInt();
        } while (code < 1000 || code > 9999); // Ensure it's a 4-digit number

        return code;
    }
}

