package day30_arrays;

public class ArrayLoopWithConditions {
    public static void main(String[] args) {

        double[] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};

        String[] countries = {"Brazil",
                "China",
                "Cuba",
                "Sweden",
                "France",
                "Vietnam",
                "Albania",
                "Brazil",
                "Portugal",
                "Kazakhstan",
                "Philippines",
                "Philippines",
                "Iran",
                "Philippines",
                "China",
                "Armenia",
                "Philippines",
                "China",
                "Colombia",
                "Philippines",
                "Honduras",
                "Indonesia",
                "Brazil",
                "China",
                "United States",
                "Russia"};

        // print all numbers from prices array that are more than 100
        System.out.println("------------PRICES MORE THAN 100-------------");
        for (double eachPrice : prices) {
            if (eachPrice > 100.0) {
                System.out.print(eachPrice + " ");
            }
        }
        System.out.println("\n----PRICES BETWEEN 10 AND 70 inclusive----");
        for (double price : prices) {
            if (price >= 10 && price <= 70) {
                System.out.print(price + " ");
            }
        }
        System.out.println("\n-----prices between more than 50-----");
        //count=7
        int count = 0;
        for (double each : prices) {
            if (each > 50) {
                count++;
            }

        }
        System.out.println("count= " + count);

        System.out.println("\n------countries with name length more than 7- inclusive------");
        for (String country : countries) {
            if (country.length() >= 7) {
                System.out.print(country + "-" + country.length()+" ");
            }

        }

    }
}
