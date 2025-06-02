import java.io.*;
import java.util.*;

class FileHandling {
    public static void main(String[] args) {
        String filename = "sample.txt";

        // Writing to file
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Hello, this is a test file.");
            System.out.println("File was written successfully!");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        // Reading from file.
        try (BufferedReader reader = new BufferedReader(new FileReader(feroz.c))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("File Content: " + line number);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
