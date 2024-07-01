package numberguess;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fileencryption {
    public static void main(String[] args) {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Choose any one option: ");
            System.out.println("1. Encrypt");
            System.out.println("2. Decrypt");
            int option = Integer.parseInt(r.readLine());
            System.out.println("Enter the input file path: ");
            String inputFilepath = r.readLine();
            System.out.println("Enter the output file path: ");
            String outputFilepath = r.readLine();
            System.out.println("Enter the encryption key: ");
            int encryptionkey = Integer.parseInt(r.readLine());

            if (option == 1) {
                encryptFile(inputFilepath, outputFilepath, encryptionkey);
                System.out.println("File encrypted successfully.");
            } else if (option == 2) {
                decryptFile(inputFilepath, outputFilepath, encryptionkey);
                System.out.println("File decrypted successfully.");
            } else {
                System.out.println("Invalid option.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for option or encryption key. Please enter a valid integer.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    private static void encryptFile(String inputFilepath, String outputFilepath, int key) throws IOException {
        try (BufferedReader r = new BufferedReader(new FileReader(inputFilepath));
             BufferedWriter w = new BufferedWriter(new FileWriter(outputFilepath))) {
            String line;
            while ((line = r.readLine()) != null) {
                String encryptedLine = encryptString(line, key);
                w.write(encryptedLine);
                w.newLine();
            }
        }
    }

    private static void decryptFile(String inputFilepath, String outputFilepath, int key) throws IOException {
        try (BufferedReader r = new BufferedReader(new FileReader(inputFilepath));
             BufferedWriter w = new BufferedWriter(new FileWriter(outputFilepath))) {
            String line;
            while ((line = r.readLine()) != null) {
                String decryptedLine = decryptString(line, key);
                w.write(decryptedLine);
                w.newLine();
            }
        }
    }

    private static String encryptString(String text, int key) {
        StringBuilder encrypted = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            encrypted.append((char) (c ^ key));
        }
        return encrypted.toString();
    }

    private static String decryptString(String encryptedText, int key) {
        return encryptString(encryptedText, key);
    }
}
