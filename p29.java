import java.util.*;

public class p29 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> marks = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks of student " + i + ": ");
            marks.add(sc.nextInt());
        }

        System.out.println("\n--- Marks List ---");
        for (int m : marks) {
            System.out.println(m);
        }

        int max = Collections.max(marks);
        int min = Collections.min(marks);

        System.out.println("\nHighest Marks: " + max);
        System.out.println("Lowest Marks: " + min);

        sc.close();
    }
}