package day19_class_vs_object_strings;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Chicago";
        //equals() method - case sensitive comparison
        System.out.println(city.equals("Chicago")); // true
        System.out.println(city.equals("chicago")); // false (lowercase)
        System.out.println(city.equals("Chicago ")); // false (it has space at the end

        //equals ignore case method - case insensitive comparison
        System.out.println(city.equalsIgnoreCase("Chicago")); //true
        System.out.println(city.equalsIgnoreCase("chicago")); // true
        System.out.println(city.equalsIgnoreCase("CHICAGO")); //true
        System.out.println(city.equalsIgnoreCase("ChiCaGo")); //true
        System.out.println(city.equalsIgnoreCase("Chiicago")); //false (it has one more character)
        System.out.println(city.equalsIgnoreCase("Chi cago"));//false (it has space)

        if(city.equals("CHICAGO")) {
            System.out.println("equals () true");
        }else{
            System.out.println("equals() false");
        }
        if(city.equalsIgnoreCase("CHICAGO")) {
            System.out.println("equalsIgnoreCase () true");
        }else{
            System.out.println("equalsIgnoreCase () false");
        }
    }

}
