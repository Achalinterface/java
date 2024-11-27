package Task_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileEncryptionDecryption {
	public static void main(String[] args) {
		System.out.println("Enter Choose");
		System.out.println("1. Encryption");
		System.out.println("2. Decryption");
		int option = getUserChoice();

		System.out.print("Enter the file name or path : ");
		String fileName = getUserInput();

		switch (option) {
		case 1:
			encryptFile(fileName);
			break;

		case 2:
			decryptFile(fileName);
			break;

		default:
			throw new IllegalArgumentException("Unexpected value: " + option);
		}

	}

	private static int getUserChoice() {
		int choice = -1;
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			choice = Integer.parseInt(reader.readLine());
		} catch (IOException | NumberFormatException e) {
			e.printStackTrace();
		}
		return choice;
	}

	private static String getUserInput() {
		String input = "";
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			input = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return input;
	}

	private static void decryptFile(String fileName) {
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName));
				BufferedWriter writer = new BufferedWriter(new FileWriter("decrypted_" + fileName))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String decryptedLine = decrypt(line);
				writer.write(decryptedLine);
				writer.newLine();
			}
			System.out.println("File decryption successfully.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void encryptFile(String fileName) {
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName));
				BufferedWriter writer = new BufferedWriter(new FileWriter("encryption_" + fileName))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String encryptedLine = encrypt(line);
				writer.write(encryptedLine);
				writer.newLine();
			}
			System.out.println("File encryption successfully.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static String decrypt(String input) {
		StringBuilder decrypted = new StringBuilder();
		for (char c : input.toCharArray()) {
			decrypted.append((char) (c - 1));
		}
		return decrypted.toString();
	}

	private static String encrypt(String input) {
		StringBuilder encrypted = new StringBuilder();
		for (char c : input.toCharArray()) {
			encrypted.append((char) (c + 1));
		}
		return encrypted.toString();
	}
}