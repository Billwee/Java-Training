package academy.learnprogramming;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    //constructor creation
    public BankAccount(){
        // Calling constructor within constructor to create default values
        // when using 'this' to call the constructor it MUST be the first line for it to work.
        this("234234",12345,"John Smtih","email@email.com","5555555555");
        // ^ this is a call to the constructor below
        System.out.println("Empty constructor called");
    }
    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber){
        System.out.println("Contructor with info called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    //Using constructor to only manually input some values
    public BankAccount(String customerName, String email, String phoneNumber) {
        this("3234",123123,customerName,email,phoneNumber);
    }

    public void setAccountNumber(String number){
        this.accountNumber = number;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }
    public void setBalance(double number){
        this.balance = number;
    }
    public double getBalance(){
        return this.balance;
    }
    public void setCustomerName(String name){
        this.customerName = name;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }
    public void setPhoneNumber(String phone){
        this.phoneNumber = phone;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public void deposit(double deposit){
        System.out.println("You've deposited $" + deposit + " to your account");
        this.balance += deposit;
    }
    public void withdraw(double withdraw){
        if(withdraw > this.balance){
            System.out.println("Insufficient Funds.");
        }else{
            System.out.println("You've withdrawn $" + withdraw + " from your account");
            this.balance -= withdraw;
        }
    }



}
