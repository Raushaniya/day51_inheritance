package day21_string_manipulation;

public class FirstAndLastTest {
    public static void main(String[] args) {
        String word = "MOM";
        char first = word.charAt(0);
        char last = word.charAt(2);
        if (first == last) {
            System.out.println("first and last letter match"); //run
        }else{
            System.out.println("first and last letters mismatch");
        }

        if(word.charAt(0) == word.charAt(2)) {
            System.out.println("first and last letter match"); //run
        }else{
            System.out.println("first and last letters mismatch");
        }

        String name = "aziza";
        char firstLetter = name.charAt(0);
        int count = name.length(); //5 letters
        char lastLetter = name.charAt(count-1); // last letter on position 4 (5-1) ->letter a
        System.out.println(firstLetter);
        System.out.println(lastLetter);
        if(firstLetter==lastLetter) {
            System.out.println(name + "- first and last match");
        }else{
            System.out.println(name + "- first and last mismatch");
        }

    }
}
