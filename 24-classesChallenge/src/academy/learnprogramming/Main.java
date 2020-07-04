package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        //BANK ACCOUNT
        BankAccount billsAccount = new BankAccount("12313", 12312, "Bill Kamberos", "bill@bill.com", "5555555555");
        System.out.println(billsAccount.getBalance());
        System.out.println(billsAccount.getCustomerName());
        System.out.println(billsAccount.getAccountNumber());
        System.out.println(billsAccount.getEmail());


//        bankAccount.setBalance(1321);
//        System.out.println("Balance is: " + bankAccount.getBalance());
//
//
//        bankAccount.setCustomerName("Bill Kamberos");
//        System.out.println("Customer Name: " + bankAccount.getCustomerName());
//
//        bankAccount.withdraw(321.23);
//        System.out.println("Balance is: " + bankAccount.getBalance());
//
//        bankAccount.deposit(500.21);
//        System.out.println("Balance is: " + bankAccount.getBalance());

//        BankAccount otherAccount = new BankAccount("Other", "other@other.com", "555555555");
//        System.out.println(otherAccount.getPhoneNumber() + " name " + otherAccount.getCustomerName());


        // VIP Challenge

        VipCustomer bill = new VipCustomer("Bill", 100000, "bill@bill.com");
        VipCustomer tim = new VipCustomer("Tim", 10);

        System.out.println(bill.getName() + " " + bill.getCreditLimit() + " " + bill.getEmail());
        System.out.println(tim.getName() + " " + tim.getCreditLimit() + " " + tim.getEmail());

        //WALL AREA






    }
}
