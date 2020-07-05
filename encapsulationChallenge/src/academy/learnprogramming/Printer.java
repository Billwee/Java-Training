package academy.learnprogramming;

public class Printer {
    private int tonerLevel = 100;
    private int numberOfPages;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter) {
        if(tonerLevel > 0 && tonerLevel <=100){
            this.tonerLevel = tonerLevel;
        }
        this.duplexPrinter = duplexPrinter;
    }

    public void fillToner(){
        this.tonerLevel = 100;
        System.out.println("Toner refilled to 100%");
    }

    public void printPages(int pages){
        this.numberOfPages += pages;
        this.tonerLevel -= 1;
        System.out.println("Printed a total of " + this.numberOfPages + " pages");
        System.out.println("You have " + tonerLevel + "% toner left");
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }
}
