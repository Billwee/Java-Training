package academy.learnprogramming;

//
// Create a program that implements a simple mobile phone with the following capabilities.
// Able to store, modify, remove and query contact names.
// You will want to create a separate class for Contacts (name and phone number).
// Create a master class (MobilePhone) that holds the ArrayList of Contacts
// The MobilePhone class has the functionality listed above.
// Add a menu of options that are available.
// Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
// and search/find contact.
// When adding or updating be sure to check if the contact already exists (use name)
// Be sure not to expose the inner workings of the Arraylist to MobilePhone
// e.g. no ints, no .get(i) etc
// MobilePhone should do everything with Contact objects only.
//


import java.util.Scanner;

import static academy.learnprogramming.Contacts.createContact;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("5555555555");

    public static void main(String[] args) {

    boolean flag = false;

    while(!flag){
        System.out.println("\nChoose an option: ");
        System.out.println("1: Print Contacts");
        System.out.println("2: Add New Contact");
        System.out.println("3: Update Existing Contact");
        System.out.println("4: Remove Contact");
        System.out.println("5: Search/Find Contact");
        System.out.println("0: Quit");

        int choice = scanner.nextInt();
        scanner.nextLine();

        //Putting scanner.nextInt() in the switch parameter will break the other scanner inputs.
        //There needs to be a nextLine() after it to separate the inputs going into the other
        //methods.
        switch(choice){
            case 1:
                printContacts();
                break;
            case 2:
                addContact();
                break;
            case 3:
                updateContact();
                break;
            case 4:
                removeContact();
                break;
            case 5:
                searchContact();
                break;
            case 0:
                flag = true;
                break;
            default:
                System.out.println("Invalid Entry");
                break;
        }
    }
    }
    private static void printContacts(){
        mobilePhone.printContacts();
    }

    private static void addContact(){
        System.out.println("Enter name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter number: ");
        String number = scanner.nextLine();
        System.out.println("name: " + newName + " Number: " + number);

        //Calling the static function to create a new object to pass to addContact
        Contacts newContact = Contacts.createContact(newName, number);
        //Using the boolean from the add function method for a conditional
        if(mobilePhone.addContact(newContact)){
            System.out.println("New Contact Added.");
        }else{
            System.out.println("Error adding new contact - already on file");
        }
    }

    private static void updateContact(){
        System.out.println("Enter name of contact to update");
        String oldContactName = scanner.nextLine();
        Contacts oldContact = mobilePhone.queryContact(oldContactName);

        if(oldContact == null){
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Enter new name of contact");
        String newName = scanner.nextLine();
        System.out.println("Enter new number of contact");
        String newNumber = scanner.nextLine();

        Contacts newContact = createContact(newName, newNumber);

        if(mobilePhone.queryContact(newContact) != null){
            System.out.println("Contact already exists");
            return;
        }

        mobilePhone.updateContact(oldContact,newContact);

    }

    private static void removeContact(){
        System.out.println("Enter name of contact to remove");
        String oldContactName = scanner.nextLine();
        Contacts oldContact = mobilePhone.queryContact(oldContactName);

        if(oldContact == null){
            System.out.println("Contact not found");
            return;
        }
        if(mobilePhone.removeContact(oldContact)){
            System.out.println("Contact removed successfully");
        }else{
            System.out.println("Error removing contact");
        }
    }

    private static void searchContact(){
        System.out.println("Enter name of contact to search");
        String searchName = scanner.nextLine();

        Contacts searchResult = mobilePhone.queryContact(searchName);

        if(searchResult == null){
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Results: \nName: " + searchResult.getName() + " \nNumber: " + searchResult.getNumber());
    }
}
