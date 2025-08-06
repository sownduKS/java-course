import java.util.Scanner;
public class login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Password must be at least 8 characters long and contain at least one special character.");
        }

        scanner.close();
    }

    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }

        String specialChars = "!@#$%^&*()-_=+[]{}|;:',.<>?/";
        for (char ch : password.toCharArray()) {
            if (specialChars.contains(String.valueOf(ch))) {
                return true;
            }
        }

        return false;
    }
}
