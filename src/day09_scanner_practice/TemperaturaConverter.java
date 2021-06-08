package day09_scanner_practice;
import java.util.Scanner;


public class TemperaturaConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("#######TEMPERATURE CONVERTER#######");
        System.out.println("Enter temperature: ");
        double farenheit = scan.nextDouble();
        double celsius = (farenheit - 32) * 5 /9;
        System.out.println(farenheit + " farenheit in celsius  is " + celsius);


    }
}
