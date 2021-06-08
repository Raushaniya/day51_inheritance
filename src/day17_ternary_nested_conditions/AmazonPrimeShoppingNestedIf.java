package day17_ternary_nested_conditions;

public class AmazonPrimeShoppingNestedIf {
    public static void main(String[] args) {
        double price = 10.0;
        boolean isPrimeMember = false;
        if (isPrimeMember) {
            System.out.println("Eligible for free 2 day shipping"); // if price 45 and primeMember is true, will run
        } else {
            if (price >= 25.0) {
                System.out.println("Eligible for free regular shipping"); // will run if price 195
            } else {
                System.out.println("Not eligible for free shipping.Fee = $10."); // if price $10 and primeMember is false , will run
            }


        }
    }
}