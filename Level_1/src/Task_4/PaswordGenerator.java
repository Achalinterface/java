package Task_4;

import java.util.Random;
import java.util.Scanner;

public class PaswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of pasword: ");
        int length = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Include Numbers? (y/n): ");
        boolean IncludeNumber = scanner.nextLine().equalsIgnoreCase("y");

        System.out.print("Include Lowercase letters? (y/n): ");
        boolean IncludeLowercase = scanner.nextLine().equalsIgnoreCase("y");

        System.out.print("Include Uppercase letters? (y/n): ");
        boolean IncludeUppercase = scanner.nextLine().equalsIgnoreCase("y");

        System.out.print("Include Special Character? (y/n): ");
        boolean IncludeSpecialCharacter = scanner.nextLine().equalsIgnoreCase("y");

        String password = generatePassword(length, IncludeNumber, IncludeLowercase, IncludeUppercase,
                IncludeSpecialCharacter);

        System.out.println("Generated Password:" + password);
        scanner.close();
    }

    public static String generatePassword(int length, boolean IncludeNumber, boolean IncludeLowercase,
            boolean IncludeUppercase, boolean IncludeSpecialCharacter) {
        String numbers = "0123456789";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String specialCharacter = "~!@#$%^&*({[)}]|;:/,.?";

        StringBuilder builder = new StringBuilder();
        if (IncludeNumber) {
            builder.append(numbers);
        }
        if (IncludeLowercase) {
            builder.append(lowerCase);
        }
        if (IncludeUppercase) {
            builder.append(upperCase);
        }
        if (IncludeSpecialCharacter) {
            builder.append(specialCharacter);
        }

        Random random = new Random();
        StringBuilder passwordBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(builder.length());
            passwordBuilder.append(builder.charAt(randomIndex));
        }
        return passwordBuilder.toString();
    }
}
