package day13_conditional_statements;
import java.util.Scanner;

public class ATMPincodeProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("******WELCOME TO TD BANK ATM******");
        System.out.println("Enter your PIN CODE");
        int inputPincode  = scan.nextInt();
        if(inputPincode == 5706) {
            System.out.println(" Welcome to your account! ");
            System.out.println(" You can withdraw, check your balance, deposits ");
        }else{
            System.out.println("Incorrect Pin Code! " + inputPincode);
            System.out.println("Please try again!");
        }
        System.out.println("Thank you for using TD BANK ATM! ");
    }
}



