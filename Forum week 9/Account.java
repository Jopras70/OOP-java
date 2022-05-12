package banking;

public class Account {
    private double balance;
    
    // Constructor
    public Account(double balance){
        this.balance = balance;
    }
    
    // Getter for balance
    public double getBalance(){
        return balance;
    }
    
    
    // Function to handle depositing money
    public boolean deposit(double amount){
        if(amount < 100000)
            return false;
        else{
            balance = balance + amount;
            return true;
        }
    }
   
    // Function to handle money withdrawal
    public boolean withdraw(double amount){
        if((balance - amount < 100000) || (amount < 50000) || (amount > 5000000))
            return false;
        else{
            balance = balance - amount;
            return true;
        }
    }
}
