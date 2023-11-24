package login_section;
import java.util.Scanner;

public class LogOut {

    private static String[] usernames = {"user1", "user2", "user3"};
    private static String[] passwords = {"password1", "password2", "password3"};
    private static boolean isLoggedIn = false;
    private static String currentUser;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (!isLoggedIn) {
                // User is not logged in
                System.out.print("Enter username: ");
                String username = scanner.nextLine();

                System.out.print("Enter password: ");
                String password = scanner.nextLine();

                if (login(username, password)) {
                    isLoggedIn = true;
                    currentUser = username;
                    System.out.println("Login success!");
                } else {
                    System.out.println("Login failed. Please try again.");
                }
            } else {
                // User is logged in
                System.out.println("Logout? (yes/no): ");
                String choice = scanner.nextLine().toLowerCase();

                if (choice.equals("yes")) {
                    isLoggedIn = false;
                    currentUser = null;
                    System.out.println("Logout successful!");
                } else {
                    System.out.println("Invalid choice. Please enter 'yes' or 'no'.");
                }
            }
        }
    }

    private static boolean login(String enteredUsername, String enteredPassword) {
        // Check if the provided username and password match any stored credentials
        for (int i = 0; i < usernames.length; i++) {
            if (usernames[i].equals(enteredUsername) && passwords[i].equals(enteredPassword)) {
                return true; // Login success
            }
        }
        return false; // Login failed
    }
}
