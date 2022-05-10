import java.util.Scanner;

public class BankAccount {
    public static Scanner scanner = new Scanner(System.in);
    private String AccountHolderName;
    private double Balance;

    public BankAccount(String customerName, double customerBalance) {
        this.Balance = customerBalance;
        this.AccountHolderName = customerName;
    }
    public double Transfer(BankAccount obj, double amount) {
        return obj.deposit(this.withdrawal(amount));
    }
    
    public void deposit() {
        System.out.println("Please enter an amount to add to your bank account:");
        double bankDeposit = scanner.nextInt();
        Balance = bankDeposit + Balance;
        System.out.println("Your new balance is " + Balance);
        
    }
    public double deposit(double amount) {
        Balance += amount;
        return amount;
    }
    public void withdrawal() {
        System.out.println("Please enter an amount to withdrawal from your bank account:");
        double bankWithdrawal = scanner.nextInt();
        Balance = Balance - bankWithdrawal;
        System.out.println("Your new balance is "+Balance);
    }
    public double withdrawal(double amount) {
        Balance -= amount;
        return amount;
    }
    public void printAccount() {
        System.out.println(AccountHolderName+ "'s account balance is: $"+Balance);
    }
}
