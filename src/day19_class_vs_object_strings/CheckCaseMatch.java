package day19_class_vs_object_strings;

import java.util.Locale;

public class CheckCaseMatch {
    public static void main(String[] args) {
        String countryCode = "USA";
          //    USA       ==                USA
        if(countryCode.equals(countryCode.toUpperCase() )) { //take word usa and convert it to uppercase USA
            System.out.println("Pass - case is correct"); //will run
        }else{
            System.out.println("Fail - case is incorrect");
        }


    }
}
