import java.util.*;

public class p32 {

    // Generic method
    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Integer LinkedList (roll numbers)
        LinkedList<Integer> rollList = new LinkedList<>();

        System.out.print("Enter number of roll numbers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter roll number " + i + ": ");
            rollList.add(sc.nextInt());
        }

        System.out.print("Enter roll number to search: ");
        int searchRoll = sc.nextInt();

        boolean foundRoll = searchElement(rollList, searchRoll);
        System.out.println("Roll number found: " + foundRoll);

        sc.nextLine(); // clear buffer

        // String LinkedList (names)
        LinkedList<String> nameList = new LinkedList<>();

        System.out.print("\nEnter number of names: ");
        int m = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= m; i++) {
            System.out.print("Enter name " + i + ": ");
            nameList.add(sc.nextLine());
        }

        System.out.print("Enter name to search: ");
        String searchName = sc.nextLine();

        boolean foundName = searchElement(nameList, searchName);
        System.out.println("Name found: " + foundName);

        sc.close();
    }
}