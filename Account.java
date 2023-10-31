import java.util.*;
class Account {
    private double balance;
    private double interestRate;
    
    Account(double initialBalance) {
        balance = initialBalance < 0 ? 0 : initialBalance;
        interestRate = 0.03; 
    }
    
    Account() {
       this(0);
    }
    
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    
    void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
            } else {
                System.out.println("Insufficient funds. A $5 penalty will be charged.");
                balance -= (amount + 5); 
            }
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
    
    double getBalance() {
        return balance;
    }
    
    void computeInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest added: $" + interest);
    }

    public static void main(String[] args) {
	int l,n,m;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Initial Balance: $");
	l=s.nextInt();
	System.out.println("enter deposite amount : $" );
	n=s.nextInt();
	System.out.println("Enter withdrawl amount: $" );
	m=s.nextInt();
        Account myAccount = new Account();
        System.out.println("Initial Balance: $" + myAccount.getBalance());
        
        myAccount.deposit(n);
        System.out.println("After deposit: $" + myAccount.getBalance());
        
        myAccount.withdraw(m);
        System.out.println("After withdrawal: $" + myAccount.getBalance());
        
        myAccount.computeInterest();
        System.out.println("After interest: $" + myAccount.getBalance());
    }
}
