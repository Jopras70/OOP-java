package banking;

public class Bank {
    private Customer[] customers = new Customer[15];
    private int numberOfCustomers;
    private String bankName;
    private int currentLoggedIn;
    
    // Constructor
    public Bank(String bName){
        this.bankName = bName;
        this.numberOfCustomers = 0;
    }
    
    // Function to add a new customer
    public void addCustomer(String f, String l, String pin){
        customers[numberOfCustomers] = new Customer(f,l, pin);
        numberOfCustomers = numberOfCustomers + 1;
    }
    
    // Getter for numberOfCustomers
    public int getNumOfCustomers(){
        return numberOfCustomers;
    }
    
    // Getter for currentLoggedIn
    public int getUserIndex(){
        return currentLoggedIn;
    }
    
    // Getter for customers
    public Customer getCustomer(int index){
        return customers[index];
    }
    
    // Function to handle signing in process
    public boolean signIn(String f, String l, String pin){
        for(int i=0; i<numberOfCustomers; i++){
            if(customers[i].getFirstName().equals(f) && 
                customers[i].getLastName().equals(l) && 
                customers[i].getPin().equals(pin) ){
                this.currentLoggedIn = i;
                return true;
            }
        }
        return false;
    }
    
}
