package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    Car porsche = new Car();
	    Car holden = new Car();

	    //This is called a setter
	    porsche.setModel("Carrera");

	    //This is a getter
		System.out.println("Model is " +  porsche.getModel());
    }
}
