package banking;

import java.util.Scanner;

public class Driver {

    // Show menu
    public static void printMenu(){
        System.out.println("\nMAIN MENU : ");
        System.out.print("1. Sign in\n" +
                           "2. Sign up\n" +
                           "3. Exit");
    }
    
    // Show account menu
    public static void printAccountMenu(){
        System.out.println("\nMENU : ");
        System.out.print("1. Check current balance\n" +
                           "2. Withdraw money\n" +
                           "3. Deposit money\n" +
                           "4. Sign Out");
    }
    
    public static void main(String[] args){
        Bank bank = new Bank("Sunflower Bank");
        Scanner s = new Scanner(System.in);
        int mainMenu = 0;
        
        while(mainMenu != 3){
            printMenu();
            System.out.print("\nChoose main menu : ");
            mainMenu = s.nextInt();
            String f, l, pin;
            double init;
            int userId = 1000;
            
            switch(mainMenu){
                case 1:
                    System.out.print("\nFirst name : ");
                    f = s.next();
                    System.out.print("Last name : ");
                    l = s.next();
                    System.out.print("PIN : ");
                    pin = s.next();
                    if(bank.signIn(f, l, pin) == true){
                        System.out.println("\nWelcome, " + f + " " + l + "!");
                        userId = bank.getUserIndex();
                        int accMenu = 0;
                        
                        while(accMenu != 4){
                            printAccountMenu();
                            System.out.print("\nChoose menu : ");
                            accMenu = s.nextInt();
                            double amount;
                        
                            switch(accMenu){
                                case 1:
                                    System.out.println("\nYour current balance : Rp. " + bank.getCustomer(userId).getAccount().getBalance() + "\n");
                                    break;
                                case 2:
                                    System.out.print("Enter amount of money you wish to withdraw : ");
                                    amount = s.nextDouble();
                                    if(bank.getCustomer(userId).getAccount().withdraw(amount) == true){
                                        System.out.println("\nSuccessfully withdrew Rp. " + amount + " from your current balance.\n");
                                    }
                                    else{
                                        System.out.println("\nMoney withdrawal is failed. "
                                                + "\nBefore requesting a withdrawal, please note that: "
                                                + "\n1. Minimum amount of withdrawal is Rp. 50.000 " 
                                                + "\n2. Maximum amount of withdrawal is Rp. 5.000.000 per withdrawal process. " 
                                                + "\n3. Your remaining balance after withdrawal should be at the mimimum of Rp. 100.000 \n");
                                    }
                                    break;
                                case 3:
                                    System.out.print("Enter amount of money to be deposited : ");
                                    amount = s.nextDouble();
                                    if(bank.getCustomer(userId).getAccount().deposit(amount) == true){
                                        System.out.println("\nSuccessfully deposited Rp. " + amount + "\n");
                                    }
                                    else{
                                        System.out.println("\nFailed to deposit money. Please deposit at the minimum amount of Rp.100.000\n");
                                    }
                                    break;
                                case 4:
                                    break;
                            }
                        }
                    }
                    else{
                        System.out.println("\nIncorrect name or PIN, please try again or try signing up.");
                    }
                    
                    break;
                case 2:
                    System.out.print("\nInput your first name : ");
                    f = s.next();
                    System.out.print("Input your last name : ");
                    l = s.next();
                    System.out.print("Input desirable PIN [6 digits] : ");
                    pin = s.next();
                    do{
                        System.out.print("Input first time deposit [minimum Rp. 500.000] : ");
                        init = s.nextDouble();
                        if(init < 500000)
                            System.out.println("First time deposit balance should be at minimum of Rp. 500.000.");
                    }while(init < 500000);
                    bank.addCustomer(f, l, pin);
                    Account account = new Account(init);
                    bank.getCustomer(bank.getNumOfCustomers() - 1).setAccount(account);
                    System.out.println("\nThank you for signing up, " + f + " " + l + "! Please sign in to access your account.\n");
                    break;
                case 3:
                    break;
            }
            
        }
    }
    
}
