package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList1 = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
//        printInstructions();

        while(!quit){
            printInstructions();
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList1.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("\nPress...");
        System.out.println("0: To print choice options");
        System.out.println("1: To print the list of groceries");
        System.out.println("2: Add an item to the grocery list");
        System.out.println("3: Change an item on the grocery list");
        System.out.println("4: Remove an item from the grocery list");
        System.out.println("5: Search for an item on the grocery list");
        System.out.println("6: Quit the application");
    }

    public static void addItem(){
        System.out.println("Please enter the grocery item: ");
        groceryList1.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.println("Enter item name: ");
        String currentItem = scanner.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList1.modifyGroceryItem(currentItem, newItem);
    }

    public static void removeItem(){
        System.out.println("Enter item name to remove: ");
        String itemName = scanner.nextLine();
        groceryList1.removeGroceryItem(itemName);
    }

    public static void searchForItem(){
        System.out.println("Enter item to search for: ");
        String searchItem = scanner.nextLine();
        if(groceryList1.onFile(searchItem)){
            System.out.println("Found " + searchItem + " in grocery list.");
        } else {
            System.out.println(searchItem + " is not on the grocery list");
        }
    }

    // Copying the array without a loop
    public static void processArrayList(){
        //First way
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList1.getGroceryList());

        //Second way
        ArrayList<String> nextArray = new ArrayList<String>(groceryList1.getGroceryList());

        //Taking contents of array and converting to ArrayList
        String[] myArray = new String[groceryList1.getGroceryList().size()];
        myArray = groceryList1.getGroceryList().toArray(myArray);

    }



}
