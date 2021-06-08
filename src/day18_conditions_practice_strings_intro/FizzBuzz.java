package day18_conditions_practice_strings_intro;

public class FizzBuzz {
    public static void main(String[] args) {
        int num = 15;
        if(num%3==0 && num%5==0) {
            System.out.println("FIZZBUZZ");
        }else if (num%3==0){
            System.out.println("FIZZ");
        }else if (num%5==0){
            System.out.println("BUZZ");
        }else{
            System.out.println(num);
        }
    }
}
