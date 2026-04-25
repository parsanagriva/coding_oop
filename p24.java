import java.util.Scanner;

class NumberThread extends Thread {
    private int start, end;
    private String name;

    NumberThread(String name, int start, int end) {
        this.name = name;
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(name + ": " + i);
        }
    }
}

public class p24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start and end for T1: ");
        int s1 = sc.nextInt();
        int e1 = sc.nextInt();

        System.out.print("Enter start and end for T2: ");
        int s2 = sc.nextInt();
        int e2 = sc.nextInt();

        System.out.print("Enter start and end for T3: ");
        int s3 = sc.nextInt();
        int e3 = sc.nextInt();

        NumberThread t1 = new NumberThread("T1", s1, e1);
        NumberThread t2 = new NumberThread("T2", s2, e2);
        NumberThread t3 = new NumberThread("T3", s3, e3);

        try {
            t1.start();
            t1.join();   // wait until T1 finishes

            t2.start();
            t2.join();   // wait until T2 finishes

            t3.start();
            t3.join();   // wait until T3 finishes

        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }

        sc.close();
    }
}