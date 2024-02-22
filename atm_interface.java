import java.util.Scanner;

class Accountinbank {
    private double balance;

    public Accountinbank(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}

class alltimemoney {
    private Accountinbank account;

    public alltimemoney(Accountinbank account) {
        this.account = account;
    }

    public void displayMenu() {
        System.out.println("Welcome to the Codsoft ATM!!!");
        System.out.println("1. Press 1 to Check Balance of your account");
        System.out.println("2. Press 2 to Deposit Amount in your account ");
        System.out.println("3. Press 3 to Withdraw Amount from your account");
        System.out.println("4. Press 4 to Exit");
    }

    public void processTransaction() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double amount;

        while (true) {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance is: Rs. " + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter the deposit amount: Rs. ");
                    amount = scanner.nextDouble();
                    if (amount > 0) {
                        account.deposit(amount);
                        System.out.println("Deposit successful.");
                        System.out.println("New balance is: Rs. " + account.getBalance());
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the withdrawal amount: Rs. ");
                    amount = scanner.nextDouble();
                    if (amount > 0 && account.withdraw(amount)) {
                        System.out.println("Withdrawal successful.");
                        System.out.println("New balance is: Rs. " + account.getBalance());
                    } else {
                        System.out.println("Invalid withdrawal amount or insufficient balance.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the Codsoft ATM. Visit Again!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

	public static void run() {
		
	}
}

public class atm_interface {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your pin:- ");
        int pin = sc.nextInt();
        if(pin == 5858){
        	alltimemoney.run();
        	Accountinbank userAccount = new Accountinbank(50000);
    		alltimemoney atm = new alltimemoney(userAccount);
           atm.processTransaction();
        }
        else {
        	System.out.println("Wrong Pin");
        }
    	
    }
}
