package day23_string_manipulation_while_loop;

import java.util.Locale;

public class ChainingStringMethods {
    public static void main(String[] args) {
        String word = "wooden spoon";

        System.out.println(word.toUpperCase().toLowerCase().length()); //12

        String word1 = "woo den sp oon";
        //remove spaces first then print everything uppercase
        System.out.println(word.replace(" ","").toUpperCase()); //WOODENSPOON

        //selenium.findElement(By.id("hi")).click();

        String city = "ISTANBUL";
        System.out.println(city.substring(0,1).toUpperCase()+city.substring(1)+city.toLowerCase()); //Chicago

        String capitalized = city.substring(0,1).toUpperCase()+city.substring(1)+city.toLowerCase();
        System.out.println("capitalized = " + capitalized);
    }
}
