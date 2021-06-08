package day14_multi_branch_if_statements;

public class LogicalAndOrOperator {
    public static void main(String[] args) {
        System.out.println(true && true);   //true
        System.out.println(true && false);  //false
        System.out.println(false && true);  //false
        System.out.println(false && false); //false

        System.out.println(10>5 && 1==1); //true
        System.out.println(10>5 && 4>=20); // true and false=false
        System.out.println(10>15 && 100<56); //false+false=false

        int apples = 10, oranges = 5;
        boolean check = apples>5 && oranges>3;
        System.out.println("check = " + check); //true+true=true

        if (apples > 6 && oranges >2) {
            System.out.println("I have enough apples and oranges "); // runs enough
        }else{
            System.out.println("I need to buy more fruits");

        }

    }
}
