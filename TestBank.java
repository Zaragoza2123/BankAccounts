
public class TestBank{
    public static void main(String[] args)
    {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();
        BankAccount account4 = new BankAccount();

        account1.deposit();
        account1.deposit();
        account1.withdraw();
        account1.withdraw();
        account1.checkBalance();
    }
}