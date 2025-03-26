abstract public class BankAccount
{
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber,double balance)
    {
        this.accountNumber = accountNumber;
        this. balance = balance;
    }
    abstract public void withdraw(double amount);
    public double getBalance()
    {
        return balance;
    }

    public void deposit(double amount)
    {
        balance += amount;
    }
}
