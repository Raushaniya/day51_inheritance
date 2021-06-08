package day12_conditional_statements;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

public class ComparisonExamples {
    public static void main(String[] args) {
        int currentSpeed = 4_5; //45
        int speedLimit = 5_5; //55
                System.out.println(currentSpeed > speedLimit); //false 45 not more 55
                System.out.println(speedLimit < currentSpeed); //false 55 not less 45
                System.out.println(speedLimit == currentSpeed); //false not equal
        boolean isSpeeding = currentSpeed > speedLimit;
                System.out.println("Are you speeding? - " + isSpeeding);
        System.out.println("currentSpeed= " + currentSpeed + " mph ");
        System.out.println("speedLimit = " + speedLimit + " mph ");

        currentSpeed += 20; //45+20 =65
        System.out.println("currentSpeed = " + currentSpeed);


        //another example

        double accountBalance = 250.25;
        double itemPrice = 300.99;
        System.out.println("can I  afford? - " + (accountBalance>= itemPrice)); // true // without parenthasis will not work
        boolean canAfford = accountBalance >= itemPrice;
        System.out.println("can afford = " + canAfford);
        //decrease balance by itemPrice,using shorthand
        //accountBalance = accountBalance - itemPrice; traditional way
        accountBalance-= itemPrice;

        boolean isBroke = accountBalance <=0;
        System.out.println("Am I broke? - " + isBroke);








    }
}
