import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user
        System.out.print("Enter a single letter: ");
        char ch = sc.next().charAt(0);

        // Convert to lowercase for easy comparison
        ch = Character.toLowerCase(ch);

        // Check if input is alphabet
        if (Character.isLetter(ch)) {

            // Check vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("The character is a Vowel.");
            } else {
                System.out.println("The character is a Consonant.");
            }

        } else {
            System.out.println("Invalid input! Please enter an alphabet letter.");
        }

        sc.close();
    }
}