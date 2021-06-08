package day15_logicalops_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
        String location = "Nur-Sultan";
        double salary = 90_000.0;
        boolean isRemote = false;
        boolean benefits = true;


        if(location.equals ("Nur-Sultan") && salary >= 100_000.0 && isRemote && benefits) { //false
            System.out.println("Sure, I will accept this offer");
        }else{
            System.out.println("Lets consider another offer or negotiate");
        }


    }
}
