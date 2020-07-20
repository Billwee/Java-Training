package academy.learnprogramming;

public class Contacts {
    private String name;
    private String number;

    //Constructor
    public Contacts(String name, String number) {
        this.name = name;
        this.number = number;
    }

    //Getters
    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    //Creating new contacts with public static method
    //This being static means we can call it without it being attached to a Contacts object.
    public static Contacts createContact( String name, String number){
        return new Contacts(name, number);
    }
}
