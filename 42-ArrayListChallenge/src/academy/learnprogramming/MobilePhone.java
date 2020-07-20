package academy.learnprogramming;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    //ArrayList of type Contacts called myContacts
    private ArrayList<Contacts> myContacts;

    //Constructor for each individual phone
    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contacts>();
    }

    public void printContacts(){
        System.out.println("List of Contacts:");
        for(int i = 0; i < myContacts.size(); i++){
            System.out.println((i+1) + ". " + this.myContacts.get(i).getName() + " - " + this.myContacts.get(i).getNumber());
        }
    }

    //Adding a contact. Returning a boolean to show success or not
    public boolean addContact(Contacts contact){
        //Conditional seeing if contact exists or not
        if(findContact(contact.getName()) >= 0){
            System.out.println("Contact already exists");
            return false;
        }
        this.myContacts.add(contact);
        return true;
    }
    //This boolean method uses two contacts passed as parameters to update a contact
    // in the ArrayList.
    public boolean updateContact(Contacts oldContact, Contacts newContact){
        //Uses findContact to get the index of the contact to update
        int oldPosition = findContact(oldContact);
        if(oldPosition < 0){
            System.out.println(oldContact.getName() + " not found");
            return false;
        }else if(this.myContacts.contains(newContact)){
            System.out.println("Contact already exists");
        }
        this.myContacts.set(oldPosition, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contacts contact){
        //Conditional seeing if contact exists or not
        if(findContact(contact) < 0){
            System.out.println("Contact doesn't exist");
            return false;
        }
        this.myContacts.remove(findContact(contact));
        System.out.println(contact.getName() + " was removed");
        return true;
    }

    public String queryContact(Contacts contact){
        if(findContact(contact) >= 0){
            return contact.getName();
        }
        return null;
    }

    public Contacts queryContact(String contactName){
        if(findContact(contactName) < 0){
            System.out.println("Contact not found");
            return null;
        }
        return this.myContacts.get(findContact(contactName));
    }

    //Private method that uses the contact for a search and returns its index as int
    private int findContact(Contacts contact){
        return this.myContacts.indexOf(contact);
    }

    ////Private method that uses the contact for a search and returns its index as int
    private int findContact(String contactName){
        //Looping through the ArrayList and creating a copy of the current contact by index,
        //then seeing if it equals the contact passed as a parameter. if so return the index.
        // if not return -1
        for(int i = 0; i < this.myContacts.size(); i++){
            Contacts contactCopy = this.myContacts.get(i);
            if(contactCopy.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }


}
