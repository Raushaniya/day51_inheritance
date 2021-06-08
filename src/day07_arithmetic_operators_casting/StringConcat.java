package day07_arithmetic_operators_casting;

public class StringConcat {
    public static void main(String[] args){
         System.out.println("java " + 5 + 3); // java 53 (it comes from left to right).
        System.out.println("java " + (5 + 3)); // runs java 8 cause we have parentheses "()".
        System.out.println(5 + 3 + " java "); // runs 8 java (cause it goes from
        System.out.println(5 + (3 + "java")); // runs 53java;
        System.out.println("hello" + 1 + 2 + 3); // hello123;
        System.out.println (("hello" + 1 + 2 + 3)); // hello123;
        System.out.println("hello" + (1 + 2 + 3)); // hello6

        String str1 = "hello";
        String str2 = "friends";
        System.out.println( str1 + str2 ); //hellofriends - no space
        System.out.println(str1 + " " + str2); // hello friends - with space

        int num1 = 7;
        int num2 = 8;
        System.out.println(num1 + num2); //15

        //print 7 8
        System.out.println(num1 + " " + num2); //7 8
        //78
        System.out.println(num1 + "" + num2); // runs78

        char char1 = 'a';
        char char2 = 'b';
        System.out.println(char1+char2); //runs 195
        System.out.println(char1 + "" + char2); //runs ab












    }
}
