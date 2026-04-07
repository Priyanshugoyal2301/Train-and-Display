import java.util.ArrayList;
import java.util.List;

public class UC1_TrainConsistInitialization {

    public static void main(String[] args) {

        // Step 1: Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Initialize Train Consist
        List<String> trainConsist = new ArrayList<>();

        // Step 3: Display Initial State
        System.out.println("Train consist initialized.");
        System.out.println("Initial number of bogies: " + trainConsist.size());

        // Step 4: Ready for next operations
        System.out.println("System is ready for further operations...");
    }
}