package day21_string_manipulation;

import java.util.Locale;

public class ReplacePractice {
    public static void main(String[] args) {
        String word = "github";
        System.out.println(word.toUpperCase(Locale.ROOT));
        System.out.println(word.replace("hub","lab"));
        System.out.println("word = " + word); // word=github
        word = word.replace("hub","lab");
        System.out.println("word = " + word); // word=gitlab

        System.out.println(word.replace("i","o" ) .replace("a","i")); //gotlib

        String sentence = "java is fun";
        String withNoSpace = sentence.replace(" ","");
        System.out.println("withNoSpace = " + withNoSpace); //removed space in sentences

        System.out.println(sentence.replace("java","selenium").replace("fun","a lot of fun"));

        String result = "1-48 of over 4,000 results for java book";
        result= result.replace("1-48 of over","")
                .replace(",","")
                .replace("results for java book","");
        System.out.println("result = " + result);

        int count = Integer.parseInt(result);
        count++;
        if(count>0) {
            System.out.println("Search success");
        }


    }

}
