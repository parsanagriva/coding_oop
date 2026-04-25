import java.util.Scanner;

class TablePrinter {

    synchronized void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
            try {
                Thread.sleep(200); // small delay
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
        System.out.println();
    }
}

class TableThread extends Thread {
    private TablePrinter printer;
    private int number;

    TableThread(TablePrinter printer, int number) {
        this.printer = printer;
        this.number = number;
    }

    public void run() {
        printer.printTable(number);
    }
}

public class p25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number for table: ");
        int n1 = sc.nextInt();

        System.out.print("Enter second number for table: ");
        int n2 = sc.nextInt();

        TablePrinter printer = new TablePrinter();

        TableThread t1 = new TableThread(printer, n1);
        TableThread t2 = new TableThread(printer, n2);

        t1.start();
        t2.start();

        sc.close();
    }
}