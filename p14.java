import java.util.Scanner;

class BankAccount {
    protected String accountNumber;
    protected String accountHolderName;
    protected double balance;

    void openAccount(Scanner sc) {
        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextLine();
        System.out.print("Enter Account Holder Name: ");
        accountHolderName = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();
    }

    void deposit(Scanner sc) {
        System.out.print("Enter amount to deposit: ");
        double amt = sc.nextDouble();
        balance += amt;
    }

    void withdraw(Scanner sc) {
        System.out.print("Enter amount to withdraw: ");
        double amt = sc.nextDouble();
        if (amt <= balance) {
            balance -= amt;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

class SavingAccount extends BankAccount {
    double interestRate;

    void calculateInterest() {
        System.out.print("Enter interest rate (%): ");
        Scanner sc = new Scanner(System.in);
        interestRate = sc.nextDouble();
        double interest = (balance * interestRate) / 100;
        System.out.println("Interest Earned: " + interest);
    }
}

class FixedDepositAccount extends BankAccount {
    double rate;
    int time;

    void maturityAmount() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter interest rate (%): ");
        rate = sc.nextDouble();
        System.out.print("Enter time (years): ");
        time = sc.nextInt();

        double maturity = balance + (balance * rate * time) / 100;
        System.out.println("Maturity Amount: " + maturity);
    }
}

public class p14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SavingAccount sa = new SavingAccount();
        FixedDepositAccount fd = new FixedDepositAccount();

        System.out.println("Enter Saving Account Details:");
        sa.openAccount(sc);
        sc.nextLine();

        sa.deposit(sc);
        sa.withdraw(sc);
        sa.checkBalance();
        sa.calculateInterest();

        sc.nextLine();

        System.out.println("\nEnter Fixed Deposit Account Details:");
        fd.openAccount(sc);
        sc.nextLine();

        fd.deposit(sc);
        fd.checkBalance();
        fd.maturityAmount();

        sc.close();
    }
}