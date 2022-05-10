public class App {
    public static void main(String[] args) throws Exception {
        // PART 1;
        // BankAccount newAccount = new BankAccount("Cameron", 500);
        // newAccount.deposit(100);
        // newAccount.printAccount();
        BankAccount Jane = new BankAccount("Jane", 5000);
        BankAccount Collin = new BankAccount("Collin", 300);
        Jane.Transfer(Collin, 100);
        Jane.printAccount();
        Collin.printAccount();
    }
}
