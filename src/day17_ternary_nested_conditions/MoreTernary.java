package day17_ternary_nested_conditions;

import javax.lang.model.SourceVersion;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate = 50;
        String reply = (hourlyRate>45) ? "accept" : "reject";
        System.out.println("reply = " + reply);

        String todayClass = "java";
        String teacher = (todayClass.equals ("java")) ? "Murodil/Saim" : " Nadir";
        System.out.println("Today's teacher = " + teacher);


        boolean isEligibleToDrive = true;
        String driving = (isEligibleToDrive) ? "yes, have DL and Can Drive " : " No DL, cannot drive";
        System.out.println("Is eligible to drive = " + driving);
        // for boolean -> (isEligibleToDrive) ?
    }




}
