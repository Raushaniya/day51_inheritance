package day32_arrays_split;
import java.util.*;

public class MallShopping {
    public static void main(String[] args) {
        // arrays:      indexes: 0       1         2          3        4            5
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99}; //values
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};


        System.out.println("-------FIND THE INDEX OF 'Gloves' in item array------");
        //use for loop with condition
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("Gloves")) {
                System.out.println("Gloves found at index " + i);
                break; //-exit for loop
            }
        }
        System.out.println("------Set boolean to true if first 'IPad' is found------");
        boolean ipadExists = false;
        for (String item : items) {
            if (item.equalsIgnoreCase("iPad")) {
                ipadExists = true;
                break;
            }
        }

        System.out.println("iPadExists = " + ipadExists);
        if(ipadExists) {
            System.out.println("We bought the iPad!");
        }else{
            System.out.println("We did not buy iPad");
        }

        System.out.println("-----Report of each shopping item-----");
        /*
        Shoes - $99.99 - #12345
        ......
        iphone - $39.99 - #12350
         */
        for(int i=0;i<items.length;i++){
            System.out.println(items[i] + " - $" + prices[i] + " - #" + itemIDs[i]);
        }

        System.out.println("----- Look for 'Jacket' in items and print all details-----") ;
        /*
        Jacket - $150.0 - #12346
         */
        for(int i=0; i<items.length;i++){
            if(items[i].equalsIgnoreCase("Jacket")){
                System.out.println(items[i] + " - $" + prices[i] + " - #" + itemIDs[i]);
                break; //optional(stop searching after jacket is found
            }
        }

    }
}
