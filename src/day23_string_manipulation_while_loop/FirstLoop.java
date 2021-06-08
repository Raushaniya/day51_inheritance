package day23_string_manipulation_while_loop;

public class FirstLoop {
    public static void main(String[] args) {
        int i = 1;
        while(i<=5){
            System.out.println(i); // 1 -> while keep checking many times
            i++; // 1 2 3 4 5
        }

        //infinite loop
        while(true) {     //condition is always true
            System.out.println("hello world");
        }

    }
}
