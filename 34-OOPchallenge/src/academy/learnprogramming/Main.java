// CHALLENGE
// The purpose of the application is to help a fictitious company called Bills Burgers to manage
// their process of selling hamburgers.
// Our application will help Bill to select types of burgers, some of the additional items (additions) to
// be added to the burgers and pricing.
// We want to create a base hamburger, but also two other types of hamburgers that are popular ones in Bills store.
// The basic hamburger should have the following items.
// Bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
// the customer can select to be added to the burger.
// Each one of these items gets charged an additional price so you need some way to track how many items got added
// and to calculate the final price (base burger with all the additions).
// This burger has a base price and the additions are all separately priced (up to 4 additions, see above).
// Create a Hamburger class to deal with all the above.
// The constructor should only include the roll type, meat and price, can also include name of burger or you
// can use a setter.
// Also create two extra varieties of Hamburgers (subclasses) to cater for
// a) Healthy burger (on a brown rye bread roll), plus two addition items that can be added.
// The healthy burger can have 6 items (Additions) in total.
// hint:  you probably want to process the two additional items in this new class (subclass of Hamburger),
// not the base class (Hamburger), since the two additions are only appropriate for this new class
// (in other words new burger type).
// b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
// hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
// object is created, and then prevent other additions being made.
//  All 3 classes should have a method that can be called anytime to show the base price of the hamburger
// plus all additionals, each showing the addition name, and addition price, and a grand/final total for the
// burger (base price + all additions)
// For the two additional classes this may require you to be looking at the base class for pricing and then
// adding totals to final price.


// MY NOTES
// I needed to break the rules slightly to add levels of validation to this problem. While Tim's solution worked.
// He just added a method for each topping. There was no way to remove toppings, prevent double or mistyped toppings,
// and topping nor prices were hard coded. So adding these things required a max toppings parameter for each constructor.


package academy.learnprogramming;

import java.text.DecimalFormat;

class Burger {
    private String breadType;
    private boolean meat;
    private double basePrice;
    private double price;
    private boolean lettuce;
    private boolean tomato;
    private boolean onion;
    private boolean cheese;
    private boolean egg;
    private boolean avocado;
    private boolean jalapeno;
    private boolean mushrooms;
    private int numberOfToppings;
    private int maxToppings;

