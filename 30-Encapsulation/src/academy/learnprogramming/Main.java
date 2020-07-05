package academy.learnprogramming;

public class Main {

	// Encapsulation is the act of making fields only accessible within their own classes.
	// It protects variables from exposure in other classes

    public static void main(String[] args) {

//   ///////////////////////////////////////////////////////////
	 Player player = new Player();

	 player.name = "Bill";
	 player.health = 20;
	 player.weapon = "Sword";

	 int damage = 10;

	 player.loseHealth(damage);

	 System.out.println("Remaining health " + player.healthRemaining());

	 damage = 11;

	 // non private fields can be accessed anywhere
	 player.health = 200;

	 player.loseHealth(damage);

	 System.out.println("Remaining health " + player.healthRemaining());
//   ///////////////////////////////////////////////////////////

		EnhancedPlayer player2 = new EnhancedPlayer("Bill", 50,"Sword");
		System.out.println("Initial health is " + player2.getHealth());
    }
}
