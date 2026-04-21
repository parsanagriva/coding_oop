import java.util.Scanner;

class Employee {
    protected String name;
    protected String department;

    void readData(Scanner sc) {
        System.out.print("Enter employee name: ");
        name = sc.nextLine();
        System.out.print("Enter department: ");
        department = sc.nextLine();
    }

    void displayDetails() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}

class Manager extends Employee {
    int teamSize;
    String projectName;

    void readManagerData(Scanner sc) {
        readData(sc);
        System.out.print("Enter team size: ");
        teamSize = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter project name: ");
        projectName = sc.nextLine();
    }

    @Override
    void displayDetails() {
        System.out.println("\n--- Manager Details ---");
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project: " + projectName);
    }
}

public class p15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee e = new Employee();
        Manager m = new Manager();

        System.out.println("Enter Employee Details:");
        e.readData(sc);

        System.out.println("\nEnter Manager Details:");
        m.readManagerData(sc);

        e.displayDetails();  
        m.displayDetails();  

        sc.close();
    }
}