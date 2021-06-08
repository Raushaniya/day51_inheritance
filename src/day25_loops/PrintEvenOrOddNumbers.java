package day25_loops;

public class PrintEvenOrOddNumbers {
    public static void main(String[] args) {
        System.out.println("EVEN NUMBERS: ");
        for(int n =1;n<=100;n++) {
            if(n%2==0) {
                System.out.print(n + " ");
            }

        }
        System.out.println("ODD NUMBERS: ");
        for(int k =1; k<=100; k++) {
            if(k%2!=0) {
                System.out.print(k+ " ");
            }
        }
    }
}
