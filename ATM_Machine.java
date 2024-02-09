import java.util.Scanner;

// BankAccount class to represent the user's bank account

class BankAccount 
{
    	private double balance;

    	public BankAccount(double initialBalance)

	{
        	this.balance = initialBalance;
    	}

    	public double getBalance() 
	{
        	return balance;
    	}

    	public void deposit(double amount) 
	{
        	balance += amount;
    	}

    	public boolean withdraw(double amount) 

	{
        	if (amount <= balance) 

		{
            		balance -= amount;
            		return true;
        	} else 

		{
            		return false; // Insufficient balance
        	}
    	}
}

// ATM class to represent the ATM machine

class ATM
{
	private BankAccount userAccount;

   	public ATM(BankAccount userAccount) 
	{
        	this.userAccount = userAccount;
    	}

    	public void displayMenu() 
	{
        	System.out.println("1. Withdraw");
       		System.out.println("2. Deposit");
        	System.out.println("3. Check Balance");
        	System.out.println("4. Exit");
    	}

    	public void performTransaction(int choice, Scanner scanner) 
	{
        	switch (choice) 
		{
            	case 1:
                	System.out.print("Enter withdrawal amount: ");
                	double withdrawAmount = scanner.nextDouble();
                	if (userAccount.withdraw(withdrawAmount)) {
                    	System.out.println("Withdrawal successful. Remaining balance: " + userAccount.getBalance());
                } else 
		{
                    System.out.println("Insufficient balance. Withdrawal failed.");
                }
                break;
            	
		case 2:
                	System.out.print("Enter deposit amount: ");
                	double depositAmount = scanner.nextDouble();
                	userAccount.deposit(depositAmount);
                	System.out.println("Deposit successful. Updated balance: " + userAccount.getBalance());
                	break;
  
	        case 3:
                	System.out.println("Current balance: " + userAccount.getBalance());
                	break;
      
		case 4:
                	System.out.println("Exiting. Thank you!");
                	System.exit(0);
                	break;
            	default:
                	System.out.println("Invalid choice. Please choose a valid option.");
        	}
    	}
}

public class ATM_Machine
{
	public static void main(String[] args)
	{
        	// Initialize user's bank account with an initial balance
       
		 BankAccount userAccount = new BankAccount(1000.0);

        	// Initialize ATM with the user's bank account
        	ATM atm = new ATM(userAccount);

        Scanner scanner = new Scanner(System.in);

        while (true) 
	{
            	// Display ATM menu
            	atm.displayMenu();

            	// Get user's choice
            	System.out.print("Enter your choice: ");
            	int choice = scanner.nextInt();

            	// Perform the selected transaction
            	atm.performTransaction(choice, scanner);
        }
    }
}