package day11_comparison_operators;

public class PrePostIncrementDecrementOperators {
    public static void main(String[] args) {
        //PRE-INCREMENT ++ means increase by 1
        int num1 = 10;
        int num2 = ++num1;
        System.out.println("num2 = " + num2); //11
        System.out.println("num2 = " + num2); //11

        //POST_INCREMENT -> add 1 afterwards
        int num3 = 8; //4
        int num4 = num3; //4
        num3++; //+1 = 5
        System.out.println("num3 = " + num3); // add +1 = 9
        System.out.println("num4 = " + num4); // 8 {cause it was 8 before num++)

        int apples = 5;
        int basket = ++apples;

        System.out.println("apples = " + apples); //6
        System.out.println("basket = " + basket);//6

        int kiwi = 15;
        int kiwiBasket = kiwi++;
        System.out.println("kiwi = " + kiwi);
        System.out.println("kiwiBasket = " + kiwiBasket);

        int cars = 5;  //5
        System.out.println (++cars);  //add 1 = 6
        int sedans = 10;
        System.out.println(sedans++); //10 ( we asked print sedan first>
        System.out.println(sedans); // afterwards sedans run to 11


        int a =50;
        int b = 22;
        int c = a++ + ++b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);







    }





}
