import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("=====IOB BANK=====");
        System.out.println("Account Creation");
        System.out.println("Accountholder's Name: ");
        String accountHolder = sc.next();
        System.out.println("Account Number: ");
        int accountNumber = sc.nextInt();
        System.out.println("Account Balance: ");
        double balance = sc.nextDouble();
        while(balance<1000)
        {
            System.out.println("Minimum Balance needs to be 1000 to create an account");
            System.out.println("Account Balance: ");
            balance = sc.nextDouble();
        }
        BankAccount account1 = new BankAccount(accountHolder,accountNumber,balance);
        int choice = 0;
        do
        {
            System.out.println("=====MENU=====");
            System.out.println();
            System.out.println("1.Account Details:");
            System.out.println("2.Deposit:");
            System.out.println("3.Withdraw:");
            System.out.println("4.Balance:");
            System.out.println("5.Transactions:");
            System.out.println("6.Exit:");
            System.out.println();
            System.out.println("Enter your choice: ");
            if(sc.hasNextInt())
            {
                choice = sc.nextInt();
            }
            else {
                sc.next();
                System.out.println("Please enter a number");
                continue;
            }
            switch(choice)
            {
                case 1:
                    account1.displayAccountDetails();
                    break;

                case 2:
                    System.out.println("Enter amount: ");
                    double deposit = sc.nextDouble();
                    account1.deposit(deposit);
                    break;

                case 3:
                    System.out.println("Enter amount: ");
                    double withdraw = sc.nextDouble();
                    account1.withdraw(withdraw);
                    break;

                case 4:
                    System.out.println(account1.balance);
                    break;

                case 5:
                    account1.transactionDisplay();
                    break;

                case 6:
                    System.out.println("Thanks for using our Service");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }
        while(choice!=6);
    }
}