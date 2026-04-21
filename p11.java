import java.util.Scanner;

class College {
    private String collegeName;

    College(String collegeName) {
        this.collegeName = collegeName;
    }

    class Admission {
        private String studentName;
        private String course;

        void readData(Scanner sc) {
            System.out.print("Enter student name: ");
            studentName = sc.nextLine();
            System.out.print("Enter course: ");
            course = sc.nextLine();
        }

        void display() {
            System.out.println("\n--- Admission Details ---");
            System.out.println("College Name: " + collegeName);
            System.out.println("Student Name: " + studentName);
            System.out.println("Course: " + course);
        }
    }
}

public class p11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter college name: ");
        String cname = sc.nextLine();

        College college = new College(cname);

        College.Admission admission = college.new Admission();

        admission.readData(sc);
        admission.display();

        sc.close();
    }
}