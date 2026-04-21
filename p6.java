import java.util.Scanner;




    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

public class p6 {

    double width = 1;
    double height = 1;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose option:");
        System.out.println("1. Use default values (width=1, height=1)");
        System.out.println("2. Enter your own values");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        Rectangle rect;

        if (choice == 1) {
            rect = new Rectangle();
        } else {
            System.out.print("Enter width: ");
            double w = sc.nextDouble();

            System.out.print("Enter height: ");
            double h = sc.nextDouble();

            rect = new Rectangle(w, h);
        }

        System.out.println("\nRectangle Details:");
        System.out.println("Width = " + rect.width);
        System.out.println("Height = " + rect.height);
        System.out.println("Area = " + rect.getArea());
        System.out.println("Perimeter = " + rect.getPerimeter());

        sc.close();
    }
}