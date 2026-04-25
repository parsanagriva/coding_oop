import java.io.*;
import java.util.Scanner;

public class p28 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name (e.g., data.txt): ");
        String fileName = sc.nextLine();

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = br.readLine()) != null) {
                lineCount++;

                // Count words
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }

                // Count characters excluding spaces
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) != ' ') {
                        charCount++;
                    }
                }
            }

            System.out.println("\n--- File Details ---");
            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters (excluding spaces): " + charCount);

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException e) {
                System.out.println("Error closing file.");
            }
            sc.close();
        }
    }
}