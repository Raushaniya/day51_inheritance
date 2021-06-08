package day06_arithmetic_operators;

public class CarDriverInfo {
    public static void main(String[] args){
        String carModel = "GMC Acadia";
        String driverName = "Rau Vega";
        String licenseNum = "LetsMakeJavaGreat";
        int speed = 300;
        boolean isAutomatic = true;
        char licenseClass = 'A';

        System.out.println("Model: \t\t\t"+ carModel);
        System.out.println("Driver Name: \t" + driverName);
        System.out.println("License Number: "+ licenseNum);
        System.out.println("Speed: \t\t\t" + speed);
        System.out.println("Automatic? - \t" + isAutomatic);
        System.out.println("License Class: \t" + licenseClass);
        System.out.println("Current speed: \t" + speed + " mph ");

        //Rau Vega is driving GMC Acadia
        System.out.println(driverName+ " is driving "+ carModel);
        //Current speed is: 55 mph



        ;


    }
}
