package day20_string_manipulation;

import java.util.Locale;

public class StringContains {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word.contains("v")); //true
        System.out.println(word.contains("ja")); //true
        System.out.println(word.contains("jv")); //false
        System.out.println(word.contains("Ja")); //false
        System.out.println(word.contains("a")); //true

        String company = "Capitol one";
        System.out.println(company.contains("i")); //true
        System.out.println(company.contains("itol")); //true
        System.out.println(company.contains("l o")); //true

        // if company contains space, print"with multiple word company name
        //else "single word name'

        if(company.contains(" ")) {
            System.out.println("with multiple words company name"); //run
        }else{
            System.out.println("single word name");
        }
        String etsyTitle = "Wooden spoon | Etsy";
        if(etsyTitle.contains(" | ")) {
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }

        String firstName = "ahmed";
        if(firstName.contains("a") && firstName.contains("e")) {
            System.out.println("That's right"); //run
        }else{
            System.out.println("Wrong name");
        }

        String email = "canym83@mail.ru";
        if (email.contains("@") && email.endsWith(".com")) {
            System.out.println("valid email");
        }else{
            System.out.println(" invalid email"); //run
        }
        if(email.toLowerCase().contains("y")) {
            System.out.println("y is present");
        }else{
            System.out.println("y is not present");
        }
    }
}
