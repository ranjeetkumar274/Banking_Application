package bankingapp;

public class BankAccount {
    //setting up the attributes
    private String accountNumber;
    private String accountHolderName;
    private double balance;


    //constructor to initialize the BankAccount
    public BankAccount(String accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    //method to check the balance
    public double checkBalance(){
        return balance;
    }

    //method to deposite the amount
    public void Deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposit successful. New Balance is : "+ balance);
        }
        else{
            System.out.println("Deposit amount must be positive.");
        }
    }

    //method to withdraw money from account
    public void Withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance is : " + balance);
        }
        else{
            System.out.println("Insufficient funds or Invalid amount.");
        }
    }

}
