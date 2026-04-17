import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter distance in meters: ");
        double meters = sc.nextDouble();

        // Conversion
        double feet = meters * 3.28084;

        // Display result with 2 decimal places
        System.out.printf("Distance in feet: %.2f\n", feet);

        sc.close();
    }
}