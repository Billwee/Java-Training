package academy.learnprogramming;

public class LivingRoom {
    private int couch;
    private int TV;
    private int coffeeTable;

    public LivingRoom(int couch, int TV, int coffeeTable) {
        this.couch = couch;
        this.TV = TV;
        this.coffeeTable = coffeeTable;
    }

    public int getCouch() {
        return couch;
    }

    public int getTV() {
        return TV;
    }

    public int getCoffeeTable() {
        return coffeeTable;
    }
}
