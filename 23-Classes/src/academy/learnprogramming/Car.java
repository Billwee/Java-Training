package academy.learnprogramming;

public class Car {
    // variable in a class are known as fields
    // private means you can only access/change the value from within it's origin class.
    // public gives access to modification outside of it's origin.
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    //This is called a setter
    public void setModel(String model){

        // input validation - only allows porsche or holden to be entered
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")){
            this.model = model;
        }else{
            this.model = "Unknown";
        }
    }

    //This is called a getter
    public String getModel(){
        return this.model;
    }


}
