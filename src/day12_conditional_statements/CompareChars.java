package day12_conditional_statements;

public class CompareChars {
    public static void main(String[] args) {
        char letter1 = 'A';
        char letter2 = 'J';
        System.out.println(letter1 == letter2); //false 65==74
        System.out.println(letter1 > letter2 ); // false 65>74
        System.out.println(letter2 > letter1); // true  74>65

        char grade = 'E';
        boolean pass = grade <= 'D';
        System.out.println("Am I pass the exam? - " + pass);






    }
}
