import java.util.ArrayList;
import java.util.List;

public class UC2_AddPassengerBogies {

    public static void main(String[] args) {

        // Step 1: Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Create ArrayList for Passenger Bogies
        List<String> passengerBogies = new ArrayList<>();

        // Step 3: Add Bogies (Create)
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("\nPassenger bogies after addition:");
        System.out.println(passengerBogies);

        // Step 4: Remove a Bogie (Delete)
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter removing AC Chair:");
        System.out.println(passengerBogies);

        // Step 5: Check Existence (Read)
        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println("\nDoes Sleeper bogie exist? " + exists);

        // Step 6: Final State
        System.out.println("\nFinal passenger bogie list:");
        System.out.println(passengerBogies);

        // Step 7: Continue Program
        System.out.println("\nSystem is ready for further operations...");
    }
}