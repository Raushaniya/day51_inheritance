package day16_switch_ternary;

public class Elevator {
    public static void main(String[] args) {


        int floorNum = 1;
        if (floorNum == 1) {
            System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
        } else if (floorNum == 2) {
            System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
        } else if (floorNum == 3) {
            System.out.println("Floor 3 is selected. Companies: Lyft, Microsoft, Bank of America ");
        }else{
            System.out.println(" Invalid floor: " + floorNum);
        }

        System.out.println("*******Switch Statement Version********");

        floorNum = 4;

        switch (floorNum) {
            case 1:
                System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
                break; // exit switch
            case 2:
                System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
                break;  // exit switch
            case 3:
                System.out.println("Floor 3 is selected. Companies: Lyft, Microsoft, Bank of America ");
                break;
            default:
                System.out.println(" Invalid floor: " + floorNum);
        }
    }
}