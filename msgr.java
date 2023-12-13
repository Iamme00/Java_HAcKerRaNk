import java.util.Scanner;

// Step 1: Define the MessageSender interface
interface MessageSender {
    void sendMessage(String recipient, String message);
}

// Step 2: Implement the interface in a class
class Messenger implements MessageSender {
    // Implementation of the sendMessage method
    @Override
    public void sendMessage(String recipient, String message) {
        System.out.println("Sending message to " + recipient + ": " + message);
    }
}

// Step 3: Use the interface through the implementing class
public class msgr {
    public static void main(String[] args) {
        // Create a messenger object
        Messenger myMessenger = new Messenger();

        // Get user input for message
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter recipient's name: ");
        String recipient = scanner.nextLine();
        System.out.print("Enter your message: ");
        String userMessage = scanner.nextLine();

        // Send and display the user's message
        myMessenger.sendMessage(recipient, userMessage);

        // Close the scanner
        scanner.close();
    }
}
