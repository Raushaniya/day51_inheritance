package day15_logicalops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true = " + (!true)); //false
        System.out.println("!false = " + (!false)); //true

        int age = 2;
        if(!(age > 7)) {
            System.out.println("Need to sit in child car seat. Age= " + age);
        }else{
            System.out.println("Can sit normal seat. Age= " + age);
        }


        boolean isSmokingAllowed = false; //yes-> true no ->false
        if (!isSmokingAllowed) {
            System.out.println("Smoking is not allowed here. Exit");
        }else{
            System.out.println(" This area for smoking");
        }

        boolean isAffordable = true;
        if (!isAffordable) {
            System.out.println("Item is Not affordable");
        }

        String env = "qa";
        if (!env.equals ("qa")) {
            System.out.println("In wrong environment for QA testing");
        }

        String carModel = "Tesla";
        if (!carModel.equals("Tesla")) {
            System.out.println("Not interested, thank you");
        }

        String secretPassword = "abc123";
        String inputPassword = "abc321";
        if (!inputPassword.equals ("abc123")) {
            System.out.println(" Incorrect password");
        }

        if (!inputPassword.equals(secretPassword)) {
            System.out.println("Incorrect password");
        }

        if (inputPassword.equals("abc123")) {
            System.out.println("Correct password");
        }else{
            System.out.println("Incorrect password");
        }
    }


}
