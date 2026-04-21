import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter side a: ");
        double a = sc.nextDouble();

        System.out.print("Enter side b: ");
        double b = sc.nextDouble();

        System.out.print("Enter side c: ");
        double c = sc.nextDouble();

        // Validate triangle
        if (a + b > c && a + c > b && b + c > a) {

            // Calculate semi-perimeter
            double s = (a + b + c) / 2;

            // Calculate area
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            System.out.println("\nValid Triangle!");
            System.out.println("Area of triangle = " + area);

        } else {
            System.out.println("\nInvalid triangle! The given sides cannot form a triangle.");
        }

        sc.close();
    }
}