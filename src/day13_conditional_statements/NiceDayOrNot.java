package day13_conditional_statements;
import java.util.Scanner;

public class NiceDayOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputTemp = scan.nextInt();
        if(inputTemp>=70){
            System.out.println(" It is a nice day!");
            System.out.println(" Lets code Java!");
        }else{
            System.out.println("It is kind of cold today!");
            System.out.println("Lets stay home!");

        }


    }
}
