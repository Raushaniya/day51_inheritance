package day32_arrays_split;

public class SentenceSplit {
    public static void main(String[] args) {
        String sentence = "java is fun ";
        String [] words = sentence.split(" ");
        System.out.println("1 st word = " + words[0]);
        System.out.println("2 nd word = " + words[1]);
        System.out.println("3 rd word = " + words[2]);
     //   System.out.println("4 th word = " + words[3]); // out of bounds

        for(String w : words) {
            System.out.println(w);
        }
        //                      0         1      2         3
        String go0gleResult = "About 1,810,000 results (0.68 seconds)";
        String[] results = go0gleResult.split(" ");
        System.out.println("Count = " + results[1]);
        System.out.println("Seconds = " + results[3].replace("(","")); //seconds=0.68
        System.out.println("Seconds = "+ results[3].substring(1));// seconds=0.68


    }
}
