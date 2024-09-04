package bankingapp;

public class main {
    public static void main(String[] args) {
        BankAccount Myaccount = new BankAccount("8547961254", "John Doe", 1542.06);

        //check initial balance
        System.out.println("Initial Balance :"+ Myaccount.checkBalance());

        //deposit money
        Myaccount.Deposit(4725.50);

        //withdraw money
        Myaccount.Withdraw(450.00);

        //check final balance
        System.out.println("Final amount : "+Myaccount.checkBalance());

    }
}
