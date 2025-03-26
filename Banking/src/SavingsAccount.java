public class SavingsAccount extends BankAccount
{

    public SavingsAccount(String accountNumber, double balance)
    {
        super(accountNumber,balance);
    }
    @Override
    public void withdraw(double amount)
    {
        double currentBalance = getBalance();
        if(currentBalance>amount)
        {
            System.out.println("Withdrawing " + amount+ " from your account.");

        }
    }


}
