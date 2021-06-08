package day13_conditional_statements;

public class IfWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = true ;
        if(isHungry == true) {  // also other way if(isHungry)
            System.out.println("I am hungry I will go get something to eat ");
        }else{
            System.out.println(" I am not hungry, lets keep coding Java ");
        }



        double price = 250.44;
        boolean isAffordable = price <= 200.0; //200 is budget
        System.out.println("isAffordable = " + isAffordable);

        if(isAffordable ==true){   //if(isAffordable)
            System.out.println("I can afford it!");
        }else{
            System.out.println("I cannot afford it!");
        }


        boolean isRemoteJob = false;
        //if it is not remote job print "sorry im mot interested"
        // otherwise print "sure, im interested! what is interview process?"
        if(isRemoteJob != true) { //short way - if(!isRemoteJob)
            System.out.println("Sorry, I am not interested! ");
        }else{
            System.out.println("Sure, I am interested, what is interview process? ");
        }

        }
}
