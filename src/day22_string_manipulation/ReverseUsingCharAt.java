package day22_string_manipulation;
import java.lang.*;

public class ReverseUsingCharAt {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word.charAt(3));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(3) + " " + word.charAt(2) + " " + word.charAt(1) + " " + word.charAt(0));//avaj
        // also ("" + word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0));-> avaj

        String word2 = word.charAt(3) + " " + word.charAt(2) + " " + word.charAt(1) + " " + word.charAt(0);
        System.out.println("word = " + word); //word=java
        System.out.println("word2= " + word2); //word2 = avaj

        if (word.equalsIgnoreCase(word2)) {
            System.out.println("Palindrome word");
        }else{
            System.out.println(" not palindrome word"); //run
        }


    }
}
