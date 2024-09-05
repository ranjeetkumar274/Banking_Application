package bankingapp;

import java.util.Scanner;

public class BankingApplication {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(
                "12345","John doe", 1000.00);

        Scanner sc = new Scanner(System.in);
        Boolean exit = false;

        //main loop for the menu
        while(!exit){
            //display the menu options
            System.out.println("Banking Application Menu : ");
            System.out.println("1. Check " +
                    "Balance");
            System.out.println("2. Deposit " +
                    "Money");
            System.out.println("3. Withdraw " +
                    "Money");
            System.out.println("4. Find Your Account Details.");
            System.out.println("5. Exit");
            System.out.println("Choose an " +
                    "option : ");

            //get the users choice
            int choice = sc.nextInt();

            //process the users choice

            switch(choice){
                case 1:
                    System.out.println("Current Balance : " + account.checkBalance());
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    account.Deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    account.Withdraw(withdrawAmount);
                    break;
                case 4:
                    account.displayAccountDetails();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Thank you for using the banking application!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        sc.close();
    }
}
