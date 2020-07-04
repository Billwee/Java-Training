package academy.learnprogramming;

public class VipCustomer {
    private String name;
    private int creditLimit;
    private String email;

    public VipCustomer(){
        this("Default", 1, "default@default.com");
    }

    public VipCustomer(String name, int creditLimit){
        this(name, creditLimit, "email@email.com");
    }

    public VipCustomer(String name, int creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
