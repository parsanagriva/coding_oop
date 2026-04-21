import java.util.Scanner;

class Rectangle {
    double width;
    double height;

    void readData(Scanner sc) {
        System.out.print("Enter width: ");
        width = sc.nextDouble();
        System.out.print("Enter height: ");
        height = sc.nextDouble();
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }

    void display() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        System.out.println("Enter details for Rectangle 1:");
        r1.readData(sc);

        System.out.println("Enter details for Rectangle 2:");
        r2.readData(sc);

        System.out.println("\nRectangle 1:");
        r1.display();

        System.out.println("Rectangle 2:");
        r2.display();

        if (r1.getArea() > r2.getArea()) {
            System.out.println("Rectangle 1 has a larger area.");
        } else if (r1.getArea() < r2.getArea()) {
            System.out.println("Rectangle 2 has a larger area.");
        } else {
            System.out.println("Both rectangles have equal area.");
        }

        sc.close();
    }
}