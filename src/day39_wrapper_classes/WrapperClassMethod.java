package day39_wrapper_classes;

public class WrapperClassMethod {
    public static void main(String[] args) {
        System.out.println(Integer.max(10,5));
        System.out.println(Integer.sum(50,35));
        System.out.println(Integer.min(34,8));
        System.out.println("MIN INT= " + Integer.MIN_VALUE);
        System.out.println("MAX INT= " + Integer.MAX_VALUE);

        System.out.println(Double.max(234.4,23.9));

        System.out.println(Character.isLetter('r'));
        System.out.println(Character.isLetter('9'));
        char letter = 'A';
        if(Character.isUpperCase(letter)){
            System.out.println("it is uppercase");
        }
        String word ="Java is FuN";
        for(int i=0;i< word.length();i++){
            if(Character.isLowerCase(word.charAt(i))){
                System.out.print(word.charAt(i));
            }
        }
        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);



    }
}
