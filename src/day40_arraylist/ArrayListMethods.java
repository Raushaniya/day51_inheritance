package day40_arraylist;
import java.util.*;

public class ArrayListMethods {
    public static void main(String[] args) {
        List<String>shoppingList = new ArrayList<>();
        System.out.println("size= " + shoppingList.size());
        System.out.println("isEmpty?= " + shoppingList.isEmpty());

        if(shoppingList.isEmpty()){
            System.out.println("List is empty,keep coding java");
        }else{
            System.out.println("List is not empty, code java and then go to mall");
        }

        shoppingList.add("shoes");
        shoppingList.add("cheap monitor");
        shoppingList.add("mask");
        shoppingList.add("wooden spoon");
        shoppingList.add("scooter");
        shoppingList.add("Java book");
        shoppingList.add("potato");

        if(shoppingList.isEmpty()){
            System.out.println("List is empty,keep coding java");
        }else{
            System.out.println("List is not empty, code java and then go to mall");
        }

        //number of values
        int count = shoppingList.size();
        System.out.println("Items to buy = " + count);

        System.out.println("is mask in my list? " + shoppingList.contains("mask"));
        if(shoppingList.contains("mask")){
            System.out.println("Mask is in the list");
        }else{
            System.out.println("Mask is not in the list");
        }

        System.out.println("Buying mask ...$10");

        shoppingList.remove("mask");
        System.out.println("list= "+shoppingList);


    }

}
