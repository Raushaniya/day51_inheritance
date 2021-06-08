package day17_ternary_nested_conditions;

public class TernaryExamples {
    public static void main(String[] args) {
        int score = 88;
        String result = (score>60) ? "pass" : "fail";           // int score1 = 75;
        System.out.println("result = " +result);                // String result1;
                                                                // if (score1 > 60) {
        //    ternary example                                   // result1 = "Pass";
                                                                // }else{
                                                                 // result1 = "Fail";
                                                                  //  }
                                                                  // soutv ("result: " + result1);

        String quality = "good";
        int x = (quality.equals("good")) ? 100 : 0;
        System.out.println(quality.equals("good") ? 100 : 0);
        System.out.println("rating = " + x);

        int score1 = 100;
        char grade = (score>90) ? 'A' : 'B';             // if (score>90) {
        System.out.println("grade = " + grade);         // grade = 'A';
                                                        // }else{
                                                        // grade = 'B';
                                                        // }




        String evenOdd = (score%2==0) ? "even" : "odd";
        System.out.println(evenOdd);

    }
}
