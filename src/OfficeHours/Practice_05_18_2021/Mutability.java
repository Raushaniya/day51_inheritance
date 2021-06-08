package OfficeHours.Practice_05_18_2021;

import java.util.Locale;

public class Mutability {
    public static void main(String[] args) {
        String one = "java";
        String two = one;
        String three = two.toUpperCase(Locale.ROOT);
        System.out.println(three);
        System.out.println(two==three); // false
        System.out.println(two.toUpperCase(Locale.ROOT)==three);//false
        one= one.substring(2);
        System.out.println(one);
        System.out.println(two);
    }
}
