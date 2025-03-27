public class BankAccountManagementSystem
{
    public static void main(String[] args)
    {
        InputUtils tool = new InputUtils();
        BankService bank = new BankService();

        boolean exit = true;

        while (exit)
        {
            tool.print("1: Create Account.");
            tool.print("2: Deposit Money.");
            tool.print("3: Withdraw Money.");
            tool.print("4: Check Balance.");
            tool.print("5: Exit.");
            int userChoice = tool.readInt();
            switch (userChoice)
            {
                case 1:
                    bank.createAccount();
                    break;
                case 2:
                    bank.depositMoney();
                    break;
                case 3:
                    bank.withDrawMoney();
                    break;
                case 4:
                    bank.checkBalance();
                    break;
                case 5:
                    tool.print("Ending program have a good day");
                    exit = false;
                    break;
                default:
                    tool.print("Option not available try again");
            }

        }

    }
}
