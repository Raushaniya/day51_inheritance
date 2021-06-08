package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Boston";
        if (city.equals ("Moscow") || city.equals ("Tampa")) { //false or false=false
            System.out.println("Willing to relocate to " + city);
        }else{
            System.out.println("Not considering - " + city);
        }

        String teacher = "Saim";
        if (teacher.equals ("Saim") || teacher.equals ("Murodil")) {
            System.out.println(" it is a java class with " + teacher);
        }else{
            System.out.println(" Soft skill class with Nadir" + teacher);
        }

        if (teacher.equals ("Saim") || teacher.equals ("Murodil")) {
            System.out.println(" it is a java class with " + teacher);
        }else if(teacher.equals("Nadir")) {
            System.out.println(" Soft skill class with Nadir" + teacher);
        } else{
            System.out.println(" Some class with " + teacher);
        }

        String company = "Google";
        double salary = 85_000.0;
        if (company.equals("Google") || salary  >=100_000.0) {
            System.out.println("Accepting offer from  " + company);
        }else {
            System.out.println("Rejecting offer from " + company);
        }










    }
}
