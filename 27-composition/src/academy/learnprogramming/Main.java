package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        // Creating a new instance of dimensions to pass to theCase instance
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B", "Dell","240", dimensions);

        // You can also pass the new instance as an parameter in the original instance like this:
        Monitor theMonitor = new Monitor("27inch Beast","Acer",27, new Resolution(2540,1440));

        // Creating the motherboard for the PC
        Motherboard theMotherboard = new Motherboard("BJ-200","Asus",4,6,"v2.44");

        // Initializing a new PC instance with the instances above
        PC thePC = new PC(theCase,theMonitor,theMotherboard);


        // How do we access methods from other classes within this thePC instance?
        // We use the getters from the PC class to access them.
        thePC.getMonitor().drawPixelAt(1500,1200,"red");
        thePC.getMotherboard().loadProgram("Windows 1.0");
        thePC.getTheCase().pressPowerButton();


    }
}
