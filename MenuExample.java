/**public class test {
    // This is a test for git
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MenuExample {
    public static void main(String[] args) {
        // Initialize BufferedReader for keyboard input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String choice;
        boolean running = true;

        while (running) {
            // Display Menu
            System.out.println("\n--- MENU ---");
            System.out.println("1. Say Hello");
            System.out.println("2. Say Goodbye");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            try {
                // Read input using readLine()
                choice = reader.readLine();

                // Process input
                switch (choice) {
                    case "1":
                        System.out.println("Hello!");
                        break;
                    case "2":
                        System.out.println("Goodbye!");
                        break;
                    case "3":
                        System.out.println("Exiting...");
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid option. Try again.");
                }
            } catch (IOException e) {
                System.out.println("Error reading input: " + e.getMessage());
            }
        }
    }
}
