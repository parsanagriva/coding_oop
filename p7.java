import java.util.Scanner;

class Employee {
    private String employeeName;
    private double employeeSalary;

    public void readEmployeeData() {
        Scanner sc = new Scanner(System.in);
        employeeName = sc.nextLine();
        employeeSalary = sc.nextDouble();
    }

    public void displayEmployeeData() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Salary: " + employeeSalary);
    }
}

public class p7 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.readEmployeeData();
        emp.displayEmployeeData();
    }
}