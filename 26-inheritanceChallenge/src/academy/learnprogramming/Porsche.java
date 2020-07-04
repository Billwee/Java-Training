package academy.learnprogramming;

public class Porsche extends Car{
    private int boxerEngine;
    private int german;
    private int roadService;

    public Porsche(int boxerEngine, int german, int roadService) {
        super("Porsche", "Coupe", 1, 6, 1, 1, 5, 4, 2, 6, true);
        this.boxerEngine = boxerEngine;
        this.german = german;
        this.roadService = roadService;
    }

    public void accelerate(int rate){

        int newVelocity = getCurrentVelocity() + rate;

        if(newVelocity == 0){
            stop();
            changeGear(1);
        }else if( newVelocity > 0 && newVelocity <= 10){
            changeGear(1);
        }else if( newVelocity > 10 && newVelocity <= 30){
            changeGear(2);
        }else if( newVelocity > 30 && newVelocity <= 40){
            changeGear(3);
        }else{
            changeGear(4);
        }

        if(newVelocity > 0){
            changeVelocity(newVelocity,getCurrentDirection());
        }


    }
}
