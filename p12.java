import java.util.Scanner;

class Volume {

    double calculateVolume(double side) {
        return side * side * side;
    }

    double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    double calculateVolumeSphere(double radius) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}

public class p12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Volume v = new Volume();

        System.out.print("Enter side of cube: ");
        double side = sc.nextDouble();

        System.out.print("Enter length, width, height of rectangular cube: ");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        double h = sc.nextDouble();

        System.out.print("Enter radius of sphere: ");
        double r = sc.nextDouble();

        System.out.println("\n--- Volumes ---");
        System.out.println("Cube Volume: " + v.calculateVolume(side));
        System.out.println("Rectangular Cube Volume: " + v.calculateVolume(l, w, h));
        System.out.println("Sphere Volume: " + v.calculateVolumeSphere(r));

        sc.close();
    }
}