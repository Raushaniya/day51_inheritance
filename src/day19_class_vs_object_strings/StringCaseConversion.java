package day19_class_vs_object_strings;

import java.util.Locale;

public class StringCaseConversion {
    public static void main(String[] args) {
        String company = "Amazon";
        System.out.println(company.toUpperCase(Locale.ROOT));  // AMAZON
        System.out.println("company in uppercase- " + company.toUpperCase(Locale.ROOT));
         
        //change variable company "Amazon" to "AMAZON"
        System.out.println("company = " + company);
        company = company.toUpperCase(Locale.ROOT);
        System.out.println("company = " + company);
        
        
    }
}
