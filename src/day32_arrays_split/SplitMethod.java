package day32_arrays_split;
import java.util.*;
public class SplitMethod {
    public static void main(String[] args) {
        //                0    1       2      3
        String words = "java:python:selenium:html";
        String[] wordsArray = words.split(":");
        System.out.println(Arrays.toString(wordsArray));
        System.out.println("length of array= " + wordsArray.length);

        for(String each : wordsArray) {
            System.out.println(each);
        }
//                          0    1  2   3     4    5
        String sentence = "today I am coding java arrays";
        String[] sentenceArray = sentence.split(" ");
        System.out.println("first word is= " + sentenceArray[0]);//will find 1 word in sentence
        System.out.println("first word is= " + sentence.split(" ")[0]); //will find 1 word in sentence with Split method
        System.out.println(Arrays.toString(sentenceArray));
        System.out.println("length of sentence= " + sentenceArray.length);

        for(String each : sentenceArray){
            System.out.println(each);
        }

    }
}
