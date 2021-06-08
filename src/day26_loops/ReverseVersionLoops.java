package day26_loops;

public class ReverseVersionLoops {
    public static void main(String[] args) {
        String word = "application";
        for(int i=word.length()-1;i>=0;i--){
            System.out.println(word.charAt(i));
        }
    }
}
