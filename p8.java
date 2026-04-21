import java.util.Scanner;

class Point {
    private int x;
    private int y;

    Point() {
        x = 5;
        y = 5;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    void readPoint() {
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
    }

    void display() {
        System.out.println("Point: (" + x + ", " + y + ")");
    }
}

public class p8 {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.display();

        Point p2 = new Point();
        p2.readPoint();
        p2.display();

        Point p3 = new Point(p2);
        p3.display();
    }
}