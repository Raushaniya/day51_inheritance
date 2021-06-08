package OfficeHours.Practice_03_17_2021;

public class HouseBuyer {
    public static void main(String[] args) {
        String name = "Canyon";
        double price , rating;
        boolean gated, allowsPets;

        switch(name) {
            case "Canyon":
                price = 89000;
                rating = 4.0;
                gated = false;
                allowsPets = true;
                break;
            case "Oaks":
                price = 75000;
                rating = 3.5;
                gated = false;
                allowsPets = true;
                break;
            case "Highland":
                price = 150000;
                rating = 4.5;
                gated = true;
                allowsPets = false;
                break;
            default:
                System.out.println("Invalid name");
                price = 0;
                rating = 0;
                gated = false;
                allowsPets = false;
                break;
        }
        System.out.println("name= " + name);
        System.out.println("price = " + price);
        System.out.println("gated = " + gated);
        System.out.println("allowsPets = " + allowsPets);
    }
}
