import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the password length: ");
        int length = scanner.nextInt();

        
        System.out.print("Include uppercase letters? (true/false): ");
        boolean useUppercase = scanner.nextBoolean();

        
        System.out.print("Include lowercase letters? (true/false): ");
        boolean useLowercase = scanner.nextBoolean();

       
        System.out.print("Include digits? (true/false): ");
        boolean useDigits = scanner.nextBoolean();

        
        System.out.print("Include special characters? (true/false): ");
        boolean useSpecial = scanner.nextBoolean();

        
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String special = "!@#$%^&*()_+-=";

        
        String passwordCharacters = "";
        if (useUppercase) {
            passwordCharacters += upper;
        }
        if (useLowercase) {
            passwordCharacters += lower;
        }
        if (useDigits) {
            passwordCharacters += digits;
        }
        if (useSpecial) {
            passwordCharacters += special;
        }

        
        if (passwordCharacters.isEmpty()) {
            System.out.println("Error: No character types selected!");
            return;
        }

        
        Random random = new Random();
        String password = "";

        for (int i = 0; i < length; i++) {
           
            int index = random.nextInt(passwordCharacters.length());
            password += passwordCharacters.charAt(index);
        }

        
        System.out.println("Generated Password: " + password);
    }
}
