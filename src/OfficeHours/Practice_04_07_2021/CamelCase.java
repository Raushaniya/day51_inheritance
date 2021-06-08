package OfficeHours.Practice_04_07_2021;

public class CamelCase {
    public static void main(String[] args) {
        /*
        Camel Case
Given a String of words that follow Camel Case convention. Find and print how many words are in the given String.
Every word, except the first word, begin with an uppercase letter. The other characters of the word will be lowercase
Ex:
Input: thisHasManyWordsToFind Output: 6
         */
        String str = "thisHasManyWordsToFind";//word
        int words = 1;
        String temp="";

        if(str.isEmpty()){
            words=0;
        }

        for(int i=0; i<str.length();i++) {
            temp+=str.charAt(i);

            if(str.charAt(i) >='A' && str.charAt(i)<='Z') {
                words++;
                System.out.println(temp.substring(0,temp.length()-1));
                temp="";
            }
        }
        System.out.println("Words: " + words);
    }
}
