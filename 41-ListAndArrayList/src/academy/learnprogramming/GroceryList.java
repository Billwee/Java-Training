package academy.learnprogramming;

import java.util.ArrayList;

public class GroceryList {
    //This is a normal array declaration
//    private int[] myNumbers = new int[50];

    //This is an ArrayList -- it's able to change size on the fly and it can hold objects
    //You don't define the type the same way as defining an array. It's defined within the carrots.
    //ArrayList is a class. Meaning it can have it's own constructor
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    //When retrieving ArrayList length you use .size(), not .length
    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your list.");
        for(int i = 0; i < groceryList.size(); i++){
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem){
        int position = findItem(currentItem);
        if(position >= 0){
            modifyGroceryItem(position,newItem);
        }
    }

    private void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery item "+ (position + 1) + " has been modified");
    }

    public void removeGroceryItem(String item){
        int position = findItem(item);
        if(position >= 0){
            removeGroceryItem(position);
        }
    }
    private void removeGroceryItem(int position){
//        String theItem = groceryList.get(position); Not needed now
        groceryList.remove(position);
    }
        //Long way
//    public int findItem(String searchItem){
////        'contains' returns true if it's found
//         boolean exists = groceryList.contains(searchItem);
//
//        //'indexOf' returns the index value if found
//        int position = groceryList.indexOf(searchItem);
//
//        if(position >= 0){
//            return groceryList.get(position);
//        }
//        return null;
//    }

    //Now this function will return the index of the grocery item
    private int findItem(String searchItem){
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if(position >= 0){
            return true;
        }
        return false;
    }



}
