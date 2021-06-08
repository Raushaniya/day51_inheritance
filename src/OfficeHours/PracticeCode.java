package OfficeHours;
public class PracticeCode {
    public static void main(String[] args) {
        int number = 65;
        boolean isDivisible;
            if(number % 2 ==0) {
               isDivisible = true;
                System.out.println(number + " is divisible by 2: "+isDivisible);
            } else {
                isDivisible = false;
                 System.out.println(number + " is divisible by 2: "+isDivisible);
            }

           if(number%3==0) {
                isDivisible = true;
               System.out.println(number + " is divisible by 3: "+isDivisible);
            }else{
                isDivisible = false;
                System.out.println( number + " is divisible by 3: " + isDivisible);
            }

            if(number%5==0) {
                isDivisible = true;
               System.out.println(number + " is divisible by 5: "+isDivisible);
            }else{
                isDivisible = false;
                System.out.println( number + " is divisible by 5: "+isDivisible);
            }

    }



}