    public Burger(String breadType,double basePrice, int maxToppings) {
        this.breadType = breadType;
        this.meat = true;
        this.basePrice = basePrice;
        this.price = basePrice;
        this.maxToppings = maxToppings;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void addTopping(String topping) {
        if (this.numberOfToppings >= this.maxToppings) {
            System.out.println("Maximum of " + maxToppings +" toppings: Remove Topping to replace.");
        } else {
            switch (topping) {
                case "lettuce":
                    if (!lettuce) {
                        numberOfToppings++;
                        this.lettuce = true;
                        this.price += .1;
                        System.out.println("Lettuce added");
                    } else {
                        System.out.println("Lettuce already added");
                    }
                    break;
                case "tomato":
                    if (!tomato) {
                        numberOfToppings++;
                        this.tomato = true;
                        this.price += .3;
                        System.out.println("Tomato added");
                    } else {
                        System.out.println("Tomato already added");
                    }
                    break;
                case "onion":
                    if (!onion) {
                        numberOfToppings++;
                        this.onion = true;
                        this.price += .2;
                        System.out.println("Onion added");
                    } else {
                        System.out.println("Onion already added");
                    }
                    break;
                case "cheese":
                    if (!cheese) {
                        numberOfToppings++;
                        this.cheese = true;
                        this.price += .8;
                        System.out.println("Cheese added");
                    } else {
                        System.out.println("Cheese already added");
                    }
                    break;
                case "egg":
                    if (!egg) {
                        numberOfToppings++;
                        this.egg = true;
                        this.price += 1;
                        System.out.println("Egg added");
                    } else {
                        System.out.println("Egg already added");
                    }
                    break;
                case "avocado":
                    if (!avocado) {
                        numberOfToppings++;
                        this.avocado = true;
                        this.price += 1.2;
                        System.out.println("Avocado added");
                    } else {
                        System.out.println("Avocado already added");
                    }
                    break;
                case "jalapeno":
                    if (!jalapeno) {
                        numberOfToppings++;
                        this.jalapeno = true;
                        this.price += .7;
                        System.out.println("Jalapeno added");
                    } else {
                        System.out.println("Jalapeno already added");
                    }
                    break;
                case "mushroom":
                    if (!mushrooms) {
                        numberOfToppings++;
                        this.mushrooms = true;
                        this.price += .4;
                        System.out.println("Mushroom added");
                    } else {
                        System.out.println("Mushroom already added");
                    }
                    break;
                default:
                    System.out.println("Topping not found..");
                    break;
            }
        }

    }

    public void removeTopping(String topping) {
        if (numberOfToppings == 0) {
            System.out.println("No toppings to remove");
        } else {
            switch (topping) {
                case "lettuce":
                    if (lettuce) {
                        numberOfToppings--;
                        this.lettuce = false;
                        this.price -= .1;
                        System.out.println("Lettuce removed");
                    } else {
                        System.out.println("No lettuce to remove");
                    }
                    break;
                case "tomato":
                    if (tomato) {
                        numberOfToppings++;
                        this.tomato = false;
                        this.price -= .3;
                        System.out.println("Tomato removed");
                    } else {
                        System.out.println("No tomato to remove");
                    }
                    break;
                case "onion":
                    if (onion) {
                        numberOfToppings++;
                        this.onion = false;
                        this.price -= .2;
                        System.out.println("Onion removed");
                    } else {
                        System.out.println("No onion to remove");
                    }
                    break;
                case "cheese":
                    if (cheese) {
                        numberOfToppings++;
                        this.cheese = false;
                        this.price -= .8;
                        System.out.println("Cheese removed");
                    } else {
                        System.out.println("No cheese to remove");
                    }
                    break;
                case "egg":
                    if (egg) {
                        numberOfToppings++;
                        this.egg = false;
                        this.price -= 1;
                        System.out.println("Egg removed");
                    } else {
                        System.out.println("No egg to remove");
                    }
                    break;
                case "avocado":
                    if (avocado) {
                        numberOfToppings++;
                        this.avocado = false;
                        this.price -= 1.2;
                        System.out.println("Avocado removed");
                    } else {
                        System.out.println("No avocado to remove");
                    }
                    break;
                case "jalapeno":
                    if (jalapeno) {
                        numberOfToppings++;
                        this.jalapeno = false;
                        this.price -= .7;
                        System.out.println("Jalapeno removed");
                    } else {
                        System.out.println("No jalapeno to remove");
                    }
                    break;
                case "mushroom":
                    if (mushrooms) {
                        numberOfToppings++;
                        this.mushrooms = false;
                        this.price -= .4;
                        System.out.println("Mushroom removed");
                    } else {
                        System.out.println("No mushroom to remove");
                    }
                    break;
                default:
                    System.out.println("Topping not found..");
                    break;
            }
        }

    }


    public void getPrice() {
        DecimalFormat twoDecimals = new DecimalFormat("#.00");
        System.out.println("Burger base price: $" + twoDecimals.format(this.basePrice));
        System.out.println("Bread type = " + this.breadType);
        if (lettuce) {
            System.out.println("Add lettuce: +$0.10");
        }
        if (tomato) {
            System.out.println("Add tomato: +$0.30");
        }
        if (onion) {
            System.out.println(("Add onion: +$0.20"));
        }
        if (cheese) {
            System.out.println("Add cheese: +$0.80");
        }
        if (egg) {
            System.out.println("Add egg: +$1.00");
        }
        if (avocado) {
            System.out.println("Add avocado: +$1.20");
        }
        if (jalapeno) {
            System.out.println("Add jalapeno: +$0.70");
        }
        if (mushrooms) {
            System.out.println("Add mushroom: +$0.40");
        }
        System.out.println("Total burger cost: $" + twoDecimals.format(price));
    }
}

class HealthyBurger extends Burger {

    public HealthyBurger() {
        super("Brown Rye",4.35,6);
    }

    @Override
    public void addTopping(String topping) {
        super.addTopping(topping);
    }

    @Override
    public void removeTopping(String topping) {
        super.removeTopping(topping);
    }

    @Override
    public void getPrice() {
        super.getPrice();
    }
}

class DeluxeBurger extends Burger{
    public DeluxeBurger() {
        super("White", 6.78, 0);
    }

    @Override
    public void addTopping(String topping) {
        System.out.println("Cannot add/remove items to deluxe burger");
    }

    @Override
    public void removeTopping(String topping) {
        System.out.println("Cannot add/remove items to deluxe burger");
    }

    @Override
    public void getPrice() {
        System.out.println("Deluxe burger with fries and drink: $" + getBasePrice());
    }
}

public class Main {

    public static void main(String[] args) {

        Burger burger1 = new Burger("White",2.70,4);
        burger1.addTopping("lettuce");
        burger1.addTopping("lettuce");
        burger1.addTopping("onion");
        burger1.addTopping("tomato");
        burger1.addTopping("cheese");
        burger1.addTopping("egg");
        burger1.removeTopping("lettuce");
        burger1.addTopping("egg");
        burger1.getPrice();

        System.out.println("///////////////////////////////////////////");

        HealthyBurger healthyBurger = new HealthyBurger();
        healthyBurger.addTopping("lettuce");
        healthyBurger.addTopping("lettuce");
        healthyBurger.addTopping("onion");
        healthyBurger.addTopping("murtghbndrst");
        healthyBurger.addTopping("tomato");
        healthyBurger.addTopping("cheese");
        healthyBurger.addTopping("egg");
        healthyBurger.addTopping("jalapeno");
        healthyBurger.addTopping("jalapeno");
        healthyBurger.getPrice();

        System.out.println("////////////////////////////////////////////");

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addTopping("lettuce");
        deluxeBurger.removeTopping("lettuce");
        deluxeBurger.getPrice();
    }
}
