package day13_conditional_statements;

public class bonusCalculator {
    public static void main(String[] args) {
        double salesAmount = 500;
        double bonus = 0.0; // also u can declare this way: double bonus;
        if (salesAmount <= 1000) {
            System.out.println(" Good job, you qualified for bonus! ");
            bonus = 50.0;

        } else {
            System.out.println(" Great job! You are qualified for full bonus! ");
            bonus = 100.0;
        }
        System.out.println(" Your total bonus: $ " + bonus);
    }
}
