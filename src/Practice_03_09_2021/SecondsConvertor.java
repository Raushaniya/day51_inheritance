package Practice_03_09_2021;

import java.util.Scanner;

public class SecondsConvertor {

    public static void main(String[] args) {
        int inputSeconds, hours, minutes, seconds;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter seconds: ");
        inputSeconds = scan.nextInt(); //3695


        // 60sec=1min
        // 60min=1hour;
        //60*60=3600


        hours = inputSeconds / 3600; //3695/3600 => 1 (no decimals)
        inputSeconds = inputSeconds % 3600; // 95
        inputSeconds %= 3600;
        minutes = inputSeconds / 60; //95/60 =1
        inputSeconds %= 60; //35
        seconds = inputSeconds;
        System.out.println(hours + " hours " + minutes + " minutes, and " + seconds + " seconds ");
    }

}
