package day21_string_manipulation;

public class StringCharAt {
    public static void main(String[] args) {
                   //  0123
        String word = "java";
        System.out.println(word.charAt(0)); //j
        System.out.println(word.charAt(1)); //a
        System.out.println(word.charAt(2)); //v
        System.out.println(word.charAt(3)); //a
      //  System.out.println(word.charAt(4)); ERROR
        System.out.println(word + "-" + word.length()); //java-4

        String company = "Cybertek";
        System.out.println("first letter: " + company.charAt(0));

        char first = company.charAt(0);
        System.out.println(first);         //C
        char second = company.charAt(1);
        System.out.println(second);        //y
        char third = company.charAt(2);
        System.out.println(third);         //b
        char fourth = company.charAt(3);
        System.out.println(fourth);       //e
        char fifth = company.charAt(4);
        System.out.println(fifth);        //r
        char sixth = company.charAt(5);
        System.out.println(sixth);        //t
        char seventh = company.charAt(6);
        System.out.println(seventh);      //e
        char eigth = company.charAt(7);
        System.out.println(eigth);       //k

        System.out.println(first+" " + second + " " +third + " " + fourth + " "
                + fifth + " " + sixth + " " + seventh + " " + eigth);  //C y b e r t e k
    }
}
