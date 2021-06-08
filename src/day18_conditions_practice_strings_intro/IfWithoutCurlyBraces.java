package day18_conditions_practice_strings_intro;

public class IfWithoutCurlyBraces {
    public static void main(String[] args) {
        String todayClass = "java";
        if(todayClass.equals("java"))            // when only 1 statement it will work!
            System.out.println("java is fun");
        //  System.out.println("let's code!")    // second statement will not run without curly braces{}
        else
            System.out.println("it is not java, it is - " + todayClass);


    }


}
