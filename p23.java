import java.util.Scanner;

class NumberThread extends Thread {
    private int start, end, delay;
    private String name;

    NumberThread(String name, int start, int end, int delay) {
        this.name = name;
        this.start = start;
        this.end = end;
        this.delay = delay;
    }

    public void run() {
        try {
            for (int i = start; i <= end; i++) {
                System.out.println(name + ": " + i);
                Thread.sleep(delay);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " interrupted");
        }
    }
}

public class p23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start and end for Thread 1: ");
        int s1 = sc.nextInt();
        int e1 = sc.nextInt();

        System.out.print("Enter delay for Thread 1 (ms): ");
        int d1 = sc.nextInt();

        System.out.print("Enter start and end for Thread 2: ");
        int s2 = sc.nextInt();
        int e2 = sc.nextInt();

        System.out.print("Enter delay for Thread 2 (ms): ");
        int d2 = sc.nextInt();

        NumberThread t1 = new NumberThread("Thread 1", s1, e1, d1);
        NumberThread t2 = new NumberThread("Thread 2", s2, e2, d2);

        t1.start();
        t2.start();

        sc.close();
    }
}