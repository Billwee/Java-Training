package academy.learnprogramming;

public class PC {
    // case is reserved keyword
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){
        // getTheCase().pressPowerButton();
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        //fancyGraphics!!

        // getMonitor works but isn't needed. We can just access the method directly
        // getMonitor().drawPixelAt(1200,50,"yellow");
        monitor.drawPixelAt(1200,50,"yellow");
    }

    //Switched these getters to private - not needed, just access the directly
//    private Case getTheCase() {
//        return theCase;
//    }
//
//    private Monitor getMonitor() {
//        return monitor;
//    }
//
//    private Motherboard getMotherboard() {
//        return motherboard;
//    }
}
