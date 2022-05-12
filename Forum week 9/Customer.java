package banking;

public class Customer {
    private String firstName;
    private String lastName;
    private String pin;
    private Account account;
    
    //Constructor
    public Customer(String f, String l, String pin){
        this.firstName = f;
        this.lastName = l;
        this.pin = pin;
    }
    
    //Getter for firstName
    public String getFirstName(){
        return this.firstName;
    }
    
    // Getter for lastName
    public String getLastName(){
        return this.lastName;
    }
    
    // Getter for pin
    public String getPin(){
        return this.pin;
    }
    
    // Getter for account
    public Account getAccount(){
        return this.account;
    }

    // Setter for account
    public void setAccount(Account account){
        this.account = account;
    }
}
