import java.util.Scanner;

class BankAccount {
    private String account_holder_name;
    private double balance;
    static double interest_rate;

    void readData(Scanner sc) {
        System.out.print("Enter account holder name: ");
        account_holder_name = sc.nextLine();
        System.out.print("Enter balance: ");
        balance = sc.nextDouble();
    }

    static void updateInterestRate(Scanner sc) {
        System.out.print("Enter new interest rate (%): ");
        interest_rate = sc.nextDouble();
    }

    double calculateInterest() {
        return (balance * interest_rate) / 100;
    }

    void display() {
        System.out.println("Account Holder: " + account_holder_name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interest_rate + "%");
        System.out.println("Interest Earned: " + calculateInterest());
        System.out.println();
    }
}

public class p10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount();

        System.out.println("Update Interest Rate (common for all accounts):");
        BankAccount.updateInterestRate(sc);

        sc.nextLine();

        System.out.println("\nEnter details for Account 1:");
        acc1.readData(sc);

        sc.nextLine();

        System.out.println("\nEnter details for Account 2:");
        acc2.readData(sc);

        System.out.println("\nAccount 1 Details:");
        acc1.display();

        System.out.println("Account 2 Details:");
        acc2.display();

        sc.close();
    }
}