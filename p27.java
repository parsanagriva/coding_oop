import java.io.*;
import java.util.Scanner;

public class p27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FileWriter fw = null;
        BufferedReader br = null;

        try {
            fw = new FileWriter("students.txt");

            System.out.print("Enter number of students: ");
            int n = sc.nextInt();
            sc.nextLine();

            for (int i = 1; i <= n; i++) {
                System.out.println("\nEnter details of student " + i + ":");

                System.out.print("Roll No: ");
                int roll = sc.nextInt();
                sc.nextLine();

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Marks: ");
                double marks = sc.nextDouble();
                sc.nextLine();

                fw.write(roll + " " + name + " " + marks + "\n");
            }

            fw.close();

            System.out.println("\n--- Student Records ---");

            br = new BufferedReader(new FileReader("students.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("File error occurred.");
        } finally {
            try {
                if (fw != null) fw.close();
                if (br != null) br.close();
            } catch (IOException e) {
                System.out.println("Error closing file.");
            }
            sc.close();
        }
    }
}