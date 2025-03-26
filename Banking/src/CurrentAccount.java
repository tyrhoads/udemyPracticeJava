public class CurrentAccount extends BankAccount
{
    private final double overDraftLimits;

    public CurrentAccount(String accountNumber, double balance, double overDraftLimits)
    {
        super(accountNumber, balance);
        this.overDraftLimits = overDraftLimits;
    }

    @Override
    public void withdraw(double amount)
    {
        double currentBalance = getBalance();
        if(currentBalance + overDraftLimits > amount)
        {
            System.out.println("Withdrawing " + amount+ " from your account.");
            deposit(-amount);

        }
        else
        {
            System.out.println("Exceeds overdraft limit.");
        }
    }
}
