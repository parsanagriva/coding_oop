import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter weight in pounds: ");
        double weightPounds = sc.nextDouble();

        System.out.print("Enter height in inches: ");
        double heightInches = sc.nextDouble();

        // Conversion to metric units
        double weightKg = weightPounds * 0.45359237;
        double heightMeters = heightInches * 0.0254;

        // BMI calculation
        double bmi = weightKg / (heightMeters * heightMeters);

        // Display result
        System.out.println("Your BMI is: " + bmi);

        sc.close();
    }
}