package day06_arithmetic_operators;

public class MoreMathOperators {
    public static void main (String[] args){

        int Toyota = 431;
        int Honda = 233;
        int VW = 2;
        int Tesla = 20;
        int Nissan = 1;
        int BMW = 155;
        int totalCarsInParking = Toyota + Honda + VW + Tesla + Nissan + BMW;

        System.out.println("Toyota: " + Toyota );
        System.out.println("Honda: \t" + Honda);
        System.out.println("VW: \t" + VW );
        System.out.println("Nissan: " + Nissan);
        System.out.println("BMW: \t" + BMW);
        System.out.println(" There are " + totalCarsInParking + " cars in parking lot");

        String pizza = "hawaiian";
        int slices = 8;
        int people = 4;
        int slicesPerPerson = slices/people;
        //there are 2 slices per person
        System.out.println("There are " + slicesPerPerson + " slices per person");

        // We ordered hawaiian pizza 8 slices, 4 people ate 2 slices each.
        System.out.println("We ordered " + pizza + " pizza with " + slices + " slices," + people + " people ate " + slicesPerPerson + " slices each. ");





    }
}
