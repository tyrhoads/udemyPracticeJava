import java.util.ArrayList;
import java.util.List;

public class BankService
{

    private InputUtils tool;
    private List<BankAccount> accounts;

    public BankService()
    {
        this.tool = new InputUtils();
        this.accounts = new ArrayList<>();
    }

    public void createAccount()
    {
        tool.print("Enter account name:");
        String accountNumber = tool.readString();
        tool.print("Please enter starting balance for your account:");
        double balance = tool.readDouble();

        tool.print("Please enter type of account you would like to make:");
        tool.print("1: Saving Account");
        tool.print("2: Current Account");
        tool.print("Enter your choice");
        int accountType = tool.readInt();

        switch (accountType)
        {
            case 1:
                accounts.add(new SavingsAccount(accountNumber,balance));
                break;
            case 2:
                tool.print("Please add overdraft limit");
                double overDrat = tool.readDouble();
                accounts.add(new CurrentAccount(accountNumber,balance,overDrat));
                break;
            default:
               tool.print("invalid entry");
               break;
        }
        tool.print("Account created");
    }


    private BankAccount findAccount()
    {
        tool.print("Please enter account number");
        String accountNumber = tool.readString();
        for(BankAccount account: accounts)
            {
                if(account.getAccountNumber().equalsIgnoreCase(accountNumber))
                {
                    return account;
                }
            }
        tool.print("Account not found");
        return null;
    }

    public void checkBalance()
    {
        BankAccount currentAccount = findAccount();

        if(currentAccount != null)
        {
            double currentBalance = currentAccount.getBalance();
            tool.print("The current balance for this account is: $" + currentBalance);
        }

    }

    public void withDrawMoney()
    {
        BankAccount currentAccount = findAccount();

        if(currentAccount != null)
        {
            tool.print("Please enter the amount you would like to withdraw from you account: ");
            double amount = tool.readDouble();
            currentAccount.withdraw(amount);
        }
    }

    public void  depositMoney()
    {
        BankAccount currentAccount = findAccount();
        if(currentAccount != null)
        {
            tool.print("Please enter the amount you would like to deposit to your you account: ");
            double amount = tool.readDouble();
            currentAccount.deposit(amount);
        }

    }

}
