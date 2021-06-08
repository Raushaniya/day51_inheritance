package day10_shorthand_operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int cars = 10;
        System.out.println("cars in parking lot = " + cars);
        //2 more came
        cars = cars + 2;
        System.out.println("cars in parking lot = " + cars);
        cars+=5; //equal cars = cars +5;
        System.out.println("cars in parking lot = " + cars);

        //6 cars left parking lot
        cars-=6; // equal cars = cars - 6;
        System.out.println("cars in parking lot = " + cars);

        cars-=1;
        System.out.println("cars in parking lot = " + cars);

        int electricCars = 13;
        cars = cars + electricCars;
        System.out.println("cars in parking lot = " + cars);

        //shorthand
       // cars += electricCars;
        //System.out.println("cars in parking lot = " + cars);
        
        String word = "Java";
        System.out.println("word = " + word);
        //add more words
        word = word + " programming";
        System.out.println("word = " + word);
        
        //shorthand -add is fun
        
        word+=" is fun";
        System.out.println("word = " + word);

        String selenium = " but \"selenium \" is more fun.";
        word+= selenium;
        System.out.println("word = " + word);

        word+=12345;
        System.out.println(" word = " + word);

        char letter = 'A';
        System.out.println("letter = " + letter);
        //add number
        letter +=3;
        System.out.println("letter = " + letter); //it shows letter D
        //add 1
        letter+= 1;
        System.out.println("letter = " + letter);

        double parkingFee = 7.50;
        System.out.println("normal parking fee = " + parkingFee);
        //early bird fee is 50 off
       // parkingFee = parkingFee / 2; -> long way
        parkingFee/= 2;
        System.out.println("early bird parking fee = " + parkingFee);
        parkingFee-=parkingFee; // equal -> parkingFee = parkingFee-parkingFee;
        System.out.println("weekend parking fee = " + parkingFee);


        
        



    }
}
